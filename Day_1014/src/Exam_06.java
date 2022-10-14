import java.util.Scanner;

public class Exam_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year, cnt=1;
		
		System.out.println("연도를 입력 : ");
		year = sc.nextInt();

		for(int i = 1; i<= year; ++i)
			if(i % 12 ==0) {
				System.out.printf("%d년%n",i);
			++ cnt;
		}
		System.out.printf("서기 1년~%d년까지 돼지의 해는%d번이다", year, cnt);
	}

}