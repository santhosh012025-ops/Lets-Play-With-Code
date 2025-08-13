package codes.functionl.programming.java8.Programms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//6) Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
public class E_JoinTheStrings_addSufficsPreficsAndDelimiter {

	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn"); 
		
		String joinedString = listOfStrings.stream().collect(Collectors.joining("-","[","]"));
		System.out.println(joinedString);

	}

}
