package chapter01;

import java.util.Scanner;


public class Java3_12 {
	
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("実数a:");    double a = stdIn.nextDouble();
		System.out.print("実数ｂ:");    double b = stdIn.nextDouble();
		
		double max;
		
		if(a>b)
			max = a;
		else
			max= b;
		
		System.out.println("大きい値は"+ max);
		
		
		
		
		
	}



}
