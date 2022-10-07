
public class EscapeTest {

	public static void main(String[] args) {
		String tmp = "Korea";
		System.out.println(tmp);
		System.out.println("\n" + tmp);
		System.out.println("\t" + tmp);
		
		System.out.println("Kim's bakery");
		System.out.println("자바에서 문자열은 \"안에있어야한다");
		
		System.out.println("\\r코드값" +(int)('\r')+"이다");
		System.out.println("\\n코드값" +(int)('\n')+"이다");
		
		

	}

}
