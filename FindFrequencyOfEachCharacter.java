package codes.functionl.programming.java8.Programms;


import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;



public class FindFrequencyOfEachCharacter {

	public static void main(String[] args) {
		 String inputString = "Java Concept Of The Day";
		 
		 Map<Character,Long> freqMap = inputString.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 System.out.println(freqMap);
		 
	//#1conversion of String to charList	
	//	 List<Character> charsList= new ArrayList<>(); // empty list
//		 for(char c : inputString.toCharArray()) {
//			 charsList.add(c);
//			
//			 
//		 }
		// or
//		 charsList = inputString.chars()
//				 .mapToObj(c->(char)c)
//				 .filter(x -> ' '!=x) //filterout spaces
//				 .collect(Collectors.toList());
//		 
//		 System.out.println(charsList);
		// inputString.stream().
		//#2
		 
		
		 
	}

}
