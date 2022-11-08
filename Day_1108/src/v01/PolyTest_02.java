package v01;

class Parent02{
	String name;
	void methodA() {
		System.out.println("Parent02-" + name);
	}
}

class Child02 extends Parent02{
	int age;
	void methodB() {
		System.out.println("child02-" + age);
	}
}


public class PolyTest_02 {

	public static void main(String[] args) {
		//다형성
		Parent02 p2 = new Child02(); // up casting
		p2.name = "홍길동";
		p2.methodA();
		
	//	p2.age = 35; 오류
		
		//down casting : 실제 사용하려는 시점에서 다운캐스팅이 필요하다.
		((Child02)p2).age =34;
		((Child02)p2).methodB();
		((Child02)p2).methodB();
		
	}

}
