package com.Arrays.in;

import java.util.Arrays;

public class Searching_in_2D_Arrays {
    static int binarysearch(int []arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return -1;
    }
    static int [] search(int[][] array, int target) {
      int rows=array.length;
      int cols=array[0].length;
      for(int i=0;i<rows;i++){
          for(int j=0;j<cols;j++){
              if(array[i][j]==target){
                  return new int[]{i,j};
              }
          }
      }
      return new int[]{-1,-1};
    }
    static int [] sorted2Darray(int [][] array,int target){
        int rowlow=0;
        int rowhigh=array.length-1;
        int row=array.length-1;
        int col=array[0].length-1;
        while(rowlow<=rowhigh){
            int midrow=(rowlow+rowhigh)/2;
            if(target>=array[midrow][0] && array[midrow][col]>=target){
                int column=binarysearch(array[midrow],target);
                if (column != -1)
                    return new int[]{midrow, column};

                return new int[]{-1, -1};
            }
            else if(target>array[midrow][col]){
                rowlow=midrow+1;
            }
            else{
                rowhigh=midrow-1;
            }
        }
        return new int[]{-1,-1};
    }

    static int [] rowwisesorted2Darray(int [][] array,int target){
        int rowlow=0;
        int rowhigh=array.length-1;
        int col=array[0].length-1;
        while(rowlow<=rowhigh){
            int rowmid=(rowlow+rowhigh)/2;
            if(target>=array[rowmid][0] && array[rowmid][col]>=target){
                int column=binarysearch(array[rowmid],target);
                if (column != -1){
                    return new int[]{rowmid, column};
                }
                return new int[]{-1, -1};
            }
            else if(target>array[rowmid][col]){
                rowlow=rowmid+1;
            }
            else {
                rowhigh=rowmid-1;
            }

        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
//        int[][] arr = {
//                {10, 20, 30},
//                {40, 50, 60},
//                {70, 80, 90}
//        };
       /* int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };*/
        int[][] arr = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int [] result = search(arr, 2);
        System.out.println(Arrays.toString(result));
    }
}
