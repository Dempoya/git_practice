import java.util.Scanner;

public class Java3_19 {
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("整数A:");	int a = stdIn.nextInt();
		System.out.println("整数B:");	int b = stdIn.nextInt();
		System.out.println("整数c:");	int c = stdIn.nextInt();
		
		if(a>b) {  //昇順ソート。aとbの入れ替え
			int t = a;  a = b;  b = t;
		}
		
		if(b>c) {
			int t = b; b = c; c = t;
		}
		
		if(a>b) {
			int t = a; a = b; b = a;
			
		}
		
		System.out.println("昇順に並び変えました。"+a+b+c);
		
		
	}

}
