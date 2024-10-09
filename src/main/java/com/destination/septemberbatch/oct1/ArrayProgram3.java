package com.destination.septemberbatch.oct1;

import java.util.Scanner;

class ArrayOperation03 {
    int[][] arr;
    int cls;
    Scanner sc = new Scanner(System.in);

    void createArray(int n) {
        cls = n;
        arr = new int[n][];
        System.out.println("Collecting Student count for each class: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number of students in Class No " + (i + 1) + ": ");
            int studentCount = sc.nextInt();
            arr[i] = new int[studentCount];
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter the marks of student no " + (j + 1) + ": ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Marks successfully collected");
        System.out.println("==========");
    }

    void addData() {
        System.out.println("Collecting array Data: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Inside Class No :" + (i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Marks of student no " + (j + 1) + " is: " + arr[i][j]);
            }
        }
        System.out.println("Array is created successfully");
        System.out.println("==========");
    }

    void display() {
        System.out.println("Displaying array data: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Inside Class No :" + (i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Marks of student no " + (j + 1) + " is: " + arr[i][j]);
            }
        }
    }
}

public class ArrayProgram3 {
    public static void main(String[] args) {
        ArrayOperation03 a03 = new ArrayOperation03();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the class count: ");
        int cls = sc.nextInt();

        a03.createArray(cls);
        a03.addData();
        a03.display();
    }
}
