import java.util.Scanner;

public class WhileTest_04 {

	public static void main(String[] args) {
		String choice;
		Scanner keyin = new Scanner(System.in);

		while (true) {
			System.out.println("* 메뉴를 선택 : ");
			choice = keyin.next();

			switch (choice) {
			case "1":
				System.out.println("1을 선택");
				break;
			case "2":
				System.out.println("2을 선택");
				break;
			case "0":
				System.out.println("종료합니다");
				System.exit(0);
			default :
				System.out.println("err > 선택 오류");
			}
		}
	}
}
