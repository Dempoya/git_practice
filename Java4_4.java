import java.util.Scanner;

public class Java4_4 {
	
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("二つの整数を入力してください");
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		if(a>b) {
			int t = a; a =b; b =t;
		}//いれ替え
		
		do {
			System.out.print(a+" ");
			a = a+1;
			
		}while(a<=b);
	
	
	}

}
