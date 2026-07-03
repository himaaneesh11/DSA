package com.Arrays.in;

import java.util.Scanner;

public class Arrays_3 {
    static void insertAtBeginning(int [] arr,int x){
        try{
            int size=0;
            for(int element:arr){
                if(element!=0){
                    size++;
                }
                else{
                    break;
                }
            }
            for(int i=size;i>0;i--){
                arr[i]=arr[i-1];
            }
            arr[0]=x;
            size++;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }

    static void insertAtEnd(int [] arr,int x){
        try{
            int size=0;
            for(int element:arr){
                if(element!=0){
                    size++;
                }
            }
            arr[size]=x;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
    static void insertAtPosition(int [] arr,int p,int x){
        try{
            int size=0;
            for(int element:arr){
                if(element!=0){
                    size++;
                }
            }
            if(p<0 || p>(size+1)){
                System.out.println("position out of range");
            }
            else{
                for(int i=size;i>=p;i--){
                    arr[i]=arr[i-1];
                }
                arr[p-1]=x;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
    static void deleteAtEnd(int [] arr){
        try{
            int size=0;
            for(int element:arr){
                if(element!=0){
                    size++;
                }
                else {
                    break;
                }
            }
            arr[size-1]=0;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }

    static void traverseArray(int [] arr){
        try{
            int size=0;
            for(int element:arr){
                if(element!=0){
                    size++;
                }
                else {
                    break;
                }
            }
            for (int i =0;i<size;i++) {
                System.out.print(arr[i]+" ");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }

    static void deleteAtPosition(int [] arr,int p){
        try{
            int size=0;
            for(int element:arr){
                if(element!=0){
                    size++;
                }
                else  {
                    break;
                }
            }
            for(int i=(p-1);i<(size-1);i++) {
                arr[i]=arr[i+1];
            }
            arr[size]=0;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number of elements in the array : ");
//        int n = input.nextInt();
//        int arr[] =new int[n];
//        System.out.println("Enter the elements in the array : ");
//        for(int i=0;i<n;i++){
//            arr[i]=input.nextInt();
//        }
//        for(int element:arr){
//            System.out.print(element+" ");
//        }
        int [] arr =new int[10];
        arr[0]=20;
        arr[1]=30;
        arr[2]=40;
        arr[3]=50;
        arr[4]=60;
        traverseArray(arr);
//        insertAtBeginning(arr,10);
////        System.out.println("");
////        traverseArray(arr);
//        insertAtEnd(arr,70);
//        System.out.println("");
//        traverseArray(arr);
//        insertAtPosition(arr,2,2000);
//        System.out.println("");
//        deleteAtEnd(arr);
//        System.out.println("");
//        traverseArray(arr);
        deleteAtPosition(arr,2);
        System.out.println("");
        traverseArray(arr);
    }
}
