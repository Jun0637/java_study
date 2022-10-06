import java.util.Scanner;

// 키보드로부터 정수를 입력받아 짝홀 판별하는 프로그램
public class OperatorTest_05 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		int b;
		
		System.out.print("정수 입력");
		b = a.nextInt();
		
		System.out.println((b%2==0)? b+" = 짝수" : b+" = 홀수");
	

	}

}
