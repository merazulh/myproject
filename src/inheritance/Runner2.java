package inheritance;

 class Vahicle{
	 boolean canrun=true;
	 int wheel=4;
	 int door =2;
	 public void hunk() {
		 System.out.println("vahicle hunlk like pep peep");
		 
	 }
	 public void rule() {
		 System.out.println("all vahicle shold follo trafic rule");
	 } 
}
 class Car extends Vahicle{
	 String name="toyota";
	 public void state() {
		 System.out.println("toyota car is medium brand car");	 
	 }	 
 }
 class Motorbike extends Vahicle{
	 int wheel=2;
	 int speed=200;
	 boolean faster=true;
	 public void safe() {
		 System.out.println("motor bike is not safe like car");
	 }
 }

public class Runner2 {
	public static void main(String[] args) {
		Vahicle v= new Vahicle();
		Car c = new Car();
		Motorbike m = new Motorbike();
	System.out.println(v.canrun);	
	System.out.println(v.door);
	System.out.println(v.wheel);
	v.hunk();
	System.out.println(c.name);
	c.state();
	System.out.println(m.wheel);
	System.out.println(m.speed);
	System.out.println(m.faster);
	m.safe();
		
	}
}
