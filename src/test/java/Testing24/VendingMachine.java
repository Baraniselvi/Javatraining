package Testing24;

import java.util.Scanner;

public class VendingMachine {
	//It should accept
	
	public int bills() {
		
		Scanner b = new Scanner (System.in);
		System.out.println("pay the amount");
		int pay = b.nextInt();
		System.out.println(pay);
		try
		{
			if((pay!=1 && pay!=5 && pay !=10) )
			
				
			{
				
				
				throw new Working();
				
				
		}
		}
		catch(Working e)
		
		{
		System.out.println(e);
		
	}
		return pay;
	
		
	}
}
		
	