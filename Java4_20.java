import java.time.Month;
import java.util.Scanner;

public class Java4_20 {

	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("季節を表示します");
		int retry; 
		
		do {
			int month; 
			do{
				System.out.println("何月の季節を表示しますか？");
				month = stdIn.nextInt();
			}while(month<1||month>12);
			
			if(month>=3 && month<=5)
				System.out.println("spring");
			else if(month>=6 && month<=8)
				System.out.println("summer");
			else if(month>=9 && month<=11)
				System.out.println("fall");
			else if(month == 12 || month == 1 || month == 2)
				System.out.println("winter");
			
			System.out.println("もう一度？");
			retry = stdIn.nextInt();
			
		}while(retry==1);
		
	}
}
