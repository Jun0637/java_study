
public class Trainee {
	private int id;
	private String name;
	private double java;
	private double japan;
	private double basic;
	private double avg;
	
	/*public Trainee() {
		this.id = 100;
		this.name = "홍길동";
		this.java  = 89;
		this.japan = 99;
		this.basic = 100;*/
	
	// 기본생정자가 => 무조건 만들어 놓을것
		public Trainee(){}
		//생성자 오버로딩
		public Trainee(int id, String name, double java, double japan, double basic) {
			this.id = id;
			this.name = name;
			this.java  = java; // 0.4
			this.japan = japan;// 0.3 
			this.basic = basic;// 0.3
			
			this.avg = java*0.4+japan*0.3+basic*0.3;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getdJava() {
		return java;
	}
	public double getJapan() {
		return japan;
	}
	public double getBasic() {
		return basic;
	}
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setJava(double java) {
		this.java = java;
	}
	public void setJapan(double japan) {
		this.japan = japan;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}
	public void setAvg(double avg) {
		this.avg =avg;
	}

	public void output() {
		System.out.printf("%2d %4s %2f %f %f %f ",
				id, name, java, basic, japan, avg);
		
	}
}
