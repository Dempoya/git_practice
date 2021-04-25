import java.util.Random;
import java.util.Scanner;

public class Java6_15 {

	
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		String []monthStrings = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		
		System.out.print("要素数：");
		int n =stdIn.nextInt();
		
		int last = -1;
		int retry;
		do {
			int month;
			do {
				month = rand.nextInt(12);
			}while(month == last);
			last = month;//問題番号の記録
			
			while(true) {
				
				System.out.print((month+1)+"月：");
				String s = stdIn.next();
				if(s.equals(monthStrings[month])) break;
				System.out.println("違うよ");
			}
			System.out.println("正解です。もう一度？１　　やめる２");
			retry =stdIn.nextInt();
			
		}while(retry ==1);
		
	}
}
