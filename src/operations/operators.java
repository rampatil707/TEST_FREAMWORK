package operations;

public class operators {

	public static void main(String[] args) {
		
		// logical operators --> (&&), (||) expression
		
       int a=50;
       int b=10;
       
       System.out.println(a<b&&a<b);
       System.out.println(a<b&&a<b);
       System.out.println(a>b&&a<b);
       System.out.println(a==b&&a<b);
       System.out.println(a==b&&a>b);
       
       
       System.out.println(a<b||a<b);
       System.out.println(a>b||a<b);
       System.out.println(a>b||a>b);
       System.out.println(a==b||a<b);
       System.out.println(a==b||a>b);
       System.out.println(a<b||a>b);
       
       System.out.println(!(a==b));
       
       
       System.out.println(!(a<b));
       System.out.println(!(a>b));
       System.out.println(a<b);
       System.out.println(a>b);
       
       System.out.println(a-b);
       System.out.println(a*b);
       System.out.println(a+b);
       System.out.println(a/b);
       
       
	}

}
