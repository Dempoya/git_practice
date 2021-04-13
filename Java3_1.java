package chapter01;

import java.util.Scanner;


public class Java3_1 {
	
	public static void main(String[]args){
		
		Scanner stdIn = new Scanner(System.in);
		
		int x = stdIn.nextInt();
		
		if(x<0) {
			System.out.println(x+"は負");
		}
		
		
	}
	

}
