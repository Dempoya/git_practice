import java.util.Scanner;

public class Java6_19 {
	
	public static void main(String[]args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		final int ninzu = 6;//生徒の人数
		int [][]point = new int [ninzu][2];//二次元配列
		int []sumstudent = new int[ninzu];//各生徒の合計点
		int []sumsubject = new int[2];//国語の合計点、数学の合計点
		
		System.out.printf("人数：%d人/国語・数学の点数を入力します\n",ninzu);
		for(int i=0;i<ninzu;i++) {
			System.out.printf("%2d番・・・国語:",i+1);
			point[i][0] = stdIn.nextInt();
			System.out.print("       数学:");
			point[i][1] = stdIn.nextInt();
			
			sumstudent[i]=point[i][0]+point[i][1];//各生徒の合計点
			sumsubject[0] +=point[i][0];//国語の合計点
			
		}
		System.out.println("No.  国語  数学  平均");
		for(int i=0;i<ninzu;i++)
			System.out.printf("%2d%6d%5d%6.1f\n",i+1,point[i][0],point[i][1],(double)sumstudent[i]/2);
	}

}
