package global.sesoc.bread;

public class BreadTest extends Bread {

	public static void main(String[] args) {
		Bread bd = new Bread("팥빵", 1200);
		Cake ck = new Cake("붕어빵", 29000, 2);
		Roll rl = new Roll("초코롤",16000, 10);
		
		System.out.println(bd);
		System.out.println(ck);
		System.out.println(rl);
	}

}
