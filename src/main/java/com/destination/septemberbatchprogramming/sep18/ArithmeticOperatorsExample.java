package com.destination.septemberbatchprogramming.sep18;

class ArithmeticOperations {
	void add(int a , int b){
		int res1 = a + b;
		System.out.println("Addition result is : " +(res1) );
		
	}
	void sub(int a , int b) {
		int res2 = a - b;
		System.out.println("Subtraction is : " +(res2) );
		
	}
	void mul(int a, int b) {
		int res3 = a * b;
		System.out.println("Multiplication result is : " +(res3) );
	}
	void div(int a , int b) {
		int res4 = a / b;
		System.out.println("Division result is : " +(res4) );
	}
	void mod(int a, int b) {
		int res5 = a % b;
		System.out.println("Modulus result is : " +(res5) );
	}

}
public class ArithmeticOperatorsExample {
	public static void main(String args[]) {
		System.out.println("===== Arithmetic Operators Example =======");
		int a = 100;
		int b = 50 ;
		
		
		ArithmeticOperations ao = new ArithmeticOperations();
		ao.add(a,  b);
		ao.sub(a, b);
		ao.div(a, b);
		ao.mul(a, b);
		ao.mod(a, b);
		
	}
	
	
}

	
	