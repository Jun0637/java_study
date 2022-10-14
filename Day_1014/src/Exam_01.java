import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int value;

		while (true) {
			System.out.print("정수를 입력: ");
			value = keyin.nextInt();

			if (value == 0)
				break;
			if (value < 0 || value > 100) {
				System.out.println("입력 값 오류");
			}
		}
	}
}