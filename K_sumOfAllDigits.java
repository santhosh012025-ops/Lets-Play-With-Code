package codes.functionl.programming.java8.Programms;

import java.util.stream.Stream;

public class K_sumOfAllDigits {

	public static void main(String[] args) {
		int i = 1562378;
		String s= String.valueOf(i);
		
		int x=Stream.of(s.split("")).mapToInt(Integer::parseInt).sum();
		System.out.println(x);
	}

}
