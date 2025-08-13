package codes.functionl.programming.java8.Programms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class L_SecondLargest_number {

	public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45,34,6,3,2,566);
        
//        List<Integer> sortList =listOfIntegers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        System.out.println(sortList.get(1));
        //or
        
        int secLarg = listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secLarg);
        
        //or
     /*   Optional<Integer> secLargOpt = Optional.ofNullable(listOfIntegers)
        	    .filter(list -> list.size() >= 2)
        	    .flatMap(list -> list.stream()
        	                         .sorted(Comparator.reverseOrder())
        	                         .skip(1)
        	                         .findFirst());

        	secLargOpt.ifPresentOrElse(
        	    val -> System.out.println("Second largest: " + val),
        	    () -> System.out.println("Not enough elements or null list")
        	);
		*/
	}

}
