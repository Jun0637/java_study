//31
public class Exam_03 {

	public static void main(String[] args) {
		int[] ary = new int[10];
		
		//난수 발생
		for(int i=0; i<ary.length; ++i) {
			ary[i] = (int)(Math.random()*20 + 1);
			for(int j=0; j<i; ++j) {
				if(ary[i] == ary[j]) {
					--i;
					break;
				}
			}
		}
		
		//출력
		for(int i=0; i<ary.length; ++i) {
			System.out.printf("%4d", ary[i]);
		}
		System.out.println();
	}

}
