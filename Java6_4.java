import java.util.Scanner;
import java.util.Random;
public class Java6_4 {
	
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("要素数入力：");
		int n = stdIn.nextInt();
		int []a = new int[n];
		
		for(int i =0;i<n;i++)//要素に中身をいれます
			a[i]= 1+rand.nextInt(10);//今回は１～１０
		
		for(int i =10;i>=1;i--) {
			for(int j =0;j<n;j++ )
				if(a[j]>=i)
					System.out.print("* ");
				else 
					System.out.print("  ");
			System.out.println();//改行
		}
		
		for(int i=0;i<2*n;i++)//--の出力
			System.out.print("-");
		System.out.println();
		
		for(int i =0;i<n;i++)
			System.out.print(i%10+" ");
		System.out.println();
	
	}

}
