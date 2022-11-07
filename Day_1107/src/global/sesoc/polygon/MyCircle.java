package global.sesoc.polygon;

public class MyCircle extends Mypoint implements Calc {
	private int radius;
	public MyCircle() {
		super(); // x0,y0,r0 0으로 초기화
	}
	public MyCircle(int radius) {
		super();
		this.radius = radius;// x0,y0,r? r값은 전달받든거
	}
	public MyCircle(int x, int y, int radius) {
		super(x, y);// 부모의 기본생성자 호출하는 코드
		this.radius = radius;// x--,y--,r-- 전달받은 값 초기화
	}

	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	// 부모클래스(MyPoint)의 setter / getter/ toString() x,y좌표만 return
	// 부모인터페이스(Calc) area()
	@Override
	public double area() {
		return Math.PI * this.radius*this.radius;
	}
	@Override
	public String toString() {
		String temp = super.toString();
		String temp2 = String.format("%.2f", area());
		return temp + ", radius=" + radius + ",area = "+ temp2;
	}
}
