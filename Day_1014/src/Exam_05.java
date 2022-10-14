import java.util.Scanner;

public class Exam_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sum = 0;
		System.out.println("정수를 입력 : ");
		n = sc.nextInt();
		for (int i = 1; i <= n; ++i) {
			sum = sum + i; // sum += i;된다
		}
		System.out.printf("1~%d까지의 더한값: %d%n", n, sum);
	}
}
