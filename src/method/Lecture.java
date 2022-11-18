package method;

public class Lecture {
	public void bat() {
		int batch=2022;
		String name="java selenium";
		boolean present =true;
		System.out.println(batch+name+present);
		
	}
	public void myname(String fname,String lname) {
		System.out.println(fname+lname+" my last name");
		
	}
	public void teacherMthod() {
		System.out.println("do the all home work today");
	}

	public static void main(String[] args) {
		Lecture l = new Lecture();
		l.bat();
	l.myname("merazul","haque");
	l.teacherMthod();
		

	}

}
