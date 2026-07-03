import java.util.Scanner;

public class Lower_Bound {
    static int LowerBound(int [] arr,int key){
        int low=0;
        int high=arr.length-1;
        if(key>arr[high]){
            return arr.length;
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=key){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int key;
        System.out.println("Enter the key");
        key=input.nextInt();
        int [] arr={1,2,4,5,10,15,19,19,50};
        int result=LowerBound(arr,key);
        System.out.println("Index is :  "+result);
    }
}
