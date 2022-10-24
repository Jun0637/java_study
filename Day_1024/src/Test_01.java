import java.util.Scanner;

public class Test_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		int result = 0;
		System.out.println("정수1를 입력하세요");
		a = sc.nextInt();
		System.out.println("정수2를 입력하세요");
		b = sc.nextInt();
		System.out.println("1)덧셈 2)뺄셈 3)곱셈 4)나누기 0)종료");
		String choice = sc.next();
		switch(choice){
			case "1" : result = add(a, b); break;
			case "2" : result = minus(a, b); break;
			case "3" : result = multiply(a, b); break;
			case "4" : result = divide(a, b); break;
			case "0" : System.out.println("프로그램 종료");return;
			default : System.out.println("다시 선택해주세요");
		}
		
		System.out.println("결과: " + result);
	}
	public static int add(int a, int b) {
		return a + b;
	}
	public static int minus(int a, int b) {
		return a-b;
	}
	public static int multiply(int a, int b) {
		return a*b;
	}
	public static int divide(int a, int b) {
		return a/b;
	}
}
