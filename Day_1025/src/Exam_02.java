//33
public class Exam_02 {

	public static void main(String[] args) {
		int[][] ary = new int[5][6];

		for (int i = 0; i < ary.length; ++i) {
			for (int j = 0; j < ary[i].length; ++j) {
				ary[i][j] = (int) (Math.random() * 10 + 1);
				ary[i][5] += ary[i][j];
			}
		}
		// 출력문
		for (int i = 0; i < ary.length; ++i) {
			for (int j = 0; j < ary[i].length; ++j)
				System.out.printf("%4d", ary[i][j]);
			System.out.println();
		}

	}

}
