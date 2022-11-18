package Constructor;

public class School {
	int batch;
	String sname;
	String sid;
	String spass;
	int scount;
	char sgrade;
	boolean spresent;
	public  School(int batch,String sname,String sid,String spass,int scount, char sgrade,boolean spresent) {
		
		
		this.batch=batch;
		this.sname=sname;
		this.sid=sid;
		this.spass=spass;
		this.scount=scount;
		this.sgrade=sgrade;
		this.spresent=spresent;
		
		
	}
	public static void main(String[]args) {
		School S= new School(2022, "Merazul Haque", "Mh123", "Ab789", 100, 'A', true);
		
		
	}
	}


