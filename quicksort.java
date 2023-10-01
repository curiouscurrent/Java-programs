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
public class quicksort {
    
    public static int partition(int arr[],int low,int high){
        int pivot = arr[high]; // considering last element as pivot
        int i = low-1;//initially lets consider there is no element
        //less than pivot
        //now we traverse the array to find the elements 
        //lesser and greater than pivot
        for(int j=low;j<high;j++){
            if(arr[j] < pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap with pivot
        i++;
        int temp  = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i; // pivot index
        
    }
    
    public static void quickSort(int arr[],int low,int high){
        if(low < high){
            int pidx = partition(arr,low,high);//finding pivot index
            
            //before pivot element
            quickSort(arr,low,pidx-1);
            //after pivot element
            quickSort(arr,pidx+1,high);
        }
    }
    
    public static void main(String args[]){
//        int[] arr = {6,3,9,5,2,8};
          Random rand = new Random();
          long startTime,endTime,elapsedTime;
          
          for(int n=5000;n<=100000;n+=5000){
              int[] arr = new int[n];
          
          
            for(int i=0;i<n;i++){
                arr[i] = rand.nextInt(1000000);
            }
          
            startTime = System.nanoTime();
            quickSort(arr,0,n-1);
            endTime = System.nanoTime();
            elapsedTime = endTime-startTime;
        
            System.out.println("Array size" + n + "Time taken :" + elapsedTime/1000000.0);
            System.out.println("Sorted array:");
            System.out.println(Arrays.toString(arr));
        
        
        
    }
    }
    
}
