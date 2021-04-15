import java.util.Scanner;

public class Java4_25 {

	
	
		public static void main(String[]args) {
			
			Scanner stdIn = new Scanner(System.in);
			
			System.out.println("素数判定装置。２以上の整数を入力してね");
			int n;
			do {
				n = stdIn.nextInt();
			} while (n<2);
			
			int i;
			for(i=2;i<=n;i++)
				if(n%i==0)
					break;
			if(n==i)
				System.out.println("素数");
			else
				System.out.println("違う");
			
			
		}
}
