import java.util.Scanner;

public class Java4_12 {
	
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("カウントダウンするよ。。正の整数:");
		
		int x;
		do {
			x= stdIn.nextInt();
			
		}while(x<=0);
		
		for(;x>=0;x--)
			System.out.print(x+" ");
		
			
			
		
		
		
		
		
	
	}

}
