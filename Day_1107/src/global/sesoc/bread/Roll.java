package global.sesoc.bread;

public class Roll extends Cake {
	private int lenght;
	
	public Roll() {
		super();
	}
	public Roll(String name, int price,int lenght) {
		super(name, price, lenght);;
		this.lenght = lenght;
	}
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	@Override
	public String toString() {
		return super.toString() + ", 길이 = " + lenght;
	}
	
}
