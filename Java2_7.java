package chapter01;

import java.util.Scanner;

public class Java2_7 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("整数を打ち込んでください");
		
		int x = stdIn.nextInt();//入力待ち
		
		System.out.println("最下位桁をのぞいた値"+ x/10);
		System.out.println("最下位桁の値"+x%10);
		
		
		
	}
}
