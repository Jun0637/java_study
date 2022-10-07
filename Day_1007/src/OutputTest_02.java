
public class OutputTest_02 {

	public static void main(String[] args) {
		int x = 25;
		int y = 3345000;
		
		System.out.printf("x = %-5d, y=%,d %n",x, y);
		
		double a = 256.55;
		double b = 33345.45678;
		
		System.out.printf("a = %.2f, b=%,.2f %n",a, b);
		
		char ch = 'a';
		System.out.printf("문자 a = %d%n", (int)ch);

		double discount = 10; // 할인율은 10%입니다.
		System.out.printf("할인율 %.0f%%입니다.", discount);
	}

}
