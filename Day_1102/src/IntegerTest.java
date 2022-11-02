
public class IntegerTest {

	public static void main(String[] args) {
		System.out.println("최대값 : "+Integer.MAX_VALUE);
		System.out.println("최소값 : "+Integer.MIN_VALUE);
		System.out.println("Size : "+Integer.SIZE);
		System.out.println("Bytes : "+Integer.BYTES);
		
		Integer i1 = new Integer(15);
		Integer i2 = new Integer("123");
		
		System.out.println(i1); // 오터 언박싱(Auto Unboxing)
		System.out.println(i2);
		System.out.println(i1.getClass()); // 무슨 클래스인지 확인
		
		Integer i3 = 45; //오토 박싱(Auto Boxing)
		System.out.println(i1 + i3); // 오토 언박싱\
		
		
	}

}
