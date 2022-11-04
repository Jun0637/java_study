
public class Trainee {
	private String name;
	private int it;
	private int japanese;
	private int basic;
	private double avg;
	public Trainee() {
		super();
	}
	
	public Trainee(String name, int it, int japanese, int basic) {
		super();
		this.name = name;
		this.it = it;
		this.japanese = japanese;
		this.basic = basic;	
		this.avg = avg;
		calcAvg();
	}
	private void calcAvg() {
		this.avg = it*04 + japanese*0.3 + basic * 0.3;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setIt(int it) {
		this.it = it;
		calcAvg();
	}
	public void setJapanse(int japanse) {
		this.japanese = japanse;
		calcAvg();
	}
	public void setBasic(int basic) {
		this.basic = basic;
		calcAvg();
	}
	public String getName() {
		return name;
	}
	public int getIt() {
		return it;
	}
	public int getjapanese() {
		return japanese;
	}
	public int getBasic() {
		return basic;
	}
	@Override
	public String toString() {
		return "Trainee [name=" + name + ", it=" + it + ", japanese=" + japanese + ", basic=" + basic + ", avg=" + avg
				+ "]";
	}
	
	}

