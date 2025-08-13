package codes.functionl.programming.java8.Programms;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class J_AnagramOrNot {

	public static void main(String[] args) {

		String s1 = "RaceCar";
        String s2 = "CarRace";
        
        s1 = Stream.of(s1.split("")).map(x->x.toUpperCase()).sorted().collect(Collectors.joining());
        System.out.println(s1);
        
        s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining()); 
        
        if(s1.equals(s2)) {
        	System.out.println("anagram");
        	
        }
        else {
        	System.out.println("not anagram");
        }
        
        
//        List<String> s3= Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.toList());
//        System.out.println(s3);
//        String comb="";
//        for(String s : s3) {
//        	comb+=s;
//        	
//        }
//        System.out.println(comb);
	}
	

}
