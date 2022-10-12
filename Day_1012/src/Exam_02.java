import java.util.Scanner;

/*BMI 결과 판정하기
 * 키(cm)m 몸무기(kg)를 키보드로 입력 받는다
 * bmi = 몸무게(kg) / 키의 제곱(m)
 * double height, weight;
 * String result = null
 * 	bmi >= 35 : "고도비만"
	bmi >= 30 : "중도비만"
	bmi >= 25 : "경도비만"
	bmi >= 23 : "과체중"
	bmi >= 18.5 : "정상"
	bmi < 18.5 : "저체중"*/
public class Exam_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double height, weight;
		System.out.print("키 : ");
		height = sc.nextDouble();
		System.out.print("몸무게 : ");
		weight = sc.nextDouble();

		height = height * 0.01;

		double bmi = weight / (height * height);
		String result = null;

		if (bmi >= 35) {
			result = "고도비만";
		} else if (bmi >= 30) {
			result = "중도비만";
		} else if (bmi >= 25) {
			result = "중도비만";
		} else if (bmi >= 23) {
			result = "경도비만";
		} else if (bmi >= 18.5) {
			result = "과체중";
		} else if (bmi < 18.5) {
			result = "정상체중";
		}

		System.out.printf("당신의 BMI는 %.2f이고 '%s'상태입니다", bmi, result);

	}

}
