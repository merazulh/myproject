package test;

public class ForloopDemo {
	
	public static void reverseLoop() {
		for(int i = 10 ; i >=0;i--) {
			System.out.println(i+" hello world");	
	}}
	public static void loop() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}}
	public static void findEvennumber() {
		for(int i=50;i<=100;i++) {
			if(i%2==0) {
				System.out.println(i);
			}}}
	public static void printSumOfNumber() {
		int sum = 0;
		for(int i = 1;i<=5;i++){
		{
			sum= sum+i;
		}
		
		//System.out.println(sum);
	}
		System.out.println(sum);
	}
	
	public static void factorialLoop() {
		int result= 1;
		for(int i=1;i<=5;i++) {
			result = result*i;
		}{
		System.out.println(result);
		}}
	public static void printNumDivisible() {
	//print all the number which are divisible by 3 and 7 (range -1	to 100)
		for(int i=1; i<=100;i++) {
			if(i%3==0 & i%7==0 ) {
				System.out.println(i);	
			}}
			}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverseLoop();
		//loop();
		//findEvennumber();
		printSumOfNumber();
		System.out.println("#############################");
		factorialLoop();
		System.out.println("###############################");
		printNumDivisible();
	}
		
		}

	


