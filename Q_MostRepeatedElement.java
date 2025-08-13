package codes.functionl.programming.java8.Programms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q_MostRepeatedElement {

	public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");

        Map<String, Long> mapStrCount = listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(mapStrCount); //separate the string with count
        
        Entry<String, Long> elements = mapStrCount.entrySet().stream().max(Map.Entry.comparingByValue()).get(); //
        System.out.println("elements: "+elements);
        
        String maxRepeated = elements.getKey();
        System.out.println(maxRepeated);
        
        
        
        
        
       
	}

}
