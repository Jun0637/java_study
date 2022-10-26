class Ballpen{
	double size; // 볼펜굴기
	String color; // 볼펜 색갈
	/*public static void output(Ballpen pen) {
		System.out.println(this.size +"mm " + this.color + "볼펜");*/
	// 같은 멤버로 오게되면 this사용 가능
}
public class BallpenMain {

	public static void main(String[] args) {
		Ballpen black = new Ballpen();
		black.size = 0.5;
		black.color = "검정색";
		output(black);
		//blak.output();
		
		Ballpen red = new Ballpen();
		red.size = 0.7;
		red.color = "빨간색";
		output(red);
		//red.output();
	}
	public static void output(Ballpen pen) {
		System.out.println(pen.size +"mm " + pen.color + "볼펜");
	}
}
