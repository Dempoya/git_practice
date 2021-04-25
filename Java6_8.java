import java.util.Scanner;

public class Java6_8 {
	
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("人数：");
		int n = stdIn.nextInt();
		int []a = new  int[n];
		
		
		for(int i = 0;i<n;i++) {
			System.out.print("a["+i+"]=");
			a[i]= stdIn.nextInt();
			
		}
		int key =stdIn.nextInt();//探す値
		int i;
		for( i = 0;i<n;i++)
			if(a[i]==key)
				break;
		
		if(i<n)
			System.out.println("a["+i+"]");
		else 
			System.out.println("nai");
		
	}

}
