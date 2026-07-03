package com.Arrays.in;

import java.util.Arrays;
import java.util.Scanner;

public class Operations_in_arrays {
//    static void traversal(int [] arr){
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
    static void insert_at_beggining(int [] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element to add in the array :");
        int key=sc.nextInt();
        int size=0;
        for(int num :arr){
            if(num!=0){
                size++;
            }
            else {
                break;
            }
        }
        for(int i=size;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=key;
        size++;
        System.out.println((Arrays.toString(arr)));
        System.out.println("Size of the array after adding is : "+size);

    }
    static void insert_at_beggining1(int [] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element to add in the array :");
        int key=sc.nextInt();
        int size=0;
        for(int num :arr){
            if(num!=0){
                size++;
            }
            else {
                break;
            }
        }
        arr[size]=arr[0];
        arr[0]=key;
        size++;
        System.out.println((Arrays.toString(arr)));
        System.out.println("Size of the array after adding is : "+size);
    }

    static  void insert_at_end(int [] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element to add in the array :");
        int size=0;
        for(int num :arr){
            if(num!=0){
                size++;
            }
            else {
                break;
            }
        }
        arr[size]=arr[0];
        size++;
        System.out.println((Arrays.toString(arr)));
        System.out.println("Size of the array after adding is : "+size);
    }
    static void delete_at_beggining(int [] arr){
        Scanner sc=new Scanner(System.in);
        int size=0;
        for(int num :arr){
            if(num!=0){
                size++;
            }
            else {
                break;
            }
        }
        for(int i=0;i<(size-1);i++){
            arr[i]=arr[i+1];
        }
        arr[size-1]=0;
        size--;
        System.out.println((Arrays.toString(arr)));
        System.out.println("Size of the array after deletion is : "+size);

    }

    static void insert_at_position(int [] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an element to add in the array :");
        int element=sc.nextInt();
        System.out.println("Enter position to add in the array :");
        int position=sc.nextInt();
        int size=0;
        for(int num :arr){
            if(num!=0){
                size++;
            }
            else {
                break;
            }
        }
        for(int i=size;i>position;i--){
            arr[i]=arr[i-1];
        }
        arr[position]=element;
        size++;
        System.out.println((Arrays.toString(arr)));
        System.out.println("Size of the array after adding is : "+size);

    }

    static void delete_from_end(int [] arr){
        Scanner sc=new Scanner(System.in);
        int size=0;
        for(int num :arr){
            if(num!=0){
                size++;
            }
            else {
                break;
            }
        }
        arr[size-1]=0;
        size--;
        System.out.println((Arrays.toString(arr)));
        System.out.println("Size of the array after deletion is : "+size);


    }
    static int bidirectional_search(int [] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element to search in the array :");
        int element=sc.nextInt();int low=0;
        int high=arr.length-1;
        while(low<=high){
            if(arr[low]==element){
               return low;
            }
            else if(arr[high]==element){
                return high;
            }
            low++;
            high--;
        }
        return -1;
    }
    static void delete_from_position(int [] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the position in array to delete : ");
        int position=sc.nextInt();
        int size=0;
        for(int num :arr){
            if(num!=0){
                size++;
            }
            else {
                break;
            }
        }
        for(int i=position;i<(size-1);i++){
            arr[i]=arr[i+1];
        }
        arr[size-1]=0;
        size--;
        System.out.println((Arrays.toString(arr)));
        System.out.println("Size of the array after deletion is : "+size);
    }

    static void sentinal_linear_search(int arr[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to find in the array :");
        int element=sc.nextInt();
        int n=arr.length;
        int last=arr[n-1];
        arr[n-1]=element;
        int i=0;
        while(arr[i]!=element){
            i++;
        }
        arr[n-1]=element;
        if(i<n-1 || arr[n-1]==element){
            System.out.println("The element is found at index : "+i);
        }
        else {
            System.out.println("Element not found");
        }
    }

    static int transposition(int [] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to find in the array : ");
        int element = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                if (i > 0) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    return i-1;
                }
                return i;
            }
        }
        return -1;
    }

    static int move_to_front(int [] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to find in the array: ");
        int element = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                if (i > 0) {
                    int temp = arr[i];
                    arr[i] = arr[0];
                    arr[0] = temp;
                    return 0;
                }
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
//        int [] arr={1,2,3,4,5,6,7,8,9,0};
//        int result=move_to_front(arr);
//        System.out.println(result);
//        System.out.println(Arrays.toString(arr));
        int a=5;
        int b=6;
        a=b;
        System.out.println(a);
    }
}
