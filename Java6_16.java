import java.awt.Desktop.Action;
import java.util.Random;
import java.util.Scanner;

public class Java6_16 {
	
public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		String []dayEnglish = {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
		String []dayJapanese = {"月","火","水","木","金","土","日"};
		
		
		int last = -1;
		int retry;
		do {
			int day;
			do {
				day = rand.nextInt(7);
			}while(day == last);
			last = day;//問題番号の記録
			int action;
			do {
				
				System.out.print((dayJapanese[day])+"曜日：");
				String s = stdIn.next();
				if(s.equals(dayEnglish[day])) break;
				System.out.println("違うよ");
				
				do {
					System.out.println("１．再入力/０．正解を見る");
					action = stdIn.nextInt();
				}while(action !=1 && action !=0);
				
				if(action ==0)
					System.out.println(dayJapanese[day]+"曜日は"+dayEnglish[day]);
			}while(action==1);
			System.out.println("正解です。もう一度？１　　やめる２");
			retry =stdIn.nextInt();
			
		}while(retry ==1);
		
	}

}
