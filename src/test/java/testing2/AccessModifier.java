package testing2;

public class AccessModifier {

	public static void main(String[] args) {
		Access1 x = new Access1();
		x.accountnumber = 12345;
		x.customername ="barani";
		//we can override and access it
		x.customername ="selvi";
		
		//x.date="2333";we cannot override but only access it
		x.phoneno= "123";
		
		
	;

	}

}
