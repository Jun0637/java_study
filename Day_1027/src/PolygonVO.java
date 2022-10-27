
public class PolygonVO {
	private int type; // 다각형의 종류
	private String name;
	
	//private 멤버변수에 접근을 할 수 있도록 메소드를 만들어줌
	// 대입하는 메소드 : setter => public void setType(int t)
	// 가져가는 메소드 : getter => public int getType()
	public void setType(int type) {
		this.type = type; //this 객체
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getType() {
		return type;
	}
	public String getName() {
		return name;
	}
	public void output() {
		System.out.println(type + "," + name);
	}
}
