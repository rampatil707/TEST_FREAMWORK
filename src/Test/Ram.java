package Test;

public class Ram {

	public void r1() {
		System.out.println("Team bugspotter");
	}
	
	public void r2 () {
		System.out.println("team static");
		
		}
	public void add (int a,int b,int c) {
    System.out.println(a+b+c);
	}
	public void sub (int a,int b) {
		System.out.println(a-b);
	}
	public void mul (int a,int b) {
	System.out.println(a*b);	
	}
	public void div (int a,int b) {
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		Ram test=new Ram();
        
		test.r1();
		test.r2();
		test.add(10,20,30);
		test.sub(90,45);
		test.mul(25,35);
		test.div(75,25);
	}

}
