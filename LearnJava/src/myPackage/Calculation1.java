package myPackage;

public class Calculation1 {

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
		return a/b;
	}

	public static void main(String[] args) {
		// (((((10+2)+2)-2)*2)/2)
		Calculation1 calcOjb = new Calculation1();

		int sumresult1 = calcOjb.sum(10, 2);
		int sumresult2 = calcOjb.sum(sumresult1, 2);
		int subresult = calcOjb.subtract(sumresult2, 2);
		int multresult = calcOjb.multiply(subresult, 2);
		int divresult = calcOjb.divide(multresult, 2);
		System.out.println(divresult);

	}

}
