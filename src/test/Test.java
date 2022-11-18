package test;

public class Test {
	
public static void main(String[] args) {
	

String grade;		
String name;
int number;
number= 90;
name ="Merazul";

if(number>=80 & number <=100) {
	
	grade="A";
}else if(number<=80 & number>=60) {
	grade="B";
}else {
	grade="fail";
}

System.out.println(name+number+grade);

	}

}
