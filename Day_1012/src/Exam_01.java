import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int a, b, c, temp;
		
		System.out.println("1번 정수 : ");
		a = keyin.nextInt();
		
		System.out.println("2번 정수 : ");
		b = keyin.nextInt();
		
		System.out.println("3번 정수 : ");
		c = keyin.nextInt();
		
		if(a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		if(a > c) {
			temp = a;
			a = c;
			c = temp;
		}
		if(b > c) {
			temp = b;
			b = c;
			c = temp;
		}
		System.out.println(a +","+ b + "," + c);
	}

}
