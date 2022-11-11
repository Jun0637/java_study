import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest_02 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

		map.put("1111", "홍길동");
		map.put("1112", "임꺽정");
		map.put("1113", "손오공");
		map.put("1114", "저팔계");
		map.put("1115", "사오정");

		if (map.containsKey("1116")) {
			System.out.println(map.get("1114"));
		} else {
			System.out.println("데이터가 없습니다.");
		}

		// 키의 정보만 꺼내기
		Set<String> set = map.keySet();

		// 모든 키값을 출력
		Iterator<String> iter = set.iterator();

		// map데이터 전체 순회하기
		while (iter.hasNext()) {
			String key = iter.next();
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
	}
}
