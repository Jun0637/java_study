import java.util.Scanner;

/*세 가지 수를 입력받아
 * 삼항연 연산자만 사용해야 하며, if문은 사용할 수 없다.
 * 출력문은 프로그램 하단에 단 한 줄만 사용해야 한다.*/
public class Exam_04 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int a, b, c, temp;
		System.out.println("1번째 수");
		a = keyin.nextInt();
		System.out.println("2번째 수");
		b = keyin.nextInt();
		System.out.println("3번째 수");
		c = keyin.nextInt();
		
		// a가 b보다 큰값을 갖도록 설정
		temp = (b > a) ? a :0; // 둘 중 작은값이 temp
		a = (temp !=0)? b : a;
		b = (temp !=0)? temp : b;
		
		temp = 0;
		// a가 c보다 큰값을 갖도록 정렬
		temp = (c > a) ? a :0; // 둘 중 작은값이 temp
		a = (temp !=0)? c : a;
		c = (temp !=0)? temp : c;
		
		temp = 0;
		// b가 c보다 큰값을 갖도록 정렬
		temp = (c > b) ? b :0; // 둘 중 작은값이 temp
		b = (temp !=0)? c : b;
		c = (temp !=0)? temp : c;
		
		System.out.println(a + "," + b + "," + c);


	}

}
