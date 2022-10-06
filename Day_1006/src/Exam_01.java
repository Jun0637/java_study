/* 변수 x에 임의의 정수값으로 초기화 시킨다.
그 값이 홀수이면 "x는 홀수입니다."
그 값이 짝수이면 "x는 짝수니다." */
public class Exam_01 {

	public static void main(String[] args) {
		int a = 15;
		String x;
		
		x = (a%2 !=0) ? "x는 홀수입니다." : "x는 짝수입니다.";
		
		System.out.println(x);

	}

}
