package Abstraction;

abstract class Animal{
	abstract void animalsound();
	String animalname="elephant";
}


class Dog extends Animal{
	String bread="germanshefars";
	public void animalsound() {
		System.out.println("animalsound crazy");
	}
}
class Cat extends Animal{
	String cateat="Mouse";
	public void catsleep() {
		System.out.println("cat sleeo like zee zee zee");
	}
	@Override
	void animalsound() {
	
		
	}
}
 class Main extends Animal{
	private void mymethod() {
		System.out.println("do something good");
	}

	public static void main(String[] args) {
		Main m = new Main();
		Cat c = new Cat();
		Dog d = new Dog();
		d.animalsound();
		
	}

	@Override
	void animalsound() {
		
		
	}

}
