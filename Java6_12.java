import java.util.Random;
import java.util.Scanner;

public class Java6_12 {
	
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("要素数：");
		int n =stdIn.nextInt();
		int []a = new int [n];
		
		for(int i=0;i<n;i++) {
			int j;
			do{
				j=0;
				a[i]=1+rand.nextInt(10);
				for( ;j<i;j++)
					if(a[j]==a[i]) break;
						
			}while(i>j);
		}
		
		for(int i=0;i<n;i++)
			System.out.println("a["+i+"]="+a[i]);
		
	}

}
