package Interviewpractice;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = mc.nextInt();
		System.out.println("Enter the second number");
		int b = mc.nextInt();
		System.out.println("Before swapping two number " + a + " " + b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping " + a +" " + b);
		
		
		

	}



}
