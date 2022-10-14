import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value ,sum = 0, cnt = 0;
	
		while (true) {
			System.out.print("정수 입력 : ");
			value = sc.nextInt();		
			++ cnt;
			sum = sum + value;
			System.out.println("현재까지의 합계 : " + sum);
			if (sum>100) break;
		}
		System.out.printf("총%d회 입력받았습니다.%n",cnt);
	}
}