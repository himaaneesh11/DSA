package com.Arrays.in;

import java.util.Scanner;

public class Linear_Search {
    static int linearsearch(int [] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    static int Bi_DirectionalSearch(int [] arr,int key){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            if(arr[left]==key){
                return left;
            }
            if(arr[right]==key){
                return right;
            }
            left++;
            right--;
        }
        return -1;
    }
    static int Transportation(int [] arr,int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                if (i > 0) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    return i - 1;
                }
                return i;

            }
        }
        return -1;
    }


    static int Move_to_front(int [] arr,int key){
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                int temp=arr[i];
                arr[i]=arr[0];
                arr[0]=temp;
                return 0;
            }
            return i;
        }
        return -1;
    }

    static int Sentinel_search(int [] arr,int key){
        int n=arr.length;
        int last=arr[n-1];
        arr[n-1]=key;
        int i=0;
        while(arr[i]!=key){
            i++;
        }
        arr[i]=last;
        if(i<n-1 || arr[n-1]==key){
            return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr={1,45,6,7,4,18,19};
        System.out.println("Enter value of key element : ");
        int key;
        key=input.nextInt();
        int found=Bi_DirectionalSearch(arr,key);
//        int found=Move_to_front(arr,key);
//        int found=Transportation(arr,key);

//        int found=linearsearch(arr,key);
        if(found != -1){
            System.out.println("Element found at index : "+found);
        }
        else{
            System.out.println("Element not found");
        }

    }
}
