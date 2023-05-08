package Test;

import java.util.Scanner;

public class circle {

	public static void main(String[] args) {
		
		int r;
		double PI=3.14;
		System.out.println("enter radius of circle");
		Object system;
		Scanner scan =new Scanner(System.in);
		
		r=scan.nextInt();
		PI = r*r*3.14;
		System.out.println("Area of circle"+PI);
		
		
		
	}

}
