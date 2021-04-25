import java.util.Scanner;

public class Java5_7 {


	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("float   int");
		System.out.println("___________");
		
		float x = 0.0f;
		for(int i = 0;i<=1000;i++,x +=0.001f)
			System.out.printf("%9.7f   %9.7f\n",x,(float)i/1000);
		
		
	}


}
