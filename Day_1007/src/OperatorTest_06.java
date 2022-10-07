
public class OperatorTest_06 {

	public static void main(String[] args) {
		int x = 0;
		int result = 0;
		
		result = ++x; // x증가, 치환
		System.out.println(x + "," + result);
		
		x = 0;
		result = x++; // 치환, x증가
		System.out.println(x + "," + result);

	}

}
