
public class Exam_01 {

	public static void main(String[] args) {
		/* 변수 3개(KOR, ENG, MATH) 선언 후 임의이 값으로 초기화
		실수형 변수 2개 선언 : total, avg*/
		int Kor = 50;
		int Eng = 40;
		int Math = 70;
		
		double total = Kor + Eng + Math;
		double avg = total / 3; // promotion : 데이터 타입을 맞춘 후 연산 => d / i => d / d
		
		System.out.println(total);
		System.out.println(avg);
		

	}

}
