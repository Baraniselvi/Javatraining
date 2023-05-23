package File1;

import java.io.File;
import java.io.IOException;

public class FileeOperations {

	public static void main(String[] args) {
		File f  = new File("C:\\Users\\baran\\eclipse-workspace\\javatraining\\src\\test\\resources\\dummy1.txt");
		try {
			if(f.createNewFile())
			{
				System.out.println("File Created");
}
			else {
				System.out.println("File already exists");
				
			}
				
				
				
				
				
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}

}
}
