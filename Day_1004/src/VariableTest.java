
public class VariableTest {

	public static void main(String[] args) {
		// 정수 변수 선언
		int age; // 선언(declaration)
		age = 31; // 오른쪽의 값을 왼쪽 변수에 대입해라!
		System.out.println(age);
		
		age = 45;
		System.out.println(age);
		
		int grade = 4; // 선언과 초기화를 동시에
		System.out.println(grade);
		
		byte by = 125;
		short sh = 125;
		int in = 125;
		long lo = 125; // long 타입 메모리사이즈가 더커서 L을 따로 안써도 가능
		
		float fl = 42.195F; // 큰데이터가 작은 변수에 치환x
		double dbl = 42.195;
		
		//문자형
		char ch = '%'; // ASCII --> UniCode
		
		//불린형
		boolean bool = true;
	}

}
