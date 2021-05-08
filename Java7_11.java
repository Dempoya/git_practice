import java.util.Scanner;

public class Java7_11 {
	
	static int pow2(int no) {
		int pw = 1;
		while(no-->0) 
			pw *= 2;
		return pw;
	}

	
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("x ×　２のべき乗の計算を行います");
		System.out.println("x:"); int x = stdIn.nextInt();
		System.out.println("n:"); int n = stdIn.nextInt();
		
		int mPower = x * pow2(n);
		int dPower = x / pow2(n);
		
		int lShift = x << n;
		int rShift = x >> n;
		
		System.out.printf("");
		System.out.printf("");
		System.out.printf("");
		System.out.printf("");

		
	}
		
}
