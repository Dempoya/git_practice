import java.util.Scanner;

public class Java4_10 {

	
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1~nまでの数をかけます");
		
		int n;
		do {
			System.out.println("正の整数を入力してね");
			n = stdIn.nextInt();
			
		}while(n<0);
		
		int factorial = 1;//積
		int i = 1;//インクリメント
		
		while(n>=i) {
			
			factorial *= i;
			i++;
		}
		
		System.out.println("1~nまでの積は"+factorial);
		
		
	
	}
}
