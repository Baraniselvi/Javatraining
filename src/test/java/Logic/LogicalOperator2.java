package Logic;

public class LogicalOperator2 {
	int age = 18 ;
	
	
	String qualification = "BTECH";
	String qualification2= "BE";
	
	String nationality = "India";
	String aadharno ="Get aadharcard";
	String pan = "get pancard ";

	public void validation1(){
		if(age>=18 && (qualification=="BTECH" || qualification2 == "BE") && nationality =="India" && aadharno =="Get aadharcard" && pan =="get pancard " ) {
			System.out.println("selected");
		}

	 
	else {
		System.out.println("rejected");
	}
	}
	
	
	public static void main(String[] args) {
		LogicalOperator2 x = new LogicalOperator2();
		x.validation1();
		
	}

}
