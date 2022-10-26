
public class StudentMain {

	public static void main(String[] args) {
		Student a = new Student();
		a.kor = 90;
		a.eng = 80;
		a.math = 75;
		a.avg = (a.kor+a.eng+a.math)/3;
		
		a.output();

	}

}
