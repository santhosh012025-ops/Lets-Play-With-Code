package codes.basics.java;

public class E_MulitiplicationTableWithMethodOverloading {

	public static void main(String[] args) {
	//    table();
	    table(6);
	//    table(6,5,20);
		
		
	}

	public static void table(int number, int from, int to) {
		for(int i=from;i<=to;i++) {
			System.out.printf("%d * %d = %d\n",number,i,number*i);
		}
		
	}

	public static void table(int number) {
		for(int i=1;i<=10;i++) {
			System.out.printf("%d * %d = %d\n",number,i,number*i);
		}
		
	}

	static void table() {
		for(int i=1;i<=10;i++) {
			System.out.printf("%d * %d = %d\n",10,i,10*i);
		}
		
	}
}
