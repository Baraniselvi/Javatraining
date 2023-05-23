package glass;

import java.util.Scanner;

public class Case26 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int x = sc.nextInt();
		int y = 6*x-1;
		System.out.println(y);
		if(y%2==0)
		{
			System.out.println("Not a prime number");
		}
		else
		{
			System.out.println("It's a Prime number");
		}
		
	}

}
