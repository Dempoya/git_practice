import java.util.Scanner;

public class Java4_19 {
	
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("正の整数を入力してください：");
		int n = stdIn.nextInt();
		
		for(int i = 1;i<=n;i++)
			System.out.print(i*i+" ");
		
		System.out.println();
			
		
	}

}
