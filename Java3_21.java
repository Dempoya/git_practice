import java.util.Scanner;

public class Java3_21 {
	
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("何月の季節が知りたいですか");
		
		int month = stdIn.nextInt();
		
		switch(month) {
		
		case 3:
		case 4:
		case 5: System.out.println("spring"); break;
		case 6:
		case 7:
		case 8: System.out.println("summer"); break;
		case 9:
		case 10:
		case 11:System.out.println("fall"); break;
		case 12:
		case 1:
		case 2:System.out.println("winter"); break;
		default :System.out.println("そんなのはない"); break;
		
		
		}
		
	}

}
