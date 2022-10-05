
public class OperatorTest_03 {

	public static void main(String[] args) {
		boolean result;
		int age = 6;
		
		// 나이가 7세 미만인가? true, false
		result = age < 7;
		
		System.out.println("결과 : " + result);
		
		age = 65;
		// 나이가 70세 이상인가?
		result = age >= 70;
		
		System.out.println("결과 : "  + result);
		
		// 나익가 6세 미만이거나 65세 이상인가?
		// || (or) : 둘 중 하나만 참이면 결과가 참
		result = age < 6 || age >= 65;
		
		System.out.println("결과 : "  + result);
		
		// &&(and) : 조건 연산의 모든 결과가 참이여야 됨
		int score = 78;
		result = score >= 90 && score <=100;
		
		System.out.println("결과 : "  + result);
		
		// 위 23라인의 코드를 !(부정) 연산자와 함께
		// 사용하여 동일한 결과를 출력하시오.
		
		result = !(score < 90 || score >100);
		
		System.out.println("결과 : "  + result);
		
	}

}
