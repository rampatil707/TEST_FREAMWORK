package pattern_programs;

public class pattern_5 {

	public static void main(String[] args) {
		pattern1(7);
	}
	static void pattern1(int n) {
		for (int row =0; row <2*n; row++) {
		int totalcolsInrow = row>n ? 2 * n-row :row;
			for(int col =0; col < totalcolsInrow; col++) {
				
				System.out.print("* ");
			}
			//when row is printed, we need add a new line
			System.out.println();
			
		}
	}
}
