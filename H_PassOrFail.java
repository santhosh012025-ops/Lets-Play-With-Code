package codes.basics.java;

public class H_PassOrFail {

	public static void main(String[] args) {
		System.out.println("result student_1: " + isPass(49));
		System.out.println("result student_2: " + isFail(32));

	}

	private static boolean isFail(int marks) {
		return marks < 50;
	}

	private static boolean isPass(int marks) {
		return marks > 50;

	}

}
