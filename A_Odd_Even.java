package codes.functionl.programming.java8.Programms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class A_Odd_Even {
	
	public static void main(String[] args) {
	    List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

	// even:
	    
	   List<Integer> evenList = listOfIntegers.stream().filter(a->a%2==0).collect(Collectors.toList());
	System.out.println("even numbers: "+evenList);
	
	//odd
listOfIntegers.stream().filter(a -> a%2!=0).forEach(System.out::println);
    
    
	}

}
