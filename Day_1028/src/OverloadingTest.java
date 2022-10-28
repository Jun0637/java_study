
public class OverloadingTest {

	public static void main(String[] args) {
		int a = 10, b = 10;
		float x= 12.1F , y= 8.5F;
		String s1 = "Hello", s2 = "World";
		
		
		isMax(a,b);
		isMax(x,y);
		
		boolean bool = isMax(s1, s2);
		if(bool) {
			System.out.println(s1+"이"+ s2+"보다 크다");
		}else {
			System.out.println(s1+"이"+ s2+"보다 작거나같다");
		}
		
	}
	//call by value
	public static boolean isMax(int a, int b) {
		return a > b;
	}
	public static boolean isMax(float a, float b) {
		return a > b;
	}
	// call by reference
	public static boolean isMax(String a, String b) {
		int temp = a.compareTo(b);
		if(temp>0) return true;
		//System.out.println(temp);
		//char ch = a.charAt(0); // charAt(int index) : char
		//System.out.println("반환된 문자 :" + ch);
		return false;
		// a > b  값을 비교하는 것이 아니라 참조를 비교하는 것이다.
	}
}
