import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest_04 {

	public static void main(String[] args) throws Exception {
		int[] ary = new int[5];
		Scanner keyin = new Scanner(System.in);
		try {
			for (int i = 0; i < ary.length; ++i) {
				System.out.println("정수 입력 : ");
				ary[i] = keyin.nextInt();
				if (!(ary[i] >= 10 && ary[i] <= 20)) {
					throw new Exception("입력값이 범주(10-20)를 벗어낫습니다.");
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("잘못된 문자열이 입력되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
