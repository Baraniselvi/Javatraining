package testing2;

public class StringManipulation {

	public static void main(String[] args) {
	String name1 = "barani";
	String name2 =" selvi";
	String fullname1 =name1.concat(name2);
	System.out.println("my full name is :" +fullname1);
	fullname1 = "barani ";
	System.out.println(fullname1);
	String dob = "15/06/1985";
	String details = fullname1.concat(dob);
	System.out.println(details);
	String age = "  37";
	System.out.println(age);
	String personaldetails=details.concat(age);
	System.out.println(personaldetails);

	System.out.println(fullname1.toUpperCase());
	fullname1=fullname1.toLowerCase();
	System.out.println(fullname1);
	System.out.println(fullname1.toLowerCase());
	String x = "i love chennai";
	System.out.println(x.charAt(7));			
	
	
	

	}

}
