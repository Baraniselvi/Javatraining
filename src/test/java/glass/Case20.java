package glass;

import java.util.ArrayList;

public class Case20 {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(50);
		num.add(60);
		num.add(70);
		num.add(80);
		num.add(90);
		
		for(int x : num)
		{
			System.out.println(x);
		}
		System.out.println(num.size());
		
		
		for(int j=1;j<=num.lastIndexOf(num);j--)
		{
			System.out.println(j);
		}
		

	}

}
