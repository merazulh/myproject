package test;

import java.util.ArrayList;

public class School{
public static void main(String[] args) {
	Student s= new Student("merazul", 100, "english");
	Student s1= new Student("riazul", 101, "bangla");
	Student s2= new Student("Sohely", 102, "math");

	
ArrayList<Student> al = new ArrayList<Student>();

al.add(s);
al.add(s1);
al.add(s2);
for (Student value : al) {
	System.out.println(value.name+" "+value.rollnumber+" "+ value.department);
	
}
	
}	
	
}


	
		
		
		



	
	


















	
	
		
	
	
	
	
	


