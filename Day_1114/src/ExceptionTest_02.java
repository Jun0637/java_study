import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest_02 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int count = 0; // 글의 개수를 세는 변수
		int weight = 0;// 귤의 무게를 입력받는 변수

		while (true) {
			System.out.print("귤의 크기 입력");
			try {
				weight = keyin.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("입력오류!");
				keyin.nextLine(); // 버퍼를 비운다.
				continue;
			}
			if (weight >= 10 && weight <= 15) {
				++count;
			}
			System.out.println(count + "개 포장");
			if (count >= 5)
				break;
		}
		System.out.println("포장완료");
	}

}
