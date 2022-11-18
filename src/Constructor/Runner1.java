package Constructor;

public class Runner1 {

	public static void main(String[] args) {
	
		School s= new School(2022, "Merazul Haque", "Mh123", "Ab789", 100, 'A', true);
		
	System.out.println("batch "+s.batch);
	System.out.println("name "+s.sname);
	System.out.println("id: "+ s.sid);
	System.out.println("password :"+s.spass);
	System.out.println("total student "+s.scount);
	System.out.println("all student grade are "+s.sgrade);
	System.out.println("all student are presnt? "+s.spresent);
		

	}

}
