package global.sesoc.polygon;

public class MyPolygonTest {

	public static void main(String[] args) {
		MyCircle mc = new MyCircle(1, 1, 5);
		MyRectangle mr = new MyRectangle(0, 0, 4, 5);
		MyTriangle mt = new MyTriangle(5, 5, 7, 6);
		
		System.out.println(mc); // mc.toString()
		System.out.println(mr); // mc.toString()
		System.out.println(mt); // mc.toString()
	}

}
