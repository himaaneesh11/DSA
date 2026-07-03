package com.Arrays.in;

public class Arrays_2 {
    static void traverseArray(int [] arr1){
        int size=0;
        for(int num:arr1){
            if(num!=0){
                size++;
            }
            else {
                break;
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(arr1[i]+" ");
        }
    }
    static void insertAtBeginning(int [] arr1,int x){
        int size=0;
        for(int num:arr1){
            if(num!=0){
                size++;
            }
            else {
                break;
            }
        }
        for(int i =size;i>0;i--){
            arr1[i]=arr1[i-1];
        }
        arr1[0]=x;

    }


    public static void main(String[] args) {
        int [] arr =new int[10];
//        int size=5;
        arr[0]=10;
        arr[1]=5;
        arr[2]=16;
        arr[3]=19;
        arr[4]=1;
//        traverseArray(arr,size);
//
//        insertAtBeginning(arr,size,89);
//
//          size++;
//        System.out.println("");
 //       traverseArray(arr,size);
    }


}
