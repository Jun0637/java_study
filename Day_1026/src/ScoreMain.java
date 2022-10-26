
public class ScoreMain {
	String temp1;
	static String temp2;
	public static void main(String[] args) {
		// static에서는 non-static에 접근불가
		// 접근하려면 무조건 생성해야함
		// static을 사용하던가 클래스명.변수명
		// 같은 클래스 소속되어 있으면 클래스명 생략가능
		Score s = new Score(); //객체가 생성됨
		s.name = "홍길동";
		s.kor = 98.5;
		s.rank = 1;
		Score.temp = "임시변수";
		temp2 = "이것도 임시변수";
		ScoreMain ts = new ScoreMain();
		ts.temp1 = "이것은 임수변수지만 생성햇음";
		
		System.out.println(s.name +" : "+ s.kor + "," +s.rank);

	}

}
