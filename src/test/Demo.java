package test;

public class Demo {

	public static void main(String[] args) {

		
		String name ="merazulHaque";
		
		
		char []car= new char[name.length()];
		
			
			for(int i=0; i<car.length;i++) {
				System.out.println(name.charAt(i));
			}
			System.out.println("######################");
			for(int j=name.length()-1;j>0;j--) {
				System.out.println(name.charAt(j));
			}
			
		} 

	}


