
// 대문자면 소문자로, 소문자면 대문자로 변환하여 출력
public class IfTest_04 {

	public static void main(String[] args) {
		char ch = 'C';
		
		if(ch>='a' && ch<='z' ) {
			System.out.println(ch + "의 대문자 : " + (char)(ch-' '));
		} else {
			System.out.println(ch + "의 소문자 : " + (char)(ch-' '));
		}

	}

}
