import java.util.Scanner;
public class Java5_8 {

	
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("x   x*x");
		System.out.println("_________");
		
		
		for(float x = 0.0f;x<=1.0f;x +=0.001f)
			System.out.printf("%5.3f  %10.7f\n",x,x*x);
		
	}


}
