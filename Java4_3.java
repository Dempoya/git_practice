import java.util.Scanner;
import java.util.Random;

public class Java4_3 {
	
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		int no =10+ rand.nextInt(99);//当てたい数
		int x;
		do {
			System.out.println("当ててみてね");
			x = stdIn.nextInt();//回答
			
			if(x<no)
				System.out.println("もっと大きいよ");
			else
				System.out.println("もっと小さいよ");
			
			
		}while(x != no);
		
		System.out.println("大当たり");
	}

}
