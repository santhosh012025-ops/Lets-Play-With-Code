package codes.basics.java;

import java.util.Scanner;

public class C_MulitiplicationTable {
	static void multipleTable(int number) {
	
		for(int i=1;i<=10;i++) {
			System.out.printf("%d * %d = %d\n",number,i,number*i); //println is wont work for here
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number which you want table: ");
		int input = scan.nextInt();
		multipleTable(input);
		
	}
}
