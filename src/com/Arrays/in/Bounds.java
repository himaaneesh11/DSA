package com.Arrays.in;

public class Bounds {
    static int LowerBound(int [] arr,int target){
        int low=0;
        int high=arr.length-1;
        int pos=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=target){
                pos=mid;
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
        }
        return pos;
    }
    static int UpperBound(int [] arr,int target){
        int low=0;
        int high=arr.length-1;
        int pos=arr.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>target){
                pos=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return pos;
    }
    public static void main(String [] args){
        int [] arr={2,4,4,6,8};
        int result=UpperBound(arr,4);
        System.out.println("The Upper bound index is "+result);

    }
}
