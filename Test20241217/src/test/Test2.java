package test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test2 {
	
	public static void main(String[] args) {
		// Map 인터페이스 (키, 값) 자료를 쌍 => 이름:홍길동, 나이:30, 특기:수영
		// -클래스 Hashtable, HashMap, TreeMap
		// put(), get(), isEmpty(), remove()
		// 키 : 중복 될 수 없음
		// 값 : 중복된 값 있음
		// 해쉬 알고리즘 구현 => 위치계산(해쉬함수)
		
		System.out.println("---------------------------------HashMap");
		//HashMap 클래스
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "홍길동");
		hashMap.put(2, "이길동");
		hashMap.put(3, "삼길동");
		//hashMap.get(키); => 키만 입력하면 값까지 가져다줌
		System.out.println(hashMap.get(1));
		System.out.println(hashMap.get(2));
		System.out.println(hashMap.get(3));
		
		System.out.println(hashMap); //{1=홍길동, 2=이길동, 3=삼길동}
		
		System.out.println("---------------------------------TreeMap");
		//TreeMap 클래스 : key값으로 정렬
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(1, "홍길동");
		treeMap.put(7, "칠길동");
		treeMap.put(5, "오길동");
		System.out.println(treeMap); // {1=홍길동, 5=오길동, 7=칠길동}
		
		System.out.println(treeMap.get(7));
		System.out.println(treeMap.get(5));
		
		System.out.println("----------------------------------");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("일길동", 1);
		map.put("삼길동", 3);
		map.put("이길동", 2);
		
		System.out.println(map); //{삼길동=3, 이길동=2, 일길동=1}
		System.out.println(map.get("삼길동"));
		System.out.println(map.get("일길동"));
		System.out.println(map.get("이길동"));
		
		System.out.println("----------------------------------");
		//이름:홍길동, 나이:30세, 직업:회사원, 취미:수영,테니스
		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("이름", "홍길동");
		map2.put("나이", "30세");
		map2.put("직업", "회사원");
		map2.put("취미", "수영,테니스");
		
		System.out.println(map2); //{이름=홍길동, 취미=수영,테니스, 나이=30세, 직업=회사원}
		System.out.println(map2.get("이름"));
		System.out.println(map2.get("나이"));
		System.out.println(map2.get("직업"));
		System.out.println(map2.get("취미"));
		
		System.out.println("----------------------------------");
		Map<String, Object> map3 = new HashMap<String, Object>();
		map3.put("이름", "홍길동");
		map3.put("나이", 30);
		map3.put("직업", "회사원");
		map3.put("취미", "수영,테니스");
		
		System.out.println(map3); //{이름=홍길동, 취미=수영,테니스, 나이=30, 직업=회사원}
		System.out.println(map3.get("이름"));
		System.out.println(map3.get("나이"));
		System.out.println(map3.get("직업"));
		System.out.println(map3.get("취미"));
		
		System.out.println("----------------------------------");
		//회원 정보와 게시판 정보 => 조인 => 하나의 공간에 담아서 사용
		Map<String, Object> map4 = new HashMap<String, Object>();
		map4.put("id", "kim");
		map4.put("name", "김길동");
		map4.put("num", 5);
		map4.put("subject", "제목");
		map4.put("content", "내용");
		map4.put("readcount", 10);
		
		System.out.println(map4); //{readcount=10, subject=제목, num=5, name=김길동, id=kim, content=내용}
		System.out.println(map4.get("id"));
		System.out.println(map4.get("name"));
		System.out.println(map4.get("num"));
		System.out.println(map4.get("subject"));
		System.out.println(map4.get("content"));
		System.out.println(map4.get("readcount"));
		System.out.println("----------------------------------");
		
		MapTest mapp = new MapTest();
		mapp.mapPrn(map4);
	}

}
