/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bford;

/**
 *
 * @author Anusha
 */
public class mergesort {
    
    public static void conquer(int arr[], int si,int mid,int ei){
        int merged[] = new int[ei-si+1]; //5-0+1
        int idx1 = si;// 3|6|9
        int idx2 = mid+1; // 2|5|8
        int x = 0; // for merged array
        
        while(idx1 <= mid && idx2 <=ei){
            if(arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            }else{
                merged[x++] = arr[idx2++];
            }
        }
        
        while(idx1 <= mid){
            //remaining elements in first array 
            merged[x++] = arr[idx1++];
        }
        
        while(idx2 <= ei){
            merged[x++] = arr[idx2++];
        }
        
        //copying elements of merged array into original
        for(int i=0,j=si; i<merged.length;i++,j++){
            arr[j] = merged[i];
        }
    }
    
    public static void divide(int arr[],int si,int ei){
        if(si >=ei){ //single element or entire array is traversed
            return;
        }
        
        int mid = si + (ei - si)/2; // 0+5/2 = 2
         divide(arr,si,mid); //0 to 2
       divide(arr,mid+1,ei); //3 to 5
        conquer(arr,si,mid,ei);
        
    }
    public static void main(String args[]){
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;
        
        divide(arr,0,n-1); // 0 and 5
        //print
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
