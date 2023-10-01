/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bford;
import java.util.*;

/**
 *
 * @author Anusha
 */
public class hamilton {
    private static int[] x; // to store paths of cycles
    
    private static void findHamiltonianCycles(int[][] G,
            int n,int k){
        while(true){
            nextVertex(G,n,k);
            if(x[k]==0){
                return;
            }
            if(k==n){ //solution found
                System.out.println("\n");
                for(int i=1;i<=n;i++){
                    System.out.print(x[i] + "-->");
                }
                System.out.print(x[1]);
            }else{
                findHamiltonianCycles(G,n,k+1);
            }
        }
    }
    
    private static void nextVertex(int[][] G,int n,int k){
        while(true){
            x[k] = (x[k]+1) % (n+1);
            if(x[k]==0){
                return;
            }
            if(G[x[k-1]][x[k]] !=0){
                int j; //if node is previously visited or not
                for(j=1;j<=k;j++){
                    if(x[j] == x[k]){
                        break;
                    }
                }
                
                if(j==k){
                    if((k<n) || ((k==n) && (G[x[n]][x[1]]!=0)))
                            return;
                }
            }
        }
    }
     
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the no of vertices of the graph");
        int n = read.nextInt();
        
        int[][] G = new int[n+1][n+1]; 
        x = new int[n+1];
        
        System.out.println("Enter the path adjacency matrix");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                G[i][j] = read.nextInt();
            }
        }
        
        x[1] = 1;//first vertex is 1
        System.out.println("Hamiltonian cycles are");
        findHamiltonianCycles(G,n,2); //k=2 is passed
    }
}
