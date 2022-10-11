//나이 < 10, 요금 -1000을 할인해준다.
public class IfTest_01 {

	public static void main(String[] args) {
		int age = 7;
		int charge =12000;
		
		if(age < 10) charge = charge - 1000;
		
		System.out.printf("지불요금 : %,d원%n", charge);

	}

}
