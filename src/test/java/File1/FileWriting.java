package File1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) {
     File f = new File("C:\\Users\\baran\\eclipse-workspace\\javatraining\\src\\test\\resources\\barani1.txt");
     try {
		FileWriter x = new FileWriter(f);
		x.write("barani ghost dream");
		
	} catch (IOException e) {
		
		e.printStackTrace();
	}
    

	}

}

