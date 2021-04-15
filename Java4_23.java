import java.util.Scanner;

public class Java4_23 {
	
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("ピラミッドを表示します。段数は？");
		int n = stdIn.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j =1;j<=n-i;j++)//空白を入れる
				System.out.print(" ");
			for(int j =1;j<=2*i-1;j++)
				System.out.print("*");
			System.out.println();
				
		}
		
	}

}
