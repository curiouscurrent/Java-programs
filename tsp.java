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
public class tsp {
    static int MAX = 100;
    static final int infinity = 999;
    
    public static void main(String[] args){
        int cost = infinity;
       
        //cost matrix
        int c[][] = new int[MAX][MAX];
        //optimal tour
        int tour[] = new int[MAX];
        
        int n;//max cities
        System.out.println("Enter no of cities");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        
        System.out.println("Enter cost matrix");
        for(int i=0; i<n;i++)
            for(int j=0;j<n;j++){
                c[i][j] = scanner.nextInt();
                if(c[i][j]==0)
                    c[i][j] = 999;
                
            }
        
        for(int i=0;i<n;i++)
            tour[i] = i;
        
        cost = tspdp(c,tour,0,n);
        //print min cost and optimal tour
        System.out.println("Minimum tour cost is "+ cost);
        System.out.println("Optimal tour is :");
        for(int i=0;i<n;i++)
            System.out.print(tour[i] + " -> ");
        System.out.print(tour[0] + "\n"); //returns back to where it started
        
        
    }
    
    static int tspdp(int c[][],int tour[],int start,int n){
        int i,j;
        //stores the sequence to be visited
        int temp[] = new int[MAX];
        int mintour[] = new int[MAX];
        int mincost;
        int cost;
        
        if(start == n-2) //branch out same node
            return c[tour[n-2]][tour[n-1]] +
                    c[tour[n-1]][0];
        
        
        mincost = infinity;
        
        for(i=start+1;i<n;i++){
            for(j=0;j<n;j++)
                temp[j] = tour[j];
        
        
        temp[start+1] = tour[i];
        temp[i] = tour[start+1];
        if(c[tour[start]][tour[i]] + 
                (cost = tspdp(c,temp,start+1,n))<
                mincost){
            mincost = c[tour[start]][tour[i]] + cost;
            //if there is a mincost 
            //there must be a mintour
            for(j=0;j<n;j++)
                mintour[j] = temp[j];
            
        }
    }
    
        //mintour will be assigned to the 
        //optimal tour
        
        for(i=0;i<n;i++){
            tour[i] = mintour[i];
        
        
        
    }
        return mincost;
    }
        
        
    
}
