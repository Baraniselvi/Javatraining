package Interviewpractice;

import java.util.Scanner;

public class Test5 {

	
	
	public static void main(String[] args) {
		
		
		float f = 65;
		float c;
			
		float temp = (float) ((f-32)/1.8);
		System.out.println("celcius is " + temp);
		
		
		System.out.println("--------------------------------");
		
		
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the temperature in farenheit");
		float a = x.nextFloat();
		float b= (float) ((f-32)/1.8);
		System.out.println("The temperature in celsius is " + b);
		
		

	}

}
