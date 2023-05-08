package pattern_programs;

public class strar_pattern {

public static void main(String[] args) {
	
	 pattern1(4);
		
	}
    
    
	static void pattern1(int n) {
		for (int row =1; row <=n; row++) {
			//for every row,run the coloun
			for(int col =1;col <=row; col++) {
				
				System.out.print("* ");
			}
			//when row is printed, we need add a new line
			System.out.println();
			
		}
	}
	
}
