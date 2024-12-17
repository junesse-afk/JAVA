package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test4 {

	public static void main(String[] args) {
		// 회원정보, 게시판 정보 => 조인 => 하나의 공간에 담아서 사용
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("id", "Lee");
		map1.put("name", "이순신");
		map1.put("num", 1);
		map1.put("subject", "제목1");
		map1.put("content", "내용1");
		map1.put("readcount", "10");
		
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("id", "GANG");
		map2.put("name", "강감찬");
		map2.put("num", 2);
		map2.put("subject", "제목10");
		map2.put("content", "내용10");
		map2.put("readcount", "30");
		
		Map<String, Object> map3 = new HashMap<String, Object>();
		map3.put("id", "Hong");
		map3.put("name", "홍길동");
		map3.put("num", 15);
		map3.put("subject", "제목15");
		map3.put("content", "내용17");
		map3.put("readcount", "302");
		
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		list.add(map1);
		list.add(map2);
		list.add(map3);
		System.out.println(list);
		//[{readcount=10, subject=제목1, num=1, name=이순신, id=Lee, content=내용1}, {readcount=30, subject=제목10, num=2, name=강감찬, id=GANG, content=내용10},
		//{readcount=302, subject=제목15, num=15, name=홍길동, id=Hong, content=내용17}]
		System.out.println("-----------------------------");
		
		for (int i = 0; i<list.size(); i++) {
			Map<String, Object> list1 = list.get(i);
			System.out.println(list1);
			System.out.println(list1.get("num"));
			System.out.println(list1.get("subject"));
			System.out.println(list1.get("object"));
		}
		System.out.println("-----------------------------");
		
		for (Map<String, Object> list1 : list) {
			System.out.println(list1);
		}
		System.out.println("-----------------------------");
		//MapTest 객체 생성
		//prn2() 메서드 호출 => 내용 출력
		
		MapTest mpt = new MapTest();
		mpt.prn2(list);
		
		/*
		 * mpt.prn2(map1); mpt.prn2(map2); mpt.prn2(map3);
		 */
	}

}
