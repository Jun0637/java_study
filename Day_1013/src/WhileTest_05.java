import java.util.Scanner;

public class WhileTest_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i = 0, value;
		System.out.print("정수입력 : ");
		value = sc.nextInt();

		while (i < 9) {
			i++;
			System.out.println(i * value);

		}
	}

}
