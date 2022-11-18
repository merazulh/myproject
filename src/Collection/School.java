package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class School{
public static void main(String[] args) {
	
	Set<String>	al=new LinkedHashSet<String>();
    al.add("selenium");
    al.add("somtosh");
    al.add("java");
    al.add("tesng");
    al.add("sohely");
    al.add("java");
   	
    
    System.out.println(al);
    setmethod();
    treesetmethod();
	}
	public static void setmethod() {
Set<String>	a=new HashSet<String>();
a.add("selenium");
a.add("sontosh");
a.add("java");
a.add("tesng");
a.add("sohely");
a.add("java");

System.out.println(a);

	
}
	public static void treesetmethod() {
		
		Set<String>	a=new TreeSet<String>();
		a.add("aselenium");
		a.add("bsontosh");
		a.add("cjava");
		a.add("dtesng");
		a.add("esohely");
		a.add("fjava");

		System.out.println(a);
		
	}
}

	
		
		
		



	
	


















	
	
		
	
	
	
	
	


