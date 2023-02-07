package test;

public class Test {
	
	public static void calsum(String name,int number) {

	

String grade;


if(number<=100 & number>=80) {
	grade ="A";
}
else if(number<=80& number>=60) {
	grade ="B";
}
else if(number<=60& number>=40) {
	grade ="C";
}
else {
	grade="fail";
}
System.out.println("name: "+  name+" number: "+number+"  grade: "+grade);
	}
public static void main(String[] args) {
	calsum("merazul",34);

	}

}
