package createfile;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
	
		File obj = new File("newfolder.text");
		try {
			if(obj.createNewFile()) {
				System.out.println(" file created");
			}else {
				System.out.println("file already exist");
			}
		}catch(IOException e) {
			System.out.println("something went wrong");
			e.printStackTrace();
		}

	}

}
