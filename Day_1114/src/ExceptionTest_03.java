import java.util.Scanner;

public class ExceptionTest_03 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int x, y;

		System.out.println("두개의 정수를 입력하세요");
		x = keyin.nextInt();
		y = keyin.nextInt();

		try {
			int result = calc(x, y);
			System.out.println("결과 : " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static int calc(int x, int y) throws Exception { // 메소드 내부에서 발생한 익셉션을 호출했던 곳으로 익센셥 전가
		// y는 0 을 초과하는 값이어야 한다
		if (y <= 0) {
			throw new Exception("y는 0을 초과해야합니다.");
		}
		return x + y;
	}

}
