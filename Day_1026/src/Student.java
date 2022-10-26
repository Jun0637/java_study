
public class Student {
	int kor, eng, math;
	double avg;

	public void output() {
		System.out.print("국어 : " + this.kor+"점"+"\n"+ "영어 : " + this.eng +"점"+"\n"+ "수학 : " + this.math+"점"+"\n"
				+ "평균 : " + this.avg+"점");
}
}