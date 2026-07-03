package com.Arrays.in;

import java.util.Arrays;

public class Insertion_Sort {
    static void insertionsort(int [] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int temp=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String [] args){
        int [] arr={2,6,7,3,4,5,8,9};
        insertionsort(arr);
    }
}
