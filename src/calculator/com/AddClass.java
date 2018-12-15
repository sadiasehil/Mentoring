package calculator.com;

public abstract  class AddClass implements CalculatorIn {
	public void turnON() {
		System.out.println(" the calculator is On");
		
		
	}
	public void turnOf() {
		System.out.println(" the calculator is Of");
		
		
	}
	public abstract int  addOfTwo(int a, int b ) ;
		 
	public abstract int  addOfThree (int a, int b,int c);

}
