package codes.functionl.programming.java8.Programms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class C_FindFrequencyOfListObjects {

	public static void main(String[] args) {
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

        Map<String, Long> frequeny =new HashMap<>();
        frequeny = stationeryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(frequeny);
	}

}
