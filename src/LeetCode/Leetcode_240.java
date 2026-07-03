package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class Leetcode_240 {
    static int[] rowSearch(int [][] arr,int target){
        int rows=arr.length;
        int cols=arr[0].length;
        int i=0;
        int j=cols-1;
        while (i<rows&&j>=0){
            if(arr[i][j]==target){
                return new int[]{i,j};
            }
            else if(arr[i][j]>target){
                j--;
            }
            else{
                i++;
            }
        }        return new int[]{-1,-1};

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = {{1, 4,7,11}, {2,5,8,12}, {3,6,9,16}};
        System.out.println("Enter the target number :");
        int target = input.nextInt();
        int[] result = rowSearch(arr, target);
        if (result[0] == -1 && result[1] == -1) {
            System.out.println("Invalid target");
        } else {
            System.out.println(Arrays.toString(result));
        }

    }
}
