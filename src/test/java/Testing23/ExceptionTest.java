package Testing23;

import java.util.Scanner;

public class ExceptionTest {
	
	public void sum() 
	{
	int a = 0 ;
	int b = 0;
	
	{
		try 
		{
		Scanner z = new Scanner (System.in);
		System.out.println("Enter the first number");
		 a = z.nextInt();
		}
		catch(Exception e) {
			System.out.println("Enter thye proper number" + e);
	   
			
		
		}
		try
		{
		System.out.println("Enter the second number");
		Scanner z1 = new Scanner (System.in);
		 a = z1.nextInt();
		}
			
		catch(Exception e)
		
		{
			System.out.println("Enter the proper number " + e);
		}
		int c = a + b;
		System.out.println(c);
		
		
		
	
	}

}
}