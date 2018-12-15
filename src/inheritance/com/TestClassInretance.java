package inheritance.com;

import java.util.Scanner;

public class TestClassInretance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition addit = new addition();
		addit.on();
		
		System.out.println("give the numbers: ");
		Scanner sc = new Scanner (System.in);
		
		int R=addit.add(sc.nextInt(), sc.nextInt());
		System.out.println(" le addition result is : "+R);
		addit.off();

	}

}
