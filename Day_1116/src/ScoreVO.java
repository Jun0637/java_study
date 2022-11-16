
public class ScoreVO {
	private String name;
	private int it;
	private int japanese;
	private int basic;
	private int total;
	private double avg;
	
	public ScoreVO() {
		super();
	}

	public ScoreVO(String name, int it, int japanese, int basic) {
		super();
		this.name = name;
		this.it = it;
		this.japanese = japanese;
		this.basic = basic;
		calc();
	}
	private void calc() {
		total = it + japanese +basic;
		avg = it*04 + japanese*03 + basic *03;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIt() {
		return it;
	}

	public void setIt(int it) {
		this.it = it;
	}

	public int getJapanese() {
		return japanese;
	}

	public void setJapanese(int japanese) {
		this.japanese = japanese;
	}

	public int getBasic() {
		return basic;
	}

	public void setBasic(int basic) {
		this.basic = basic;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		String data = String.format("%4s %3d %3d %3d %3d %.2f%n",name, it, japanese, basic, total, avg);
		return data;
	}
	
}
