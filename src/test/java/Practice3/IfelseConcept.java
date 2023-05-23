package Practice3;

public class IfelseConcept {

	public static void main(String[] args) {
		String s = "Enjoy your life";
		if(s.contains("yours")) {
			System.out.println("Statement has the word YOUR");
		}
		else if(s.contains("enjoy")) {
			System.out.println("statement has the word ENJOY");
			
			
		}
		else if(s.contains("life")) {
			System.out.println("statement has the word LIFE");
		}
		else {
			System.out.println("....");
		}

	}

}
