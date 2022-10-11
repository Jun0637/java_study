import java.util.Scanner;

public class IfTest_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		
		System.out.println("정수입력 : ");
		number = sc.nextInt();
		
		if(number%2 ==0)
			System.out.println(number + "짝수");
		else
			System.out.println(number + "홀수");
	}

}
 