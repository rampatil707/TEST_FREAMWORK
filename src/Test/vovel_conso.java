package Test;

public class vovel_conso {

	public static void main(String[] args) {
		char c= 'R';
		
		switch(c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		System.out.println(c + "is volel");
		break;
		
		default:
			System.out.println(c + "is consonant");
		}
	}

}
