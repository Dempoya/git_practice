import java.util.Scanner;

public class Java7_4 {
	
	static int sumUp(int n) {
		
		int sum =0;
		for(int i=0;i<=n;i++)
			sum += i;
		return sum;
	}
	
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		int x;
		do {
			System.out.print("正の整数を入力：");
			x = stdIn.nextInt();
		}while(x<=0);
		
		System.out.println("1~"+x+"までの和："+sumUp(x));
		
		
	}
		

}
