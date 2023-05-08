package pattern_programs;

public class pattern_7 {

	public static void main(String[] args) {
	pattern1(10);	
	}
	static void pattern1(int n) {
		for (int row =1; row <1*n; row++) {
			
		int totalcolsInrow = row>n ? 2 * row: row;
		
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
