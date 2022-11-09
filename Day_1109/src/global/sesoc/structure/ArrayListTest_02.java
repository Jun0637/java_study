package global.sesoc.structure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// insert(C), searh(R), update(U), delete(D)   //selectAll
public class ArrayListTest_02 {

	public static void main(String[] args) {
		String[] str = new String[20];
		int count = 0;
		List<String> list = new ArrayList<>();

		list.add("꽃");
		list.add("국화");
		list.add("코스모스");
		list.add("튤립");

		// 전체 출력
		for (int i = 0; i < list.size(); ++i)
			System.out.println(list.get(i) + " ");
		System.out.println("\n");

		String temp = list.remove(1);
		System.out.println(temp);

		boolean result = list.remove("수국");
		System.out.println(result);
		// 전체 출력
		for (String data : list)
			System.out.println(data + "");
		System.out.println("\n");

		// 장미 => 수국 set(0, "수국")
		list.set(0, "수국");
		// 전체출력
		for (String data : list)
			System.out.println(data + "");
		System.out.println("\n");

		// search하는 메소드
		int index = list.indexOf("코스모스"); // -1 : 데이터가 없을경우
		System.out.println(index);

		// 코스모스를 해바라기롤 수정
		list.set(list.indexOf("코스모스"), "해바라기");
		for (String data : list)
			System.out.print(data + "");
		System.out.println("\n");

		// 전체 출력 : 리스트 전체를 순회하는 객체로 변환
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println("\n종료");
	}

}
