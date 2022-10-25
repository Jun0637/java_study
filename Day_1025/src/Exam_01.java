//32
public class Exam_01 {

	public static void main(String[] args) {
		int[] ary = new int[10];
		int min =10000, max =0;
		
		for(int i=0; i<ary.length; ++i) {
			ary[i] = (int)(Math.random() * 100 +1);
			
			if(max < ary[i]) max = ary[i];
			if(min > ary[i]) min = ary[i];
		}
		
		System.out.println("** 발생된 전체 값");
		for(int i=0; i<ary.length; i++)
			System.out.print(ary[i] + " ");
		
		System.out.println();
		
		System.out.println("최댓값 : " + max);
		System.out.println("\n최소값 : " + min);
	}

}
