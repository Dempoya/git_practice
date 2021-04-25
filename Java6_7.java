import java.util.Scanner;



public class Java6_7 {

	
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("人数：");
		int ninzu = stdIn.nextInt();
		int []a = new  int[ninzu];
		
		int sum =0;
		for(int i = 0;i<ninzu;i++) {
			System.out.println((i+1)+"番目の点数：");
			a[i]= stdIn.nextInt();
			sum += a[i];
			
		}
		
		int max = a[0];
		int min = a[0];
		for(int i =1;i<ninzu;i++) {
			if(a[i]>max)
				max =a[i];
			if(a[i]<min)
				min = a[i];
		}
		System.out.println("合計"+sum);
		System.out.println("平均"+(double)sum/ninzu);
		System.out.println("最高"+max);
		System.out.println("最低"+min);
		
	
	}
}
