package codes.functionl.programming.java8.Programms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//2) How do you remove duplicate elements from a list using Java 8 streams?

public class B_removeduplicates {
	
	public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

List<String> distinctValues = listOfStrings.stream().distinct().collect(Collectors.toList());    
	
	System.out.println(distinctValues);}

}
