package createfile;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
	try {	
		FileWriter obj = new FileWriter("newfolder.text");
	
			obj.write("java kind of tricky but has fun");
			obj.close();
			System.out.println("sucessfully wrote the file");
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("something went wrong");
			
		}

	}

}
