
public class WhileTest_01 {

	public static void main(String[] args) {
		int cnt = 0; // 초기식

		while (cnt < 10) {// 조건식
			System.out.println("반복한 문장 = " + cnt);
			cnt = cnt + 1; // 증감식
		}
		System.out.println("종료");
	}

}
