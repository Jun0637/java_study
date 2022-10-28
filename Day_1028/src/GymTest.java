
public class GymTest {

	public static void main(String[] args) {
		GymVO p = new GymVO();
		
		
		p.setUsrid(12);
		p.setUsername("홍길동");
		p.setWeight(50);
		p.setHeight(185);
		p.calcbmi();
//		p.output();
		
		GymVO p2 = new GymVO(12, "홍길동", 60,185);
		p2.output();
		p2.setHeight(100);
	}

}
