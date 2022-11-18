package createfile;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		File obj = new File("newfolder.text");
		if(obj.delete()) {
			System.out.println("file deleted");
		}else {
			System.out.println("something went wrong");
		}

	}

}
