package Practice23;

import java.util.Scanner;

public class ExceptionSub {
	
	
	public void sub() {
		int a = 0 ;
		int b = 0;
		try
		{
			System.out.println("Enter the first number");
			Scanner s = new Scanner (System.in);
			a = s.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Enter the proper number" + e);
			
	
}
		try
		{
			System.out.println("Enter the second number");
			Scanner s1 = new Scanner(System.in);
			b=s1.nextInt();
			
		}
		catch(Exception e)
		{
			System.out.println("Enter the proper number"+ e);
			
}
		int c = a - b ;
		System.out.println(c);


}
}