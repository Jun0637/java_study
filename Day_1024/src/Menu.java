import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		String choice;
		
		while(true) {
			System.out.println("1)입력 2)출력 3)삭제 4)수정 : 0)종료");
			choice = keyin.next();
			switch(choice){
				case "1" : input(); break;
				case "2" : output(); break;
				case "3" : delete(); break;
				case "4" : update(); break;
				case "0" : System.out.println("프로그램 종료");return;
				default : System.out.println("다시 선택해주세요");
			}
			
		}
	}
	public static void input() {
		System.out.println("intput");
	}
	public static void output() {
		System.out.println("output");
	}

	public static void delete() {
		System.out.println("delete");
	}

	public static void update() {
		System.out.println("update");
	}
}
//리턴타입이 void인 아래 4개의 메소드를 만드시오.
// input() : "input"이라고 출력하는 문장 하나만 잇음
// output()
// delete()
// update()