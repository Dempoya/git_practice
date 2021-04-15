import java.util.Scanner;

public class Java4_11 {

	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("*を好きなだけ出力");
		System.out.print("いくつ？:");
		
		int n = stdIn.nextInt();
		
		if(n>0) {
			for(int i= 0;i<n;i++)
				System.out.print("*");
			System.out.println();
		}
		
			
	}
}
