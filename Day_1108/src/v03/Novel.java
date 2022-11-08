package v03;

public class Novel extends Book {
	String author;
	
	@Override
	public void output() {
		System.out.println("저자" + author);
	}
}
