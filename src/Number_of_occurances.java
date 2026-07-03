import java.util.Scanner;
public class Number_of_occurances {
    static int LowerBound(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    static int UpperBound(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int ub=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                ub=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ub;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr={2,3,5,7,7,7,7,9,11,13,15};
        int target;
        System.out.println("Enter the value to find occurances :");
        target=input.nextInt();
        int lb=LowerBound(arr,target);
        int ub=UpperBound(arr,target);
        System.out.println(lb+" "+ub);
        if(lb==arr.length || arr[lb]!=target){
            System.out.println("The element is not in the array");
        }


        else{
            System.out.println("The element repeated : "+(ub-lb));
        }
    }

}
