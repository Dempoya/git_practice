import java.util.Scanner;

public class Java7_9 {
	
	static Scanner stdIn = new Scanner(System.in);//フィールド。クラスで通用
	
	static int readPlusInt() {//正の整数を入力
		int x;
		do {
			System.out.print("正の整数を入力：");
			x = stdIn.nextInt();
		}while(x<=0);
		return x;
	}
	
	
	public static void main(String[]args) {
		int x;
		do {
			int n = readPlusInt();
			System.out.print("逆順：");
			
			while(n>0) {
				System.out.print(n%10);
				n /=10;
			};
			do{
				System.out.println("\nもう一度？1/やめる0");
				x= stdIn.nextInt();
			}while(x !=1 && x !=0);
		
			
		}while(x==1);
		
		
		
	}
		

}
