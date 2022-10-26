
public class Test_01 {

	public static void main(String[] args) {
		int[] score = new int[10];
		int[] rank = new int[10];
		init(score); // score배열에 난수를 발생시켜 초기화
		ranking(score, rank);
		output(score, rank);
	}

	public static void init(int[] score) {
		for (int i = 0; i < score.length; ++i) {
			score[i] = (int) (Math.random() * 51 + 50);

		}
	}

	public static void ranking(int[] score, int[] rank) {
		for (int i = 0; i < score.length; ++i) {// 5번방학생 점수
			rank[i] = 1;
			for (int j = 0; j < i; ++j) {
				if (score[i] < score[j])++rank[i];
				else if (score[i] > score[j])++rank[j];
			}
		}
	}

	public static void output(int[] score, int[] rank) {
		System.out.printf("%4s : ", "점수");
		for (int i = 0; i < score.length; ++i)
			System.out.printf("%4d", score[i]);
			System.out.println();
			
			System.out.printf("%4s : ", "등수");
			for (int i = 0; i < rank.length; ++i)
				System.out.printf("%4d", rank[i]);
				System.out.println();
		}
	}
