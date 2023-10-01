package bford;
import java.util.*;


public class mergesort3way {

    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int n = arr.length;
        int mid1 = n / 3;
        int mid2 = 2 * n / 3;

        int[] left = Arrays.copyOfRange(arr, 0, mid1);
        int[] middle = Arrays.copyOfRange(arr, mid1, mid2);
        int[] right = Arrays.copyOfRange(arr, mid2, n);

        mergeSort(left);
        mergeSort(middle);
        mergeSort(right);

        merge(arr, left, middle, right);
    }

    public static void merge(int[] arr, int[] left, int[] middle, int[] right) {
        int i = 0, j = 0, k = 0;
        int[] temp = new int[arr.length];

        while (i < left.length || j < middle.length || k < right.length) {
            int minLeft = (i < left.length) ? left[i] : Integer.MAX_VALUE;
            int minMiddle = (j < middle.length) ? middle[j] : Integer.MAX_VALUE;
            int minRight = (k < right.length) ? right[k] : Integer.MAX_VALUE;

            if (minLeft <= minMiddle && minLeft <= minRight) {
                temp[i + j + k] = minLeft;
                i++;
            } else if (minMiddle <= minLeft && minMiddle <= minRight) {
                temp[i + j + k] = minMiddle;
                j++;
            } else {
                temp[i + j + k] = minRight;
                k++;
            }
        }

        for (int l = 0; l < temp.length; l++) {
            arr[l] = temp[l];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };
        mergeSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

