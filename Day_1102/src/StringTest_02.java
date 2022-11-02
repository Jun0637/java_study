
public class StringTest_02 {

	public static void main(String[] args) {
		// char charAt(int index)
		String str1 = "무궁화 꽃이 피었습니다.";
		char ch = str1.charAt(3); // 지정된 index에 위치에 해당하는 하나의 문자 반환
		System.out.println(ch);
		
		// int codePointAt(int index)
		String str2 = "abcABC";
		int i = str2.codePointAt(0); // 지정된 index 위치에 해당하는 하나의 문자의 유니코드값
		System.out.println(i);
		
		//int compareTo(String anotherString) 
        i = str2.compareTo("aBCabc"); //앞의 문자열과 전달인자의 문자열을 비교하여 처음으로 달라지는 위치의 문자값ㅇ의 차이를 정수로 반환
        System.out.println(i);
        
        //String concat(String str)
        String str5 = "안녕";  
        String str6 = "하세요";  
        String str7 = "선생님";     
        String str8 = str5.concat(str6);          
        System.out.println(str8);  //이어서 쓰기  
        String str9 = str5.concat(str6).concat(str7);  
        System.out.println(str9);
        
        //boolean contains(CharSequence s)
        String address = "서울 강남구 역삼동 156번지";
        if(address.contains("서울")) {
        	 System.out.println("서울 시민입니다.");
        }else {
        	System.out.println("서울시민이 아닙니다.");
        }
        
        //boolean endsWith(String suffix)
        String str12 = "aa";
        String str13 = "bb"; //값비교
        System.out.println(str12.endsWith(str13));
        
        //boolean equals(Object anObject)
        String str14 = "AA";
        String str15 = "AA"; //값비교
        System.out.println(str14.equals(str15));
        
        //int indexOf(int ch)
        int index = str1.indexOf("꽃");
        System.out.println(index);
        System.out.println(str1.isEmpty());
        System.out.println(str1.length());
        String str = str1.replace('무', '유');
        System.out.println(str);
        System.out.println(str1);
        
        String data = "컵라면 떡볶이 김밥";
        String[] token = data.split(" ");
        System.out.println(token[0]);
        System.out.println("개수 : " + token.length); // 속성
        
        data = "컵라면 떡볶이 김밥 순대"; // . 은 구분자로 사용 불가
        token = data.split(" "); // StringTokenizer
        System.out.println("개수 : " + token.length); // 속성
        System.out.println(token[2]); // 속성
        
        data = "컵라면 떡볶이 김밥 순대 쫄면";
        System.out.println(data.substring(8));
        System.out.println(data.substring(4, 7));
        
	}

}
