package myPackage;

public class Calculation2 {

	public int sum(int a, int b) {
		return a + b;

	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		// (((((10*2)-2)+2)-2)/2)
		Calculation2 calcOjb = new Calculation2();

		int sumresult1 = calcOjb.multiply(10, 2);
		int sumresult2 = calcOjb.subtract(sumresult1, 2);
		int subresult = calcOjb.sum(sumresult2, 2);
		int multresult = calcOjb.subtract(subresult, 2);
		int divresult = calcOjb.divide(multresult, 2);
		System.out.println(divresult);

	}

}
