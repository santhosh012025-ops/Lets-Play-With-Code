package codes.functionl.programming.java8.Programms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class O_FindCommonElements {

	public static void main(String[] args) {
		 List<Integer> list1 = Arrays.asList(71, 21, 21, 34, 89, 56, 28);
         
	      List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
	      
	      
	  List<Integer> list3 =  list1.stream().filter(list2::contains).toList();
	      System.out.print(list3.stream().distinct().collect(Collectors.toList()));
	        
	}

}
