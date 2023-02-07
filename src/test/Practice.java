package test;

public class Practice {
	
	int num;
	String name;
	
	Practice(int num,String name){
		
		this.num=num;
		this.name=name;
		
	}


	public static void main(String[] args) {
	
	Practice p = new Practice(17, "merazul")	;
	System.out.println(p.num);
		
System.out.println(p.name);
	}

}
