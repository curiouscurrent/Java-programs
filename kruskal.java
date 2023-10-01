/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bford;
import java.util.Scanner;

/**
 *
 * @author Anusha
 */
public class kruskal {
    final static int MAX = 20;
    static int n; //no of vertices of G 
    static int cost[][]; // cost matrix
    static int parent[] = new int[9];// parent array
    static Scanner scan = new Scanner(System.in);
    
    static void ReadMatrix(){
        int i,j;
        cost = new int[MAX][MAX];
        System.out.println("\n Enter the no of nodes");
        n = scan.nextInt(); // n= 5 
        // loop till no of edges = n-1 
        System.out.println("Enter the cost adjacency matrix");
        for(i=1;i<=n;i++)
            for(j=1;j<=n;j++)
            {
                cost[i][j] = scan.nextInt();
                if(cost[i][j]==0)
                    cost[i][j] = 999;
            }
        
    }
    
    static int find(int i){
        while(parent[i] > 0)
            i= parent[i];
        return i;
    }
    
    static void uni(int i,int j){ //makiing one as parent to form an edge
        parent[j] = i;
    }
    
    static void Kruskals(){
        int a=0,b=0,u=0,v=0;
        int i,j,ne=1,min,mincost=0;
        System.out.println("The edges of min cost spanning tree are");
        while(ne<n){
            for(i=1,min=999;i<=n;i++){
                for(j=1;j<=n;j++){
                    if(cost[i][j]<min){
                        min = cost[i][j];
                        a = u = i;
                        b = v = j;
                        u = find(u);
                        v = find(v); }}}
                        if(u!=v){
                            uni(u,v); //edge formation
                            System.out.println(ne++ + "edge("+a + "," + b + ")=" + min);
                            mincost += min;
                            
                        }
                            cost[a][b] = cost[b][a] = 999;
                            
                    
        }//end while
        
        System.out.println("Minimum cost: " + mincost);
        
    }//end kruskals
    
    public static void main(String[] args)
    {
        ReadMatrix(); // to read the inputs
        Kruskals(); // to construct minimum spanning tree
    }
}
