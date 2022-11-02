
public class IntegerTest_01 {

	public static void main(String[] args) {
		// 1의 개수 반환
		// 1111 1111 1111 1111 1111 1111 1111 1111 = -1의 비트모양
		System.out.println(Integer.bitCount(10));
		
		//두 숩 비교(앞크1, 앞작-1, 같으면0)
		System.out.println(Integer.compare(15, 20));
		
		System.out.println("하늘".equals("하늘"));
		Integer i1 =10;
		System.out.println(i1.equals(10));
		
		Double i2 =20.5;
		//정수 부분만 취함
		//아래에서 사용한 intValue()는 Double 클래스에 있는것을 사용한것
		System.out.println(i2.intValue());
		
		//큰값
		System.out.println("큰값 : " + Integer.max(i1, i2.intValue()));
		String str = "45";
		// 문자열 "45"를 정수 45로 파싱
		int temp = Integer.parseInt(str);
		System.out.println(Integer.parseInt(str));
		
		String str2 = "10";
		System.out.println(Integer.parseInt(str2,16));
		
		System.out.println(Integer.toHexString(15));//10진수 16진수변환
		
		Integer i3 = Integer.valueOf(10);
		Integer i4 = Integer.valueOf("10");
		
		System.out.println(i3 + " " + i4);
		
		System.out.println(Integer.parseInt("d",16));//16진수를 10진수로 변환
		

	}

}
