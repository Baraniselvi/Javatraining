package File1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileReading {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\\\baran\\eclipse-workspace\\javatraining\\src\\test\\resources\\barani1.txt");
		try {
			FileReader x = new FileReader(f);
			Scanner s = new Scanner(f);
			while(s.hasNext())
			{

				System.out.println(s.hasNext());
			}
				
			
	
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			
			
			
			
		} 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}
}
