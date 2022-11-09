package global.sesoc.structure;

import java.util.ArrayList;
import java.util.List;

// insert, delete, update, searh, selectAll
public class ArrayTest_01 {

	public static void main(String[] args) {
		String[] str = new String[20];
		int count = 0;
		List<String> list = new ArrayList<>();

		// 배열에 삽입
		str[count++] = "사과"; // str[0] = ""; count ++;
		str[count++] = "복숭아";
		str[count++] = "배";
		str[count++] = "수박";

		// 전체 출력
		for (int i = 0; i < count; ++i)
			System.out.println(str[i] + "");
		System.out.println("\n");

		// "배" 삭제
		for (int i = 0; i < count; ++i) {
			if (str[i].equals("베")) {
				for (int j = i; j < count; ++j) {
					str[i] = str[j+1];
				}
				--count;
			}
		}
		// 전체 출력
		for (int i = 0; i < count; ++i)
			System.out.println(str[i] + "");
		System.out.println("\n");

		// 수정
		for (int i = 0; i < count; ++i) {
			if (str[i].equals("수박")) {
				str[i] = "멜론";
				break;
			}

		}
		// 전체 출력
		for (int i = 0; i < count; ++i)
			System.out.println(str[i] + "");
		System.out.println("\n");
		
		// 데이터 꽉차있을때 사용 , 일부만 있을 때 사용불가
		for(String data : str) {
			System.out.println(data);
		}
	}

}
