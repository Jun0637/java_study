import java.util.Scanner;

public class Exam_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start, end, count = 0, n = 1;
		start = 5;
		end = 15;

		System.out.println("첫번째 정수 : ");
		start = sc.nextInt();
		System.out.println("두번째 정수 : ");
		end = sc.nextInt();

		while (start <= end) {
			if (count == 5 * n) {
				n++;
				System.out.println();
			}
			System.out.printf("%d ", start);
			start++;
			count++;
		}

	}

}
