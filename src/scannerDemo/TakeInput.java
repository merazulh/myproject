

package scannerDemo;

import java.util.Scanner;



public  class TakeInput {
	public static void main(String[] args) {
//print all the number which is divisible by 3 and 7 and range from 1 to 100
// print the factorial number 	
		Scanner scane = new Scanner(System.in);
		System.out.println("Plese Enter The Number you Want To Know  Even or Odd");
		int num= scane.nextInt();
		if(num%2==0) {
			System.out.println("Its a even number");
		}else {
			System.out.println("it a odd number");
		}
	
	System.out.println("plese put the number yo want to know the factorial");
	int number= scane.nextInt();
	int res=1;
	for(int i=1;i<=number;i++) {
		res=res*i;
		System.out.println(res);
	}
	System.out.println("######");
	System.out.println(res);
}
	
	}
	

		

	
		
		
	
		
	
	


