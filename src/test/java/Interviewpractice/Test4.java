package Interviewpractice;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter Tamil marks");
		int a = n.nextInt();
		System.out.println("Enter English marks");
		int b = n.nextInt();
		System.out.println("Enter Math marks");
		int c = n.nextInt();
		System.out.println("Enter Science marks");
		int d = n.nextInt();
		System.out.println("Enter Social Studies marks");
		int e = n.nextInt();
		int f = a+b+c+d+e;
		System.out.println("Total Marks are " + f);
		


}
}