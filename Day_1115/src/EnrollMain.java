
import java.util.Scanner;

class Man {
	private String name;
	public Man(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

interface Speakable {
	public String speak();
}

class Student extends Man {
	public Student(String name) {
		super(name);
	}
}

class Reader extends Man implements Speakable {
	public Reader(String name) {
		super(name);
	}

	@Override
	public String speak() {
		return super.getName() +"독자는 자바를 잘하고 싶다.";
	}
}

class Worker extends Man implements Speakable {
	public Worker(String name) {
		super(name);
	}

	@Override
	public String speak() {
		return super.getName() +"일꾼은 자기가 맡은 일을 잘하고 싶어한다.";
	}
}

public class EnrollMain {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		String choice, name;
		Speakable[] man = new Speakable[2];

		System.out.println("Speaker 등록 메인 메뉴입니다. 단 2명만 등록할 수 있습니다.");
		System.out.println("어떤 Speaker를 등록하는 지 선택하세요");

		for(int i=0; i<man.length; ++i) {
			System.out.println("1. Reader 등록");
			System.out.println("2. Worker 등록");
			System.out.print("선택 : ");
			choice = keyin.next();

			System.out.print("이름을 입력하세요 : ");
			name = keyin.next();
			
			switch(choice) {
			case "1" : man[i] = new Reader(name); break;
			case "2" : man[i] = new Worker(name); break;
			}
		}
		
		for(int i=0; i<man.length; ++i) {
			System.out.println(man[i].speak());
		}
	}
}