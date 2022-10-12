
public class SwitchTest_01 {

	public static void main(String[] args) {
		String temp = "negihbor";

		switch (temp) {
		case "father":
			System.out.println("아버지");
			break;
		case "mother":
			System.out.println("어머니");
			break;
		case "brother":
			System.out.println("남자형제");
			break;
		case "sister":
			System.out.println("여자형제");
			break;
		default:
			System.out.println("이웃");
			break;
		}
	}
}