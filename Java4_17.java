import java.util.Scanner;

public class Java4_17 {
	
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("*を出力します。いくつ？：");
		int n = stdIn.nextInt();
		
		if(n>0) {
			for(int i=0;i<n;i++) {
				System.out.print("*");
				if(i%5==4)
					System.out.println();
			}
			
			if(n%5 !=0) 
				System.out.println();
				
			
		}
		
	
	}

}
