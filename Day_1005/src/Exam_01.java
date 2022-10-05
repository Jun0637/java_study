/* 정수변수 temp에 임의의 값을 넣어 초기화하시오.
   temp에 들어있는 값이 짝수이면 true, 홀수이면 false가 출력*/
public class Exam_01 {

	public static void main(String[] args) {
		boolean result;
		int temp =5;
		
		result = temp % 2 ==0;
		System.out.println("결과 : "  + result);

	}

}
