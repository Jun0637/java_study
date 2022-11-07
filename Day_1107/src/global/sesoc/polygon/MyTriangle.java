package global.sesoc.polygon;

public class MyTriangle extends Mypoint implements Calc {

	private int width;
	private int height;
	
	public MyTriangle() {
		super();
	}
	public MyTriangle(int width, int height) {
		super();
		this.height = height;
		this.width = width;	
		
	}
	public MyTriangle(int x, int y, int width, int height) {
		super(x, y);// 부모의 기본생성자 호출하는 코드
		this.height = height;
		this.width = width;
	}

	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public double area() {
		return this.width * this.height * 0.5;
	}
	@Override
	public String toString() {
		String temp = super.toString();
		String temp2 = String.format("%.2f", area());
		return temp + ", width = " + width + ",height = " +height +", areea = " + temp2;
	}

}