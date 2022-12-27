class Data_1{
	int value;
	//Data_1(){} //기본생성자를 추가
}
class Data_2{
	int value;
	
	Data_2(){}
	Data_2(int x){
		value = x;
	}
}
class Ex6_11 {

	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2();
	}

}
