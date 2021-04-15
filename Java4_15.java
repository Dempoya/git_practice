import java.util.Scanner;

public class Java4_15{
	
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		

			
			System.out.print("０からn迄カウントアップするよ。正の整数ｎ:");
			
		
		int n;
		do {
			n = stdIn.nextInt();
		}while(n<=0);
		
		
		int sum = 0;
		for(int i =1;i<=n;i++) {
			System.out.print(i +"+");
			sum += i;
			}
		System.out.print("="+sum);
		
	
	}
		
		
		

}
