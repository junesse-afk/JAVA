package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test3 {

	public static void main(String[] args) {
		// 
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("일길동", 95);
		map.put("이길동", 77);
		map.put("삼길동", 53);
		
		System.out.println("크기 : " + map.size());
		System.out.println("비어 있는 경우 확인 : " + map.isEmpty());
		map.remove("이길동");
		System.out.println(map); //{삼길동=53, 일길동=95}
		
		//전체 삭제
		//map.clear();
		System.out.println(map); //{}
		
		//키값만 받아오기 => Set => Iterator 사용
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		// <key, vlaue>, <key, vlaue>, <key, vlaue>
		// [(삼길동=53) -> 엔트리인가봄, 일길동=95]
		System.out.println(entrySet);
		
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
//			System.out.println(entry);
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + ":" + value);
		}
		
	}

}
