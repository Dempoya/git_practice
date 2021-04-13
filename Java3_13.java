package chapter01;

import java.util.Scanner;

public class Java3_13 {
	
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("実数a:");    double a = stdIn.nextDouble();
		System.out.print("実数ｂ:");    double b = stdIn.nextDouble();
		
		double diff = a>=b? a-b:b-a;		
		System.out.println("差は"+ diff);
		
		
	}	

}
