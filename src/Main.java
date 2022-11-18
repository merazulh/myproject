
interface Animal{
	public void animalsound();
}


class dog implements Animal{

	@Override
	public void animalsound() {
		System.out.println("dog sound vau vau");
		
	}
	
}
class cat implements Animal{

	@Override
	public void animalsound() {
		System.out.println("cat sound like meu meu");
		
	}
	
}


public class Main {

	public static void main(String[] args) {
	dog d = new dog();
	cat c = new cat();
	c.animalsound();
	d.animalsound();

	}

}
