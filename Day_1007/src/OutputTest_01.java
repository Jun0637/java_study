import java.util.Scanner;

public class OutputTest_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x;
		double y;
		String str;
		
		System.out.println("정수 입력:");
		x = scanner.nextInt();
		
		System.out.println("실수 입력:");
		y = scanner.nextDouble();
		
		System.out.println("문자열 입력:");
		str = scanner.next(); //nextLine()
		
		System.out.printf("%d %f %s %n", x, y, str);
	}

}
