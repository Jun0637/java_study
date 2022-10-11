//나이 < 10, 요금 -1000을 할인해준다.
//아니면 요금 -500을 할인
public class IfTest_02 {

	public static void main(String[] args) {
		int age = 7;
		int charge =12000;
		
		if(age < 10) {
			charge = charge - 1000;
		} else {
			charge = charge -500;
		}
		
		System.out.printf("지불요금 : %,d원%n", charge);

	}

}
