import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapTest_01 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		List<String> list = new ArrayList();
		
		System.out.println(map);
		System.out.println(list);
		
		map.put("1111", "홍길동");
		map.put("1112", " 손오공");
		map.put("1113", "저팔계");
		
		list.add("홍길동");
		list.add("손오공");
		list.add("저팔계");
		
		System.out.println("1113");
		System.out.println(list.get(2));
		
		map.remove("1112");
		System.out.println(map.get("1112")); // 해당하는 벨루가 없음:null
		
		list.remove("손오공");
		System.out.println(list.get(1));
		
		map.put("1114", "사오정");
		map.put("1115", "임꺾정");
		map.put("1116", "삼장법사");
		
		map.size();
		map.containsKey("1112");
		map.containsValue("저팔계");
		map.isEmpty();
		
		map.clear(); // 출력하지말 것
		
		map.size();
		
		map.put("1111", "홍길동");
		map.put("1112", " 손오공");
		map.put("1113", "저팔계");
		map.put("1114", "사오정");
		map.put("1115", "임꺾정");
		map.put("1116", "삼장법사");
		
		map.put("1115", "강감찬"); // repla;ce된 것첯럼 동작
		
		System.out.println(map);
		
		// Set <----- HashSet
		Set<String> set = new HashSet<>();
		set.add("아메리카노");
		set.add("카푸치노");
		set.add("더치커피");
		set.add("모카라떼");
		set.add("프라프치노");
		
		set.size();
		System.out.println(set);
		
		set.add("카푸치노");
		System.out.println(set.size());//동일한 데이터가 있기때문에 삽입불가
		
		set.remove("더치커피");
		System.out.println(set);
		
		//전체 순환 기능
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		set.clear();
	}
}
