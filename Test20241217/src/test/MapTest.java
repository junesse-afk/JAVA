package test;

import java.util.List;
import java.util.Map;

public class MapTest {

		// 메서드 리턴할 형 없음 mapPrn(map받는 변수선언) => map 출력
		
	
		public void mapPrn(Map<String, Object> map) {
			System.out.println(map);
			System.out.println(map.get("id"));
			System.out.println(map.get("name"));
			System.out.println(map.get("num"));
			System.out.println(map.get("subject"));
			System.out.println(map.get("content"));
			System.out.println(map.get("readcount"));
		}
		
		public void prn2(List<Map<String, Object>> list) {
			for (Map<String, Object> map : list ) {
				System.out.println(map);
			}
			
		}
		

}
