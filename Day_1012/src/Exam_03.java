import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value1, value2;
		String operator;
		System.out.println("숫자 1입력 : ");
		value1 = sc.nextInt();

		System.out.println("숫자 2입력 : ");
		value2 = sc.nextInt();

		System.out.println("연산자 : ");
		operator = sc.next();

		switch (operator) {
		case "+":
			System.out.printf("결과 : %d + %d = %d", value1, value2, value1 + value2);
			break;
		case "-":
			System.out.printf("결과 : %d - %d = %d", value1, value2, value1 - value2);
			break;
		case "*":
			System.out.printf("결과 : %d * %d = %d", value1, value2, value1 * value2);
			break;
		case "/":
			System.out.printf("결과 : %d / %d = %d", value1, value2, value1 / value2);
			break;
		default:
			System.out.println("연산자 오류");
			break;
		}

	}

}
