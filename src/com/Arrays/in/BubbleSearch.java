package com.Arrays.in;

import java.util.Arrays;

public class BubbleSearch {
    static void bubblesort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int flag=0;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    flag=1;
                }
            }
            if(flag==0){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int [] arr={2,6,7,3,4,5,8,9};
        bubblesort(arr);

    }
}
