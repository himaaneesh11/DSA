package com.Arrays.in;

import java.util.Scanner;

public class Binary_Search {
    static int BinarySearch(int [] arr ,int key){
        int low = 0;
        int high = arr.length-1;
        while(low<=high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
    static int orderAgnosticBinarySearch(int [] arr,int key){
        int low = 0;
        int high = arr.length-1;
       boolean isAscending = arr[low]<arr[high];
        while(low<=high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if(isAscending){
            if (arr[mid] > key) {
                    low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
            else{
                if (arr[mid] < key) {
                high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            }
        return -1;
    }
    static int BinarySearchDesc(int [] arr ,int key){
        int low = 0;
        int high = arr.length-1;
        while(low<=high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {

                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr={9,10,13,15,17,27,29,45};
        int [] arr1={99,76,65,55,43};
        int target;
        System.out.println("Enter the value of target element :");
        target=input.nextInt();
//
        int found=BinarySearchDesc(arr1,target);
        if(found!=-1){
            System.out.println("Element found at index : "+found);
        }
        else{
            System.out.println("Element not found");
        }
    }
}
