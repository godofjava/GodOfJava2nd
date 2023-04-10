public class Calculator {

	public int sum = 0;
	public int result;

	public int add(int num1, int num2) {
		sum = num1 + num2;
		return sum;
	}

	public int addAll(int num1, int num2, int num3) {
		sum = num1 + num2 + num3;
		return sum;
	}
	
	public int subtract(int num1, int num2) {
		result = num1 - num2;
		return result;
	}
	public int multiply(int num1, int num2) {
		result = num1 * num2;
		return result;
	}
	public int divide(int num1, int num2) {
		result = num1 / num2;
		return result;
	}

}
