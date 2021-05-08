
import java.util.Scanner;

public class Java7_5 {
	
	static String seasonOf(int m) {
		
		switch(m) {
			case 3:case 4:case 5:return "春";
			case 6:case 7:case 8:return "夏";
			case 9:case 10:case 11:return "秋";
			case 12:case 1:case 2:return "冬";
		}
		return "";
	}
	
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		int month;
		do{
			System.out.print("何月の季節？：");
			month = stdIn.nextInt(); 
		
		}while(month<1||month>12);
		
		System.out.println(seasonOf(month));
		
		
	}
		

}
