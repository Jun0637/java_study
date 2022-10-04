/*원기둥의 부피를 구하는 프로그램을 작성하시오
반지름, 높이를 정수로 선언, 부피는 실수로 선언
원기둥의 부피=원주율(3.14) X 반지름 X 반지름 X 높이*/
public class Exam_05 {

	public static void main(String[] args) {
		int a = 15; // 반지름
		int b = 20; // 높이
		
		double c = 3.14 * a * a * b;
		
		System.out.println("원기둥의 부피 : " + c);
	}

}