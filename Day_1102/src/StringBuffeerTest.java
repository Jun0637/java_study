
public class StringBuffeerTest {

	public static void main(String[] args) {
		StringBuffer buf1 = new StringBuffer();
		StringBuffer buf2 = new StringBuffer("무궁화 꽃이 피었ㅅ브니다");
		StringBuffer buf3 = new StringBuffer(500);
		
		System.out.println("buf1의 용량" + buf1.capacity());
		System.out.println("buf2의 용량" + buf2.capacity());
		System.out.println("buf3의 용량" + buf3.capacity());
		
		buf1.append(2);
		System.out.println(buf1 + "\nbuf1의 용량" + buf1.capacity());
		buf1.append(45.56);
		buf1.append(true);
		System.out.println(buf1 + "\nbuf1의 용량" + buf1.capacity());
		buf1.append('강');
		buf1.append("무궁화 꽃이 피었습니다.");
		System.out.println(buf1 + "\nbuf1의 용량" + buf1.capacity());
		buf1.insert(2,"송아지");
		buf1.delete(5, 10);
		
		// buf3작업
		buf3.append("송아지").append(true).append(42.195)
		.insert(0, "강아지");
		System.out.println(buf3 + "\nbuf3의 용량" + buf3.capacity());
		System.out.println("buf3의 길이" + buf3.length());
		
		buf3.trimToSize();
		System.out.println(buf3 + "\nbuf3의 용량" + buf3.capacity());
		
		String str = buf3.toString();
	}

}
