package glass;

import java.util.Scanner;

public class case5 {

	public static void main(String[] args) {
		
		
		Scanner bs = new Scanner(System.in);
		System.out.println("Enter the temperature in farenheit");
		float temp = bs.nextFloat();
		float con =( float) ((temp-32)/1.8);
		System.out.println(con);

	}

}
