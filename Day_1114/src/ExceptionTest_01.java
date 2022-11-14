
public class ExceptionTest_01 {

	public static void main(String[] args) {
		String[] str;
		str = new String[] { "1", "0", "abc", "42.195" };

		int temp;

		System.out.println(Integer.parseInt(str[0]));
		try {
			temp = Integer.parseInt(str[1]);

			int result = 10 / temp; // exception 1

			System.out.println(result);
			//temp = Integer.parseInt(str[2]); // exception 2
			//temp = Integer.parseInt(str[3]); // exception 2
			temp = Integer.parseInt(str[4]); // exception 3
		} catch (ArithmeticException e) {
			System.out.println("에러발생 -0으로 나눔");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("프로그램 마무리");
		}
		System.out.println("Exception과 상관없는 코드");
	}
}
