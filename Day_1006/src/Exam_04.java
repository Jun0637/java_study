import java.util.Scanner;

/*출결, IT, 일본어 세 과목의 점수를 입력 받는다. 이때 각각의 점수비중은 40%, 30%, 30% 이다.
  총 점수가 70점 이상이면 "수료여부
  : true" 그렇지 않다면 "수료여부 : false"를 출력하시오*/
public class Exam_04 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		int daily;
		int it;
		int jp;
		
		System.out.println("츨결 점수: ");
		daily = a.nextInt();
		System.out.println("IT 점수 : ");
		it = a.nextInt();
		System.out.println("일본어 점수 : ");
		jp = a.nextInt();
		
		double total = (daily*0.4)+(it*0.3)+(jp*0.3);
		System.out.println("총 점수 :" + total);
		System.out.println(total>=70 ? "수료" : "수료불가능");

	}

}
