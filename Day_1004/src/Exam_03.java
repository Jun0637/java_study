/*실수형 변수 : height(키), weight(적정 몸무게)
  적정몸무게 = (키-100) * 0.9
  만약 키가 180이라면 몸무게는 72다 */
public class Exam_03 {

	public static void main(String[] args) {
		double height = 180;
		double weight =(180-100) * 0.9;
		System.out.print("몸무게 : " + weight);
	}

}
