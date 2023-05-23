package Practice9;

import java.util.Scanner;

public class CalculatorScan {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = x .nextInt();
		System.out.println("Enter the second number");
		int b = x.nextInt();
		int c = a + b ;
		System.out.println("The sum of two numbers is " + c);
		int d = a - b;
		System.out.println("The difference of two numbers is " + d);
		int e = a * b ;
		System.out.println("The product of two numbers is "+ e);
		int f = a / b ;
		System.out.println("The division of two numbers is " + f);
		
		

	}

}
