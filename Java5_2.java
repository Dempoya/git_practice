import java.util.Scanner;

public class Java5_2 {

	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("整数：");
		int x =stdIn.nextInt();
		
		System.out.printf("8進数で%o\n",x);
		System.out.printf("16進数で%x\n",x);
	}
}
