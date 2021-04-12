
import java.util.Scanner;

public class Ja1 {
	
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("整数A:");	int a = stdIn.nextInt();
		System.out.println("整数B:");	int b = stdIn.nextInt();
		
		if(a<b) {  //降順ソート。aとbの入れ替え
			int t = a;
			a = b;
			b = t;
		}


	}

}
