/*실수형 변수 3개 선언(height, weight, bmi)
  - 키의 단위(cm), 몸무게의 단위(kg)으로 가각 초기화
  - bmi = 몸무게/(kg) / 키(m)의 제곱 */
public class Exam_04 {

	public static void main(String[] args) {
		double height, weight, bmi;
		
		height = 180;
		weight = 70;
		
		height = height * 0.01; // 왼쪽 변수 초괴화시키고 다시 넣기
		
		bmi = (weight / (height * height));
		
		System.out.println("BMI : " + bmi);

	}

}
