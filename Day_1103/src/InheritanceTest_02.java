class Person{
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void output() {
		System.out.println("이름 : " + this.name);
	}
}

class Student extends Person{
	private int scoer;
	public void setScore(int score) {
		this.scoer = score;
	}
	public int getScore() {
		return this.scoer;
	}
	@Override
	public void output() {
		super.output();// super
		System.out.println("점수 : " + this.scoer);
	}
	@Override
	public String toString() {
		/*String temp = super.getName() + ", " + this.scoer;
		return temp;*/
		return super.getName() + ", " + this.scoer;
	}
}

public class InheritanceTest_02 {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("홍길동");
		s.setScore(90);
		
		//println은 출력하려는 레퍼런스 변수의 객체가
		//toString()을 오버라이딩 했을 경우 자동으로
		//s.toString()으로 변환
		System.out.println(s);
		System.out.print(s);
		System.out.printf("%s%n", s.toString());
		//System.out.println(s.toString());
		//s.output();
		
		//System.out.println(s.getName() + " " + s.getScore());
	}


}
