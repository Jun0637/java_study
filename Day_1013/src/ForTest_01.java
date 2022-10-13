import java.util.Scanner;

public class ForTest_01 {

	public static void main(String[] args) {
		// 변수 i는 for문 내부에서만 사용할 수 잇는 지역변수다
		int i = 0;
		for (i = 0; i < 10; ++i) {
			System.out.println(i);
		}
		System.out.println("end : " + i);

		int o = 2;
		for (o = 2; o <= 20; o += 2) {
			System.out.println(o + "");

		}
		int y = 1;
		for (y = 1; y <= 20; ++y) {
			if (y % 3 == 0 || y % 5 == 0)
				System.out.println(y + "");
		}
		int x =0, value;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("100미만의 정수입력 : ");
		value = sc.nextInt();
		
		for(x=2 ; x < value; ++x) {
			if(value<0 || value>100) {
				System.out.println("잘못된 값");
				System.exit(0);
			}
			if(x%i == 0) {
				System.out.printf("%d , 소수가 아니다",x);
				System.exit(0);
			}
		}
		System.out.println("소수다");
	}
}