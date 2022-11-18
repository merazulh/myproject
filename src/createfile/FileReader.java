package createfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) {
	try {
		File obj = new File("newfolder.text");
		Scanner scane = new Scanner(obj);
		
			if(scane.hasNextLine()) {
				String data = scane.nextLine();
				System.out.println(data);
			}
			
		}catch(FileNotFoundException e) {
			System.out.println("something went wrong");
			e.printStackTrace();
			
		}

	}

}
