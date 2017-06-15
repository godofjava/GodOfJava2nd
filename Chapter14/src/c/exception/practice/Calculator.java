package c.exception.practice;

public class Calculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		try {
			calc.printDivide(1, 2);
			calc.printDivide(1, 0);//If second value is zero, the result will be infinity;
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void printDivide(double d1, double d2) throws Exception{
		if(d2==0) throw new Exception("Second value can't be Zero");
		double result = d1 / d2;
		System.out.println(result);
	}
}
