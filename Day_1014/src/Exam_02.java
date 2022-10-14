import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value, i = 1;
		System.out.print("정수 입력 : ");
		value = sc.nextInt();

		while (i <= value) {
			if (value % i == 0)
				System.out.println(i);
			i++;

		}
	}
}
