package LeetCode;

import java.util.Scanner;

public class Floor_ceil_number {
    static int Floor_fun(int [] arr,int target){
        int low=0;
        int high=arr.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(target<arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low-1;
    }


    static int Ceil(int [] arr,int target){
        int low=0;
        int high=arr.length-1;
        int ub=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                ub=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return ub;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr={2,3,5,7,9,11,13,15};
        System.out.println("Enter number to find Floor : ");
        int n = input.nextInt();
        int result=Floor_fun(arr,n);
        int result1=Ceil(arr,n);
        if(result == -1)
            System.out.println("Floor does not exist");
        else
            System.out.println("Floor = " + arr[result]);

        if(result1 == arr.length)
            System.out.println("Ceil does not exist");
        else
            System.out.println("Ceil = " + arr[result1]);

    }
}
