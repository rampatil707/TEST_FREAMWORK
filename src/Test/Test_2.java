package Test;

public class Test_2 {
    int b=50;         //instance varible-- non static
    static int c=70;  //static varible-- class varible
    
    
	public static void main(String[] args) {
	int a=20;
	System.out.println(a);
	System.out.println(Test_2.c);
	
	Test_2 test=new Test_2();
	System.out.println(test.b);
	
	

	}

}
