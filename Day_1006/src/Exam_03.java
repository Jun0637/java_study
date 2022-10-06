import java.util.Scanner;

/*운영체제, 네트워크, 데이터베이스 과목의 점수를 입력 받는다. 
  네트워크는 반드시 80점 이상이어야 통과하고, 평균은 반드시 70점 이상이어야 한다.
  한 과목이라도 50점 미만인 경우는 과락으로 불합격이다. 평균과 합격 여부를 출력하시오
*/
public class Exam_03 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		int os;
		int net;
		int db;
		
		System.out.println("운영체제 점수 : ");
		os = a.nextInt();
		System.out.println("네트워크 점수 : ");
		net = a.nextInt();
		System.out.println("데이터베이스 점수 : ");
		db = a.nextInt();
		
		int avg = (os+net+db)/3;
		
		System.out.println("평균 = "+ avg);
		System.out.println((os>50 && net>=80 && db>50 && avg>=70) ? "합격" : "불합격");

	}

}
