
public class Test_02 {

	public static void main(String[] args) {
		int[] ary = new int[20];
		
		fibonacci(ary);
		output(ary);
	}
	public static void fibonacci(int[] ary) {
		ary[0] = 1;
		ary[1] = 1;
		for(int i = 2; i<ary.length; i++) {
			ary[i] = ary[i-2] + (ary[i-1]);			
		}
	}
	public static void output(int[] ary) {
		for(int i = 0; i<ary.length; i++) {
			System.out.print(ary[i] + " ");
		}
		
	}

}
