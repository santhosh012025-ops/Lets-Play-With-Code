package codes.functionl.programming.java8.Programms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class F_PrintMultiplesOfFive {
	public static void main(String[] args) {
		 List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		 
		 List<Integer> fiveMultiples = listOfIntegers.stream().filter(x -> x%5==0).collect(Collectors.toList());
		 System.out.println(fiveMultiples);
		 
	}

}
