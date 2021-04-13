import java.util.Scanner;

public class Java4_2 {
	
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int x;
		do {
			System.out.println("3桁の整数を入力してね");
			x = stdIn.nextInt();
			
		}while(x<100||x>999);
		
		System.out.println("ok"+x);
		
	
	
	}

}
