package Collection;

import java.util.ArrayList;

public class Studentcollection {

	public static void main(String[] args) {
		Student s1= new Student("meru", 1001, "math");
		Student s2 = new Student("meru", 102, "science");
        Student s3=new Student("sohely", 103, "english");
        
        ArrayList<Student>als = new ArrayList<Student>();
        als.add(s1);
        als.add(s2);
        als.add(s3);
        for (Student details : als) {
        	System.out.println(details.name+" "+details.sid+" "+details.sdep);
			
		}
		
	}

}
