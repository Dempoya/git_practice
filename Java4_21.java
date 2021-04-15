import java.util.Scanner;

public class Java4_21 {

	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("正方形をひょうじします。何角？");
		
		int n = stdIn.nextInt();
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++)
				System.out.print("* ");
			System.out.println();
		}
		
		
		
	}
}
