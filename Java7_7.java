import java.util.Scanner;
import java.util.Random;

public class Java7_7 {
	
	static int random(int a,int b) {//aからbの値。その中からランダムで一つ返す
		
		if(a>b)
			return a;
		else {
			Random rand = new Random();
			return a+rand.nextInt(b-a+1);
		}
	}

	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("aの値：");
		int a = stdIn.nextInt();
		System.out.print("bの値：");
		int b = stdIn.nextInt();
		
		System.out.println(random(a, b));
		
	}
		
}
