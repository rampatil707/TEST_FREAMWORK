package jump_statment;

public class continue_break_return {

	public static void main(String[] args) {
		
		for (int a=1; a<=10;a++){
			if(a==6){
				continue;
				
			}
			System.out.println(a);
			
			if(a==9) {
				break;	
			}
			
			
			
		}
		
		boolean b=true;
		System.out.println("everything is fine");
		
		if(b) {
			return;
		}
            System.out.println("not working fine");
            
	}

}
