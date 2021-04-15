import java.util.Scanner;

public class Java4_26 {
	
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("合計と平均。何個入力しますか");
		
		int n = stdIn.nextInt();
		int i;
		int sum =0;
		for(i = 0;n>i;i++) {
			System.out.print("整数（0で終了）:");
			int t = stdIn.nextInt();
			if(t==0) break;
			sum +=t;
		}
		
		System.out.println("合計:"+ sum);
		System.out.println("平均:"+ sum/i);
	}

}
