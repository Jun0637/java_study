public class TraineeTest {
	public static void main(String[] args) {		
		Trainee[] student = new Trainee[6]; // 객체배열

		String[] s = {
				"홍길동 100 89 78",
				"손오공 99 89 75",
				"저팔계 80 70 50",
				"사오정 100 66 50",
				"이몽룡 70 100 68",
				"김방자 88 90 70",
		};
		for(int i = 0; i<s.length; ++i) {
			String[] temp = s[i].split(" ");
			Trainee trainee = new Trainee(temp[0],
					Integer.parseInt(temp[1]),
					Integer.parseInt(temp[2]),
					Integer.parseInt(temp[3]));
			student[i] = trainee;
		}
	}
}