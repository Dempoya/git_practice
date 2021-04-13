package chapter01;

import java.util.Scanner;

public class Java2_5 {
	
	public static void main(String[]args){
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("整数を入力");
		
		int x = stdIn.nextInt();
		
		System.out.println("入力："+x);
	}

}
