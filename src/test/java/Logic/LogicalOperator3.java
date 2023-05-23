package Logic;

public class LogicalOperator3 {
	int age = 18 ;
	int uptoage = 17;
	
	
	String qualification1 = "BTECH";
	String qualification2 = "BE";
	
		
	String nationality = "India";
	String aadharno ="Get aadharcard";
	String pan = "get pancard ";
	
	public void agecheck() {
		if(age>=18 && uptoage<=age) {
			System.out.println("Age criteria met");
		}
		else {
			System.out.println("Age criteria not met");
		}
			
	}
	public void degreecheck() {
		if(qualification1 == "BTECH" || qualification2 == "BE") {
			System.out.println("Degree criteria met");
			
		
		}
		else {
			System.out.println("Degree criteria not met");
	}	
	}
	public void nationalitycheck() {
		if(nationality =="India") {
			System.out.println("nationlity criteria met");
			
		}
		else {
			System.out.println("nationality criteria not met");
		}
	}
		
		public void aadharcheck()  {
			if(aadharno =="Get aadharcard") {
				System.out.println("Get aadharcard details");
			}
			else
			{ 
				System.out.println("Reject the application");
					
				
		}
		}
			public void pancheck() {
			if(pan == "get pancard") {
				System.out.println("Get the pancard details");
			}
			else
			{
				System.out.println("reject the candidate");
			}
					
	}
	
	
	
	public static void main(String[] args) {
		LogicalOperator3 x = new LogicalOperator3();
		x.agecheck();
		x.degreecheck();
		x.nationalitycheck();
		x.aadharcheck();
		x.pancheck();
	

	}

}
