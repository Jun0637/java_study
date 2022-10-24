import java.util.Scanner;

public class Method02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 1;
		System.out.println("main method");
		a = sc.nextInt();
		
		output();
		add(10, 20); // 호출하는 쪽의 값 : 아쿠먼트(argument)
		minus(20, 30);
		
		System.out.println("End");
	}
	//메소드 정의
	public static void output() {
		System.out.println("output method");
		return;
	}
	
	//int value1, value2 : 매갠변수(parameter)
	public static void add(int value1, int value2) {
		//int value1 = 10, value2 = 20;
		int result = value1 + value2;
		System.out.println("결과 : " + result);
	}
	
	public static void minus(int a, int b) {
		int result = a - b;
		System.out.println("결과 : " + result);
	}
}
