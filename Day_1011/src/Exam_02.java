import java.util.Scanner;

/*키보드로 0 부터 999까지의 정수를 입력 받은 수 각각의 자릿수의 합한결과를 출력하는 프로그램을 만드세오.
 * 단, 사용자가 입력한 수는 999를 넘지 않는 것으로 한ㄷ,*/
public class Exam_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number, digit, decimal, hundred;
		
		System.out.println("0~999사이의 정수 :"); //456
		number = scanner.nextInt();
		
		hundred = number / 100;
		decimal = number % 100 / 10;
		digit = number % 100 % 10;
		System.out.println(hundred + decimal + digit);
	}

}
