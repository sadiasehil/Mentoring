package calculator.com;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		DemoAdd  addition = new DemoAdd();
		addition.turnON();
		System.out.println("addition of two :\n ");
		System.out.println(" give the numbers :\n ");
		Scanner sc = new Scanner (System.in);
		int result = addition.addOfTwo(sc.nextInt(), sc.nextInt());
		System.out.println(" the total is "+ result);
		System.out.println("addition of three  :\n ");
		int result1 = addition.addOfThree(sc.nextInt(), sc.nextInt(),sc.nextInt());
		System.out.println(" the total is "+ result1);

	}

}
