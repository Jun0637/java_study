
public class Method03 {

	public static void main(String[] args) {
		double result;
		result = divide(30, 45);
		System.out.println("결과 : " + result);
	}

	// 정의
	public static double divide(int a, int b) {
		return (double) a / b;
	}

	public static double max(double a, double b) {
		double c = (a > b) ? a : b;
		return c;
	}

	public static String positive(int a) {
		// 1번 방법
		/*String str;
		if (a > 0)
			str = "양수";
		else if (a < 0)
			str = "음수";
		else
			str = "영";*/
		// 2번 방법
		return a > 0 ? "양수" : (a < 0) ? "음수" : "영";
	}
}
