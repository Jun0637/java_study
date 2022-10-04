  /*사과 개당 4300원인 사과가 2335개 있다.
  도매상 13명이 나눠 가져가려고 하면 한명당 얼마를 내야하는가 
  */
public class Exam_02 {

	public static void main(String[] args) {
		int price = 4300;
		int count = 2335;
		int person = 13;
	
		System.out.print("한명당 계산할 금액 :" + (price * count) / person);
	}

}
