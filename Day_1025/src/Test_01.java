
public class Test_01 {

	public static void main(String[] args) {
		int[] ary = new int[10];
		
		sequence(ary);
		output(ary);
	}
	public static void sequence(int[] ary) {
		for(int i = 0; i<ary.length; i++) {
			ary[i] = 5 * (i+1);			
		}
	}
	public static void output(int[] ary) {
		for(int i = 0; i<ary.length; i++) {
			System.out.print(ary[i] + " ");
		}
		
	}

}
