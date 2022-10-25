
public class Exchange_02 {

	public static void main(String[] args) {
		int[] ary = { 10, 20 };
		int[][] t = new int[5][6];

		System.out.println("ary[0] = " + ary[0] + ", ary[1]= " + ary[1]);
		// call by reference
		exchange(ary); // ary : 참조값

		System.out.println("ary[0] = " + ary[0] + ", ary[1]= " + ary[1]);
	}

	public static void exchange(int[] ary) {
		int temp;
		temp = ary[0];
		ary[0] = ary[1];
		ary[1] = temp;

	}

}
