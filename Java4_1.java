import java.util.Scanner;

public class Java4_1 {
	
	
		public static void main(String[]args) {
			
			Scanner stdIn = new Scanner(System.in);
			
			int retry;//繰り返し判定
			
			do {
				System.out.print("整数値：");
				int n = stdIn.nextInt();
				
				if(n>0)
					System.out.println("正");
				else if(n<0)
					System.out.println("負");
				else 
					System.out.println("0");
				
				System.out.println("もう一度？　Yes.1/No.2");
				retry = stdIn.nextInt();
					
				
				
				
			}while(retry==1);
		
		
		}


}
