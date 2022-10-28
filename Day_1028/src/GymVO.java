
public class GymVO {
	private int usrid;
	private String username;
	private double weight;
	private double height;
	private double bmi;
	private String result;

	public GymVO() {
		
	}
	
	public GymVO(int usrid, String username, double weight, double height) {
		this.usrid = usrid;
		this.username = username;
		this.weight  = weight; 
		this.height = height;
		calcresult();
	}
	public void calcbmi() {
		this.bmi = weight / ((height * 0.01) * (height * 0.01));
	}
	public void calcresult() {
		calcbmi();
		if(bmi >= 30) this.result ="고도비만";
		else if(bmi >= 25) this.result ="비만";
		else if(bmi > 15) this.result = "정상";
		else this.result = "저체중";
	}
	
	public int getUsrid() {
		return usrid;
	}

	public String getUsername() {
		return username;
	}

	public double getWeight() {
		return weight;
	}

	public double getHeight() {
		return height;
	}

	public double getBmi() {
		return bmi;
	}

	public String getResult() {
		return result;
	}

	public void setUsrid(int usrid) {
		this.usrid = usrid;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setWeight(double weight) {
		this.weight = weight;
		calcresult();
	}

	public void setHeight(double height) {
		this.height = height;
		calcresult();
	}

	public void output() {
		System.out.printf("%d %s %f %f %f %s",
				usrid, username, weight, height, bmi, result);
	}
}