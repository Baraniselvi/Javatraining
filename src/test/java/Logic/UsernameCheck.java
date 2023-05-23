package Logic;

public class UsernameCheck {
	
	String firstname ="Tharani";
	
	String middlename= "Mathusr";
	String lastname = "Selvali";
	
	
	public void namecheck() {
		
		
		if(firstname.length()==7 && middlename.length()==7 && lastname.length() ==7) {
			System.out.println("print the fullname");
			
		}
		else {
			System.out.println("It should be 7 charcters");
		}
	}
	

	public static void main(String[] args) {
		UsernameCheck c = new UsernameCheck();
		c.namecheck();

	}

}
