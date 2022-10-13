
public class WhileTest_03 {

	public static void main(String[] args) {
		int i = 0;
		while (true) {
			System.out.println(i++);
			if (i == 10)
				break; // 무조건 실행하므로 출력이 1회만 실행ㄴ
		}
		System.out.println("End!");
	}

}
