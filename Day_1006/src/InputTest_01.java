import java.util.Scanner;

//세 과목의 점수를 입력받는다. 과목 모두 70 이상이면 "수료 가능" 아니면 "수료 불가능"
public class InputTest_01 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		int E = 70;
		int M = 50;
		int S = 80;
		
		System.out.println("점수입력 : ");
		E = a.nextInt();
		System.out.println("점수입력 : ");
		M = a.nextInt();
		System.out.println("점수입력 : ");
		S = a.nextInt();
		
		System.out.println((E>=70 && M>=70 && S>=70)? "수료가능" : "수료불가능");
		

	}

}
