import java.util.Random;
import java.util.Scanner;

public class Java6_13 {
	
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("要素数：");
		int n =stdIn.nextInt();
		int []a = new int [n];
		
		for(int i =0;i<n;i++) {
			System.out.print("a["+i+"]=");
			a[i]=stdIn.nextInt();
		}
		
		for(int i=0;i<n*2;i++) {
			
			int x1 = rand.nextInt(n);
			int x2 = rand.nextInt(n);
			int t = a[x1];
			a[x1] = a[x2];
			a[x2] = t;
		}
		
		System.out.println("要素をかき混ぜました");
		for(int i=0;i<n;i++)
			System.out.println("a["+i+"]="+a[i]);
	}

}
