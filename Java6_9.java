import java.util.Scanner;

public class Java6_9 {
	
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("要素数：");
		int n =stdIn.nextInt();//
		
		double []a= new double[n];
		
		double sum = 0;
		for(int i =0;i<n;i++) {
			System.out.print("a["+i+"]=");
			a[i]=stdIn.nextDouble();
			sum += a[i];
			
		}
		System.out.println("合計"+sum);
		System.out.println("平均"+sum/n);		
			
		
	}

}
