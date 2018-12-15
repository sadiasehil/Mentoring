package calculator.com;

public abstract class MulClass implements CalculatorIn {
	public void turnON() {
		System.out.println(" the calculator is On");
		
		
	}
	public void turnOf() {
		System.out.println(" the calculator is Of");
		
		
	}
	public abstract int  mulOfTwo(int a, int b ) ;
		 
	public abstract int  mulOfThree (int a, int b,int c);


}
