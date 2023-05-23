package Practice23;

import java.util.Scanner;

public class ExceptionMultiply {
	public void multiply() {
	int a = 0;
	
	int b = 0;
	try
	{
	System.out.println("Enter the first number");
	
	Scanner x = new Scanner (System.in);
	a= x.nextInt();

}
	catch(Exception e) {
		System.out.println("Enter the proper number" + e);
	}
	try
	{
		System.out.println("Enter the second number");
		
		Scanner x1 = new Scanner (System.in);
		b=x1.nextInt();
		
		
	}
	catch(Exception e ){
		System.out.println("Enter the proper number" + e);
		
		
	}
	int c = a *b ;
	System.out.println(c);
}
}