package Test22;

import java.util.LinkedList;

public class CollectionForloop {

	public static void main(String[] args) {
		LinkedList<String> name = new LinkedList<String>();
		name.add("selva");
		name.add("Barani");
		name.add("Tharani");
		name.add("mathusri");
		LinkedList<String> emailid = new LinkedList <String>();
		emailid.add("selvalingam1978@yahoo.com");
		emailid.add("barani.selvam78@gmail.com");
		emailid.add("tharani.selvalingam@gmail.com");
		emailid.add("mathusri.selvalingam1978@gmail.com");
		for(int i = 0; i<name.size();i++) {
			System.out.println(name.get(i));
		}
		for (int i = 0;i<emailid.size();i++) {
			System.out.println(emailid.get(i));
		}
		
		if (name .contains("Barani") && emailid.contains("barani.selvam78@gmail.com") ) {
	    System.out.println("Barani");
		System.out.println("barani.selvam78@gmail.com");
	}
	else {
		System.out.println("not present");
			
		}
		}

	
		
		

	}

