
public class StringTest_01 {

	public static void main(String[] args) {
		// String 생성자 사용해보기
		
		// String()
		String s1 = new String(); // empty string 객체 생성
		System.out.println(s1);
		
		// String(bye[]bytes)
		byte[] by = {65, 66, 97, 99, 100};
		String s2 = new String(by);//
		System.out.println(s2);
		
		// String(char[] value)
		char[] ch = {'강','남','이','다'};
		String s3 = new String(ch); // "강남이다"
		System.out.println(s3);
		
		// String(String original)
		String s4 = new String("대한민국");
		System.out.println(s4);
		
		String s5 = "대한민국"; // String pool 같은 대한민국은 들어옳수 없다
		String s55 = "대한민국"; 
		s55 = s55 + "Korea";
		System.out.println(s5 == s55); //주소 비교
		
		String s6 = new String("대한민국"); // heap
		String s7 = new String("대한민국"); 
		System.out.println(s6 == s7); // 주소비교
		System.out.println(s6.equals(s7)); // 데이터 비교
		
		System.out.println(s5.equals(s6)); // 데이터 비교
		}

}
