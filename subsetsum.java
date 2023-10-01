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
//public class subsetsum {
//    
//    public static int countSubsets(int[] ar,int sum,int i){
//        if(sum==0){
//            return 1;
//        }
//        if(sum < 0){
//            return 0;
//        }
//        if(i==ar.length){
//            return 0;
//        }
//        
//        return countSubsets(ar,sum-ar[i],i+1) +
//                countSubsets(ar,sum,i+1);
//    }
//    
//    public static void main(String[] args){
//        int[] ar = {20,10,15,5};
//        System.out.println(countSubsets(ar,25,0));
//    }
//}

public class subsetsum{
    
    public static int countSubsets(int[] ar,int sum,int i,
            ArrayList<Integer> currentSubset){
        if(sum==0){ //found valid solution
            System.out.println(currentSubset);
            return 1;
        } //found invalid solution
        if(sum < 0 || i==ar.length){
            return 0;
        }
        
        //include current element means
        //pick element and append to current subset
        currentSubset.add(ar[i]);
        int includeCount = countSubsets(ar,sum-ar[i],i+1,currentSubset);
        
        //not picking element
        //exclude the current element from subset
        currentSubset.remove(currentSubset.size() -1 );
        int excludeCount = countSubsets(ar,sum,i+1,currentSubset);
        
        return includeCount + excludeCount;
        
        
        
    }
    
    public static void main(String[] args){
        int[] ar = {1,2,4,5,7};
        ArrayList<Integer> currentSubset = new ArrayList<>();
        System.out.println("Count of subsets with sum" + 
                countSubsets(ar,7,0,currentSubset));
    }
}
