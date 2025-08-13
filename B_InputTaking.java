package codes.basics.java;
import java.util.*;

public class B_InputTaking {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			System.out.println("Enter your fav number: ");		
			int num = scan.nextInt();
			System.out.println("Entered number: "+num);
			
			System.out.println("Enter your good name: ");
			String name = scan.nextLine();
			System.out.println("Hello: "+ name);
			
			System.out.println("Enter your CGPA: ");
			double cgpa = scan.nextDouble();
			System.out.println("Your last SEM CGPA: "+ cgpa);
		}
		
	}
	

