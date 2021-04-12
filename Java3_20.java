
import java.util.Random;


public class Java3_20 {
	public static void main(String[]args) {
	
	Random rand= new Random();
	
	
	int hand = rand.nextInt(3);//0~2の乱数生成
	
	switch(hand) {
	
	case 0: System.out.println("ぐー"); break;
	case 1: System.out.println("ちょき"); break;
	case 2: System.out.println("パー"); break;
	}
	
	
	}

}
