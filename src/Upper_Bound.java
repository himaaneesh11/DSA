import java.util.Scanner;

public class Upper_Bound {
    static int UpperBound(int [] arr,int key){
        int low=0;
        int ub=arr.length;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>key){
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
        int key;
        System.out.println("Enter the key");
        key=input.nextInt();
        int [] arr={1,2,4,10,15,15,20};
        int result=UpperBound(arr,key);
        System.out.println(" Upper Index is :  "+result);

    }
}
