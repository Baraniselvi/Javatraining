package Interviewpractice;

import java.util.ArrayList;

public class Test87 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("selva");
		names.add("Barani");
		names.add("Tharani");
		names.add("Mathusri");
		System.out.println(names);
		for(String x : names)
		{
			System.out.println(x);
		}
		names.add(0, "hi all");
	}

}
