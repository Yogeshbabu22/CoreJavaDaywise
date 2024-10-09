package com.destination.septemberbatch.oct1;
import java.util.Scanner;
public class ArrayOperation {
	int arr[];
	int size;
	
	void createArray(int n) {
		size = n;
		arr = new int[size];
		System.out.println("Array is created sucessfully");
		System.out.println("=========");
	}
	void addData() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Collection array Data: ");
		for(int i = 0; i< size;i++) {
			System.out.println("Enter the marks of student no :"+(i+1));
			arr[i] = sc.nextInt();
		}
		System.out.println("Marks successfully collected");
		System.out.println("========");
	}
		void display() {
			System.out.println("Display array Data: ");
			for(int i = 0;i<size;i++) {
				System.out.println("The marks of student no"+(i+1)+" is ="+arr[i]);
			}
		}
		
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of students: ");
		int n = sc.nextInt();
		
		ArrayOperation ao1 = new ArrayOperation();
		ao1.createArray(n);
		ao1.addData();
		ao1.display();
		// TODO Auto-generated method stub

	}

}
