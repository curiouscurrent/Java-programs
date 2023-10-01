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
public class prims {
    final static int MAX = 20;
    static int n; // No of vertices of G
    static int cost[][]; // cost matrix
    static Scanner scan = new Scanner(System.in);
    
    static void ReadMatrix(){
        int i,j;
        cost = new int[MAX][MAX];
        System.out.println("Enter the no of nodes");
        n = scan.nextInt(); //n=4
        System.out.println("Enter the adjacency matrix");
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                cost[i][j] = scan.nextInt();
                if(cost[i][j]==0)
                    cost[i][j] = 999;
            }
        }
    }
    
    static void Prims(){
        int visited[] = new int[10]; //array of visited vertices
        int ne=1,i,j,min,a=0,b=0,u=0,v=0;
        
        int mincost = 0;
        visited[1] = 1;
        
        while(ne<n){
            for(i=1,min=999;i<=n;i++){
                for(j=1;j<=n;j++){
                    if(cost[i][j] < min)
                    {
                        if(visited[i] !=0) // its a visited vertex
                        {
                            min = cost[i][j];
                            a = u = i;
                            b = v = j;
                        }
                    }
                }
            }
            
            if(visited[u]==0 || visited[v]==0){
                System.out.println("Edge" + ne++ + ":{" + a + "," + b
                + ")" + "cost:" + min);
                mincost += min;
                visited[b] = 1;
            }
            cost[a][b] = cost[b][a]=999; //once visited make it 999
        }
        
        System.out.println("Minimumm cost: " + mincost);
    }//Prims method ends 
    
    public static void main(String[] args){
        ReadMatrix(); // to read the inputs
        Prims(); // to construct minimum spanning tree
    }
    
}
