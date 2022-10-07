import java.util.Scanner;

//키보드로 정수를 입력 받아, 4와 5로 나누어 떨어지는 지의 여부를 구하는 프로그램을 작성하시오.
public class Exam_01 {

	public static void main(String[] args) {
		Scanner temp = new Scanner(System.in);
		boolean result;
		int a;
		
		System.out.println("정수를 입력");
		a=temp.nextInt();
		
		System.out.println((a % 20 == 0)? a+"4와 5로 나누어집니다" : "4와 5로 나눠지지 않습니다." );
		System.out.println((a % 4 == 0 || a % 5 == 0) ? a+"4 또는 5로 나누어집니다" : "");
		System.out.println((a %4 == 0 || a % 5 == 0) && (a % 4 == 0 && a % 5 != 0)? "4로 나누어집니다" :
			(a %4 == 0 || a % 5 == 0) && (a % 4 != 0 && a % 5 == 0) ? "5로 나누어집니다" : "");
	}
}
