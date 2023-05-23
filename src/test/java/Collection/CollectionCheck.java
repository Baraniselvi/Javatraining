package Collection;

import java.util.ArrayList;

public class CollectionCheck {

	public static void main(String[] args) {
		ArrayList<String> StudentName = new ArrayList<String>();
		StudentName.add("SELVA");
		StudentName.add("THARANI");
		StudentName.add("MATHUSRI");
		StudentName.add("BARANI");
		System.out.println(StudentName.get(0));
		 
		for(String s : StudentName) {
			System.out.println(s);
			
		}
	
		
		

	}

}
