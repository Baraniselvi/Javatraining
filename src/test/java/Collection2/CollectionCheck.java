package Collection2;

import java.util.ArrayList;

public class CollectionCheck {

	public static void main(String[] args) {
		ArrayList<Integer> EmployeeID = new ArrayList<Integer>();
		EmployeeID.add(12345);
		EmployeeID.add(34555);
		EmployeeID.add(12376);
		
		for(Integer bs :EmployeeID) {
			System.out.println(bs);
			System.out.println(Integer.rotateLeft(1, 3));
			
		}
		
		
		

	

}
}