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
public class Floyyyd {
    static final int MAX = 20;
    static int a[][]; // cost matrix
    static int n;
    
    public static void main(String args[]){
        a = new int[MAX][MAX];
        ReadMatrix();
        Floyds(); // to find all pairs shortest path
        PrintMatrix();
    }
    
    public static void ReadMatrix(){
        System.out.println("Enter the no of vertices");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        
        System.out.println("Enter the cost matrix");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                a[i][j] = scanner.nextInt();
            }
        }
        
    }
    
    public static void Floyds(){
        for(int k=1;k<=n;k++){ //k is the intermediate vertex
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if((a[i][k] + a[k][j]) < a[i][j]){
                        a[i][j] = a[i][k] + a[k][j];
                    }
                }
            }
        }
    }
    
    public static void PrintMatrix(){
        System.out.println("All pairs shortest path matrix is :\n");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
    
}
