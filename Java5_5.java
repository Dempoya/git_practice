import java.util.Scanner;

public class Java5_5 {
	
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("整数a"); int a = stdIn.nextInt();
		System.out.println("整数b"); int b = stdIn.nextInt();
		System.out.println("整数c"); int c = stdIn.nextInt();
		
		double ave = (a+b+c)/3;
		System.out.printf("平均値：%.3f\n", ave);
				
	}



}
