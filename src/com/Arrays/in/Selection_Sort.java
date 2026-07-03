package com.Arrays.in;

import java.util.Arrays;

public class Selection_Sort {
    static void selectionsort(int [] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minindex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
        }
    }
    public static void main(String[] args) {
        int [] arr={2,6,7,3,4,5,8,9};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
