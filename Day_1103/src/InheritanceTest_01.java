class Parent{
	private String data;
	public Parent() {
		System.out.println("부모클래스");
	}
	public Parent(String data) {
		this.data = data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getData() {
		return data;
		// constructr
	}
}
class Child extends Parent{
	private int number;
	public Child() {
		
		System.out.println("자식클래스");
	}
	public Child(int number) {
		super(); // 부모클래스의 기본생성자를 호출
		this.number = number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
}

public class InheritanceTest_01 {

	public static void main(String[] args) {
		Child c2 = new Child(27);
		System.out.println(c2.getData() + "" + c2.getNumber());
		//Child c1 = new Child();
		//Parent p1 = new Parent();
		/*	Parent p = new Parent();
		p.setData("대한민국");
		System.out.println(p.getData());
		
		Child c = new Child();
		c.setData("일본");
		c.setNumber(10);
		System.out.println(c.getData() + "" + c.getNumber());
*/
	}

}
