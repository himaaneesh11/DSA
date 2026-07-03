package LeetCode;

import java.util.Scanner;

public class Leetcode_34 {
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
    static int UpperBound(int [] arr,int target){
        int low=0,high=arr.length-1;
        int ub=arr.length;
        while(high>=low){
            int mid=low+(high-low)/2;
            if(arr[mid]>target){
                ub=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ub-1;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr={5,7,7,8,8,10};
        int target;
        System.out.println("Enter the target value :");
        target=input.nextInt();
        int lb=LowerBound(arr,target);
        int ub=UpperBound(arr,target);
        if (lb==arr.length || arr[lb]!=target){
            System.out.println("[-1,-1]");
        }
        else{
            System.out.println("["+lb+","+ub+"]");
        }

    }
}
