import java.util.Scanner;

public class Java4_8 {
	
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("*+を何個出力しますか？");
		
		int n = stdIn.nextInt();
		
		if(n>0) {
			int i= 0;//インデックス
			while(i<n) {
				if(i%2==0)
					System.out.print("*");
				else 
					System.out.print("+");
				
				i++;
					
				
					
			}
			System.out.println();
		}
	
	}

}
