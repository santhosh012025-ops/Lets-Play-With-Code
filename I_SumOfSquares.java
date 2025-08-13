package codes.basics.java;

public class I_SumOfSquares {
	public static void main(String[] args) {
		System.out.println("Sum of square is : " + sumOfSquares(5));

	}

	private static int sumOfSquares(int num) {
		int result = 0;
		for (int i = 0; i <= num; i++) {
			result += (i * i);
			System.out.printf("logger %d :: %d" ,i, result).println();
		}
		return result;

	}

}
