
public class FloatTest {

	public static void main(String[] args) {
		// IEEE754 => Floating point 부동소숫점
		System.out.println(1.1);
		System.out.println(1.3);
		System.out.println(1.1 + 1.3);
		System.out.println((1.1 + 1.3) == 2.4);
		System.out.println((1 + 3) == 4);
		
		//
		System.out.println(5.0 / 0.0); //0Infinity
		System.out.println(5.0 /- 0.0); //Infinity

	}

}
