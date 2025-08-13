package codes.functionl.programming.java8.Programms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class G_getMinMaxFromList {

	public static void main(String[] args) {

		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 95, 31, 89);
		
		Optional<Integer> max = listOfIntegers.stream().max(Comparator.naturalOrder());
		int maxNum = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
		System.out.println(maxNum);
		System.out.println(max);
		
		int minNum = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
		System.out.println(minNum);
	}

}
