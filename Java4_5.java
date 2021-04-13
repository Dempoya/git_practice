import java.util.Scanner;

public class Java4_5 {
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("");
		
		int x;
		
		do {//正の整数が入力されるまでループ
			System.out.println("正の整数を入力：");
			x = stdIn.nextInt();
		}while(x<=0);
		
		while(x>=0)//trueの間ループ
			System.out.print(" "+x--);
			
		
	}
	
		
		
}
