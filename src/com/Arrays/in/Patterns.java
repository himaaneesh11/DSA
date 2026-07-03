package com.Arrays.in;

public class Patterns {
    static int [] twopointer(int [] arr,int sum){
      int low=0,high=arr.length-1;
      while(low<high){
          if(sum==arr[low]+arr[high]){
              return  new int []{low+1,high+1};
          }
          else if(sum>arr[low]+arr[high]){
              low++;
          }
          else{
              high--;
          }
      }
      return  new int []{-1,-1};
    }
    static void threesum(int [] arr){
      for(int i=0;i<arr.length-2;i++){
          if(i>0 && arr[i]==arr[i-1]){
              continue;
          }
          int low=i+1,high=arr.length-1;
          while(low<high){
              if(arr[low]+arr[high]+arr[i]==0){
                  System.out.println(arr[i]+" "+arr[low]+" "+arr[high]);
                  while(low<high && arr[low]==arr[low+1]){
                      low++;
                  }
                  while(low<high && arr[high]==arr[high-1]){
                      high--;
                  }
                  low++;
                  high--;
              }
              else if(arr[low]+arr[high]+arr[i]>0){
                  high--;
              }
              else{
                  low++;
              }
          }

      }
    }
    public static void main(String[] args) {
        int [] numbers={-1,0,2,0,-1,-1,3,2,0,1};
        threesum(numbers);

    }

}
