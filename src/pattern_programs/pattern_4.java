package pattern_programs;

public class pattern_4 {

	public static void main(String[] args) {
		pattern1(7);
	}
	static void pattern1(int n) {
		for (int row =1; row <=n; row++) {
			//for every row,run the coloun
			for(int col =1; col <= row; col++) {
				
				System.out.print(col);
			}
			//when row is printed, we need add a new line
			System.out.println();
			
		}
	}
}
