
public class ExceptionTest_05 {

	public static void main(String[] args) {
		try {
			String[] str = {"abc", "0.1"};
			int data = Integer.parseInt(str[0]);
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
		} catch(Exception e) {
			System.out.println("Exception 발생");
			e.printStackTrace();
			// return;
			System.exit(0);
		} finally {
			//마무리 작업 실시
			System.out.println("마무리");
		}
		System.out.println("===프로그램 종료===");
	}

}
