/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bford;
import java.util.Scanner;


/**
 *
 * @author Anusha
 */
public class BFord {
    
    int max = 999;
    /**
     * @param args the command line arguments
     */
    public static void BellmanFordEval(int sn,int c[][],int d[],int n)
    {
        int max = 999;
        int u,v,vertices;
        for(u=1;u<=n;u++){
            d[u] = max; // except source all others are at infinity
            //shortest path from source to all other vertex initially is at innfinity
        }
        d[sn]=0; // assign 0 for source //distance from source to source
        for(u=1;u<=n;u++){
            for(v=1;v<=n;v++){
                if(c[u][v]!=0){
                    if(d[v]>d[u]+c[u][v]){
                        d[v] = d[u] + c[u][v];
                    }
                }
            }
        }
        
        //checking negative edge
        for(u=1;u<=n;u++){
            for(v=1;v<=n;v++)
            {
                if(c[u][v]!=0){
                    if(d[v]>d[u]+c[u][v]){
                        System.out.print("It contains negative edge");
                    }
                }
            }
        }
        
        for(vertices=1;vertices<=n;vertices++){
            System.out.println("The distance from " + sn + "to" + vertices + "is" + d[vertices]);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int n,sn,i,j;
      
        
        System.out.println("Enter the no of vertices");
        n = scanner.nextInt();
        int c[][] = new int[n+1][n+1];
        System.out.println("Enter adjacency matrix");
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                c[i][j] = scanner.nextInt();
                if(i==j){
                    c[i][j] =0; //to avoid neg weight avoid self loop
                    continue;
                }
            }
        }
        
        System.out.println("Enter the source vertex");
        sn = scanner.nextInt();
        int d[] = new int[n+1];// it will store shortest path from source to every other vertex
        BellmanFordEval(sn,c,d,n);
        
    }
    
}
