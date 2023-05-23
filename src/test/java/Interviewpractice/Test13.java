package Interviewpractice;

public class Test13 {

	public static void main(String[] args) {
		int englishmarks = 190;
		int tamilmarks = 175;
		int mathmarks = 140;
		int physicssmarks = 169;
		int chemistrymarks = 148;
		int computerscience = 130;
		
		
		if(mathmarks>180) {
			System.out.println("Check the computerscience marks");
		}
		else
		if(computerscience>160) {
			System.out.println("Eligible for computerscience engineering");
			
		}
		else
		{
			System.out.println("Not eleigible for engineering");
		}

	}

}
