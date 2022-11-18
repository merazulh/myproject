package test;

class car{
	public void carmethod() {
		System.out.println("car run");
	}
}
class bike extends car{
	public void carmethod() {
		System.out.println("bike running");
	}
	
	
}
class auto extends car{
	public void carmethod() {
		System.out.println("auto running");
	}
}

public class OOps {
	public static void main(String[] args) {
	bike b = new bike();
	b.carmethod();
	auto a = new auto();
	a.carmethod();
		
	}

}
