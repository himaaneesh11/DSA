package com.Arrays.in;

public class Arrays_1 {
    public static void main(String[] args) {
//        int [] numbers;
//        numbers=new int[5];
//     //     numbers=new int[]{1,2,3,4,5};
//     //   int [] numbers={1,2,3,4,5,6};
//     //   numbers[0]=5;
//        System.out.println("Enter elements of array : ");
//        Scanner input = new Scanner(System.in);
//        for(int i=0;i<numbers.length;i++){
//            numbers[i]=input.nextInt();
//        }
////        System.out.println(numbers[0]);
//        for(int element : numbers){
//            System.out.println(element);
//        }

        Student [] students = new Student[3];
        students[0]=new Student("Rakesh",145);
        System.out.println(students[0].name);
        System.out.println(students[0].rollNo);
    }
}


class Student{
    String name;
    int rollNo;
    Student(String name,int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollNo);
    }
}
