package v01;

class Parent01{
	String name;
	void methodA() {
		System.out.println("Parent01-" + name);
	}
}

class Child01 extends Parent01{
	int age;
	void methodB() {
		System.out.println("child01-" + age);
	}
}

class neighbor{
	String address;
	void methodC() {
		System.out.println("Neighbor-" + address);
	}
}

public class PolyTest_01 {

	public static void main(String[] args) {
		Parent01 p1 = new Parent01();
		p1.name = "홍길동";
		p1.methodA();
		
		Child01 c1 = new Child01();
		c1.name = "손오공";
		c1.age = 21;
		
		c1.methodA();
		c1.methodB();
		
		
		// 연산자(instanceof)
		System.out.println(p1 instanceof Parent01);
		System.out.println(c1 instanceof Child01);
		
		System.out.println(c1 instanceof Parent01);
		System.out.println(c1 instanceof Object);
		// System.out.println(c1 instanceof String);
		System.out.println(p1 instanceof Child01);
		
		
		
	}

}
