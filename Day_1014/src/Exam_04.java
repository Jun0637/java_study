
public class Exam_04 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; ++i) {
			sum = sum + i; // sum += i;된다
		}
		System.out.println("1부터 10까지의 수는" + sum + "입니다.");
	}
}
