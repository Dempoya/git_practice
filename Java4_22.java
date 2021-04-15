import java.util.Scanner;

public class Java4_22 {
	
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("直角三角形を表示します。段数は？");
		
		int n = stdIn.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++)
				System.out.print("*");
			System.out.println();
			
		}
		
		System.out.println("左上が直角の三角形を表示します。段数は？");
		int m = stdIn.nextInt();
		
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=m-i+1;j++)
				System.out.print("*");
			System.out.println();
			
		}
		
	}

}
