package calculator.com;

public abstract class SubClass implements  CalculatorIn {
	
	public void turnON() {
		System.out.println(" the calculator is On");
		
		
	}
	public void turnOf() {
		System.out.println(" the calculator is Of");
		
		
	}
	public abstract int  subOfTwo(int a, int b ) ;
		 
	public abstract int  subOfThree (int a, int b,int c);


}
