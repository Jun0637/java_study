import java.util.Scanner;

/*기본급가 초과 근무 시간을 입력 받아, 실수령액을 구하는 프로그램을 작성하시오.
 * 실수령액 = 기본급 + 시간수당 - 세금(기본급의 10%)
 * 시간수당 = 초과근무시간 ㅌ 15000*/
public class Exam_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int basic, overTime; //기본급, 초과근무시간
		double total;
		
		System.out.print("기본급 : ");
		basic = sc.nextInt();
		
		System.out.print("초과근무시간 : ");
		overTime = sc.nextInt();
		
		total = basic * 0.9 + (overTime * 15000);
		System.out.printf("실수력액 : %,d원%n",(int)total);

	}

}
