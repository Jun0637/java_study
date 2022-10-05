/* 정수변수 temp에 임의의 값을 넣어 초기화하시오.
   그의 값이 3의 배수이거나 5의 배수이면,  true 아니면false가 출력*/
public class Exam_02 {

	public static void main(String[] args) {
		boolean result;
		int temp = 3;
		
		result = temp %3 == 0 || temp % 5 == 0;
		System.out.println("결과 : "  + result);

	}

}
