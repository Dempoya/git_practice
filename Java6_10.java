import java.util.Scanner;
import java.util.Random;

public class Java6_10 {
	
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		
		int n =stdIn.nextInt();
		int[]a = new int[n];
		
		for(int i=0;i<n;i++)
			a[i]=1+rand.nextInt(10);
		
		for(int i=0;i<n;i++)
			System.out.println("a["+i+"]="+a[i]);
		
	}

}
