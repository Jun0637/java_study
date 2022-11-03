class AClass{
	private String name;
	private int age;
	public AClass() {}
	public AClass(String name, int age) {
		this.name = name;
		this.age =age;
	}
	@Override
	public String toString() {
		return name + " "+ age;
	}
}
class BClass extends AClass{
	private String address;
	
	public BClass() {}
	public BClass(String address) {
		this.address = address;
	}
	public BClass(String name, int age, String address) {
		super(name, age);
		this.address = address;
	}
	@Override
	public String toString() {
		return super.toString() + ", " + address;
	}
}
public class InheritanceTest_04 {

	public static void main(String[] args) {
		BClass b = new BClass("저팔계", 29, "미국뉴욕");
		System.out.println(b);
		//AClass aclass = new AClass("손오공",33);
	}

}