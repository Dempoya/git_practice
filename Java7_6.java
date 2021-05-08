import java.util.Scanner;

public class Java7_6 {
	
	static void putChars(char c,int n) {
		while(n-->0)
			System.out.print(c);
	}
	
	static void putStars(int n) {
	
		putChars('*', n);
		
	}
	

	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("何段？");
		int n = stdIn.nextInt();
		
		for(int i=1;i<=n;i++) {
			putStars(i);
			System.out.println();//改行
		}
	}
		
}
