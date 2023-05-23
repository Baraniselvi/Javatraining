package File;

import java.io.File;
import java.io.IOException;

public class FileOperation {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\baran\\eclipse-workspace\\javatraining\\src\\main\\resources.barani.txt");
		try {
			if(f.createNewFile())
			{
			
}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}

