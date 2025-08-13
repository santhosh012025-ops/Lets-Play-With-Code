package codes.functionl.programming.java8.Programms;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class N_SumAndAverageOfELements {

	public static void main(String[] args) {
		int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
		int sumAll = Arrays.stream(a).sum();
		  double average = Arrays.stream(a).average().getAsDouble();
		  
		 //==================================== 
		List<Integer> numList = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		//change datatype Integer to int then we have to sum
		int sumOfAll = numList.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sumOfAll);
		
		
		double averag = numList.stream()
			    .mapToDouble(Integer::doubleValue)
			    .average().getAsDouble();
		
		System.out.println(average);
			    
		

	}

}
