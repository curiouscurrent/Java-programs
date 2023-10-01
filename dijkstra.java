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
public class dijkstra {
    final static int MAX = 20;
    final static int infinity = 999;
    static int n; //no of vertices of G
    static int a[][]; // cost matrix
    static Scanner scan = new Scanner(System.in);
    
    static void ReadMatrix(){
        a = new int[MAX][MAX];
        System.out.println("Enter the no of vertices:");
        n = scan.nextInt(); // n=5
        System.out.println("Enter the cost adjacency matrix");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                a[i][j] = scan.nextInt();
            }
        }
    }
    
    
    
    static void Dijkstras(int s){
        int S[] = new int[MAX];//to store visited vertex
        int d[] = new int[MAX]; // to store distance from source vertex
        
        int u,v;
        int i;
        for(i=1;i<=n;i++){
            S[i] = 0;
            d[i] = a[s][i];
        }
        S[s]=1; // source vertex is visited
        d[s] = 0; //distance from source to source is 0;
        
        i=2; //since 1 is already visited
        
        
        
        while(i<=n){
            u = Extract_min(S,d); //u=2
            S[u] = 1; //S[2] =1 
            i++;
            for(v=1;v<=n;v++){
                if((d[u]+a[u][v] < d[v]) && (S[v] == 0)){ //unvisited and min cost
                    d[v] = d[u] + a[u][v];
                }
            }
        }
        
        for(i=1;i<=n;i++){
            if(i!=s) //if its not the source vertex print the 
                //distance from source to the other vertices
                System.out.println(i+ ":" + d[i]);
        }
    }//end of Dijkstras
    
        private static int Extract_min(int S[], int d[]){
        int i,j=1,min;
        min = infinity; // min = 999;
        for(i=1;i<=n;i++){
            if((d[i] < min) && (S[i]==0)){ //min cost and unvisited
                min = d[i];
                j = i; // the value of i in which we got this min cost
                // the vertex in which we got the min cost
            }
            
        }
        return (j); // return 2;
    }
    
    public static void main(String[] args){
        ReadMatrix();
        int s=0; //starting vertex
        System.out.println("Enter starting vertex: ");
        s = scan.nextInt(); // starting vertex s=1 //source vertex
        Dijkstras(s);// find shortest path
        
    }
}
