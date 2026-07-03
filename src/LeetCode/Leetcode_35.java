package LeetCode;

import java.util.Scanner;

public class Leetcode_35 {
    static int LowerBound(int [] arr,int target){
        int low=0,high=arr.length-1;
        while(high>=low){
            int mid=low+(high-low)/2;
            if(arr[mid]>=target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr={1,3,5,6};
        int target;
        System.out.println("Enter the target value :");
        target=input.nextInt();
        int position=LowerBound(arr,target);
        System.out.println(position);
    }
}
