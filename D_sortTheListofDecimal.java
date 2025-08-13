package codes.functionl.programming.java8.Programms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class D_sortTheListofDecimal {

	public static void main(String[] args) {
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);

        List<Double> getSortedList = decimalList.stream().sorted().collect(Collectors.toList());
        getSortedList.add(10.4);
        System.out.println(getSortedList);
        
        List<Double> revSortList = decimalList.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(revSortList);
	}

}
