package pattern_programs;

public class pattern_6 {

	public static void main(String[] args) {
		pattern1(6);
	}
	static void pattern1(int n) {
		for (int row =0; row <2*n; row++) {
			
		int totalcolsInrow = row>n ? 2 * n-row: row;
		
		int noOfSpaces = n-totalcolsInrow;
		for (int s = 0; s < noOfSpaces; s++) {
			System.out.print(" ");
		}
			for(int col =0; col < totalcolsInrow; col++) {
				
				System.out.print("* ");
			}
			//when row is printed, we need add a new line
			System.out.println();
			
		}
	}
}
