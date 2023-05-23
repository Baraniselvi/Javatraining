package Practice5;

public class StringPractice {

	public static void main(String[] args) {
		String b1 = "I love my family";
		System.out.println(b1.length());
		String studentname = "Tharani" ;
		String gradelevel = " Got green level";
		String score = " with nenty percent";
		String date = " on 03/23/23 ";
		System.out.println(gradelevel.length());
		String performance = studentname.concat(gradelevel);
		System.out.println(performance);
		studentname = studentname.toLowerCase();
		System.out.println(studentname);
		System.out.println(studentname.toLowerCase());
		gradelevel = gradelevel.toUpperCase();
		System.out.println(gradelevel);
		performance = performance.concat(score);
		System.out.println(performance);
		performance = performance.concat(date);
		System.out.println(performance);
		System.out.println(score.length());
		System.out.println(date.length());
		String kid = "mathusri";
		String kid1 = "mathusri";
		System.out.println(kid.equals(kid1));
		System.out.println(kid.contains(kid1));
		String kid2  = "Tharani";
		String kid22 = "THARANI";
		System.out.println(kid2.equals(kid22));
		System.out.println(kid2.equalsIgnoreCase(kid22));
		System.out.println(kid2.contains(kid22));
		date = date.replace('/', '-');
		System.out.println(date);
		System.out.println(studentname.toUpperCase());
		
	
		
		
	
	
		
		
				
		
		
		

	}

}
