package incapsulation;

public class Finance {

	public static void main(String[] args) {
		
		Client c= new Client();
		c.setClId("merazul123");
		c.setClPassword("123Abc");
		System.out.println(c.clName);
		System.out.println(c.getClId());
		System.out.println(c.getClPassword());

	}

}
