package pattern_programs;

public class pattern_2 {

	public static void main(String[] args) {
		pattern1(10);

	}

	static void pattern1(int n) {
		for (int row =1; row <=n; row++) {
			//for every row,run the coloun
			for(int col =1;col <=n; col++) {
				
				System.out.print("*");
			}
			//when row is printed, we need add a new line
			System.out.println();
			
		}
	}
}
