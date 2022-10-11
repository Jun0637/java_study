import java.util.Scanner;

/*나누어 떨어지는 수 구하기
 * 키보드로 정수를 입력 받아, 4와 5로 나누어 떨어지는 지의
 * 여부를 구하는 프로그램*/
public class Exam_01 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int number;
		String and, or, result;
		boolean four, five, onlyOne;
		
		System.out.println("정수입력 : ");
		number= keyin.nextInt();
		
		four = number % 4== 0;
		five = number % 5== 0;
		onlyOne = (four && !five)|| (!four && five) ? true : false;
				   //4로만 나누어진다     5로만 나누어진다
		
		and = four && five ? "4와 5로 나누어집니다." : "4와 5로 나누어지지 않습니다.";
		or = four || five ? "4또는 5로 나누어집니다." : "4또는 5로 나누어지지 않습니다."; 
		result = onlyOne && four ? "4로 나눈어 떨어집니다" : "";
		result += onlyOne && five ? "\n5로 나눈어 떨어집니다" : "";
		
		System.out.println(and);
		System.out.println(or);
		System.out.println(result);
	}

}
