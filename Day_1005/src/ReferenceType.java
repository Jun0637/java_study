// 고객명, 상품의 가격,받은돈이 있을때 거스름돈을 출력하는 프로그램을 작성하시오.
public class ReferenceType {

	public static void main(String[] args) {
		String name;
		int price, money, change;
		
		name ="손오공";
		price = 15000;
		money = 20000;
		change = money - price;
		
		System.out.print(name + "님 거스름돈은");
		System.out.println(change + "입니다.");

	}

}
