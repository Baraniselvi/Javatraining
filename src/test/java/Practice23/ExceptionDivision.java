package Practice23;

import java.util.Scanner;

public class ExceptionDivision {
	public void divide() {
		
		int a = 0;
		int b = 0;
		try
		{
			System.out.println("Enter the first number");
			Scanner f = new Scanner(System.in);
			a= f.nextInt();
			
		}
		catch(Exception e)
		{
			System.out.println("Enter the proper number" + e);
			
		}
		try
		{
			System.out.println("Enther the second number");
			Scanner f1 = new Scanner (System.in);
			b=f1.nextInt();
			
		}
		catch(Exception e)
		{
			System.out.println("Enter the proper number " +e);
		}
		int c = a/b;
		System.out.println(c);
	}

}
