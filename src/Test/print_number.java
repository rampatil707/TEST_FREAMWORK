package Test;

public class print_number {

	public static void main(String[] args) {
		// print the no 1 to 10 by using for loop
		for (int i=0;i<=10;i++) {
			System.out.println(i);
		} 
		 for (int i=20;i>=0;i--) {
			 System.out.println(i);
		 }
		
		// by using the do while print the no 1 to 10 increment and decrement
		int b=10;
		do {
			System.out.println(b);
			b= b-1;
		} while(b>=0);
		
		
		int a=1;
		do {
			System.out.println(a);
			a=a+1;
			
		} while(a<=10);
	}

}
