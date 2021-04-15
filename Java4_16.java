import java.util.Scanner;

public class Java4_16 {
	
	
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("");
		
		System.out.print("何㎝から");
		int hmin = stdIn.nextInt();//ここから
		
		System.out.print("何センチまで");
		int hmax = stdIn.nextInt();//ここまで
		
		System.out.print("何㎝ごと？");
		int step = stdIn.nextInt();//刻み
		
		System.out.println("身長　　標準体重");
		System.out.println("ーーーーーーーーー");
		for(int i=hmin;i<=hmax; i +=step)
			System.out.println(i+"  "+(i-100)*0.9);
		
		
			
	}
			

}
