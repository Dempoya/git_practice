import java.util.Scanner;

public class Java4_9 {

	
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("桁数を出力します");
		
		int n;
		do {
			System.out.println("正の整数を入力してね");
			n = stdIn.nextInt();
			
		}while(n<0);
		
		int digit = 0;//桁数のカウント
		while(n>0) {
			digit++;
			n /= 10;
		}
		System.out.println("桁数は"+ digit);
	
	}
}
