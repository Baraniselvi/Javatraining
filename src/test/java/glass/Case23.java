package glass;

import java.util.ArrayList;

public class Case23 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("sels");
		names.add("Barani");
		
		
		names.add("Tharani");
		names.add("Mathusri");
		System.out.println(names);
		names.set(1, "ammaappa");
		for(String x : names)
		{
			System.out.println(x);
		}
		

	}

}
