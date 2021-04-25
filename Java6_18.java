import java.util.Scanner;

public class Java6_18 {
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("合計と平均。何個入力しますか");
	
	
	
	
	
	System.out.print("行列aに値を入れるよ");
	for(int i =0;i<4;i++) {
		for(int j =0;j<3;j++) {
			System.out.printf("a[%d][%d]:",i,j);
			a[i][j]=stdIn.nextInt();
		}
	}
	
	System.out.print("行列aに値を入れるよ");
	for(int i =0;i<4;i++) {
		for(int j =0;j<3;j++) {
			System.out.printf("a[%d][%d]:",i,j);
			a[i][j]=stdIn.nextInt();
		}
	}
		int[][]a=new int [4][3];
		int[][]b=new int [3][4];
		int[][]c=new int [4][4];//a*bを入れるよ
		
		System.out.print("行列aに値を入れるよ");
		for(int i =0;i<4;i++) {
			for(int j =0;j<3;j++) {
				System.out.printf("a[%d][%d]:",i,j);
				a[i][j]=stdIn.nextInt();
			}
		}
		System.out.print("行列bに値を入れるよ");
		for(int i =0;i<4;i++) {
			for(int j =0;j<3;j++) {
				System.out.printf("b[%d][%d]:",i,j);
				b[i][j]=stdIn.nextInt();
			}
		}
		

	}

}
