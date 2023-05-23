package testing;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner mv = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int a = mv .nextInt();
		System.out.println("Enter the second number");
		int b = mv.nextInt();
		int c = a + b;
		System.out.println(c);
		int d = a - b;
		System.out.println(d);
		int f = a * b;
		System.out.println(f);
		int g = a / b ;
		System.out.println(g);
		System.out.println("Enter first number");
		float xy = mv.nextFloat();
		System.out.println("Enter second number");
		float xz = mv.nextFloat();
		float n = xy + xz;
		System.out.println(n);
		float z = xy-xz;
		System.out.println(z);
		float y = xy * xz ;
		System.out.println(y);
		float p = xy / xz;
		System.out.println(p);

		
		

	}

}
