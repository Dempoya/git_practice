import java.util.Random;
import java.util.Scanner;


public class Java7_10 {
	
	static Scanner stdIn = new Scanner(System.in);
	
	static boolean comfirmRetry() {
		int cont;
		do {
			System.out.println("正解");
			System.out.println("retry1/quit0");
			cont = stdIn.nextInt();
		}while(cont !=1 && cont !=0);
		
		return cont == 1;
	}

	public static void main(String[]args) {
		
		Random rand = new Random();
		System.out.println("暗算トレーニング");
		
		do {
			
			int x =100 + rand.nextInt(900);//三桁
			int y =100 + rand.nextInt(900);
			int z =100 + rand.nextInt(900);
			int pattern = rand.nextInt(3);
			
			int ans = 0;
			switch(pattern) {
			
			case 0: ans = x+y+z; break;
			case 1: ans = x+y-z; break;
			case 2: ans = x-y+z; break;
			case 3: ans = x-y-z; break;
			}
			while(true){//答えが合うまでループ
				System.out.print(x + ((pattern<2)?      "+":"-") +
								 y + ((pattern %2 ==0)? "+":"-") +	
								 z + "=");
				int k = stdIn.nextInt();
				if(k == ans) 
					break;
				System.out.println("ちがいます");
			}
		}while(comfirmRetry());
		
		
		
	}
		
}
