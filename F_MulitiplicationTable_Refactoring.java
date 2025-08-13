package codes.basics.java;

//to avoiding duplication we use Refactoring
public class F_MulitiplicationTable_Refactoring {
	public static void main(String[] args) {
	 //   table();
	    table(6);
	 //  table(0,5,20);
	}

	public static void table(int number, int from, int to) {
		for(int i=from;i<=to;i++) {
			System.out.printf("%d * %d = %d\n",number,i,number*i);
		}
		
	}

	public static void table(int number) {
		table(number,2,20);
	}

	public static void table() {
		table(6);
		
	}
}
