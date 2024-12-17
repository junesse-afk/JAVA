package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Test1 {

	public static void main(String[] args) {
		// Collection 인터페이스 (배열)
				// 추상메서드() size(), add(0, clear(0, ...
				// ㄴ List 인터페이스 : 순차적인 자료를 관리하는데 사용
				//                  [ArrayList, Vector, LinkedList]
				// ㄴ Set 인터페이스 : 순서가 정해져 있지 않음, 중복을 허용하지 않음
				//                  아이디처럼 중복되지 않는 객체를 다루는 데 사용
				//                  [Hash Set, TreeSet]
				
				// ㄴ Map 인터페이스 : 쌍(키(K), 값(V)) 으로 되어 있는 자료 관리하는데 사용, 순서 없음
				//					키는 중복을 허용하지 않지만 값은 중복될 수 있음
				//				   [HashMap, HashTable, TreeMap]
				// put(), get(), isEmpty(), remove()
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("홍길동");
		hashSet.add("이길동");
		hashSet.add("홍길동");
		hashSet.add("삼길동");
		
		//hashSet은 순서상관없이 노출되며, 중복되는 경우 한개가 삭제됨
		
		System.out.println(hashSet); //[홍길동, 삼길동, 이길동]
		
		System.out.println("---------for문");
		for (String s : hashSet) {
			System.out.println(s);
		}
		System.out.println("---------iterator");
		Iterator<String> it = hashSet.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
			
		}
		System.out.println("---------treeset");
		//TreeSet 클래스 : 중복 없는 데이터, 순서 없는 데이터
		TreeSet<String> treeset = new TreeSet<String>();
		treeset.add("홍길동");
		treeset.add("이길동");
		treeset.add("홍길동");
		treeset.add("삼길동");
		System.out.println(treeset);
		
		System.out.println("---------for문");
		for (String str : treeset) {
			System.out.println(str);
		}
		System.out.println("---------iterator");
		Iterator<String> ite = treeset.iterator();
		while (ite.hasNext()) {
			String s = ite.next();
			System.out.println(s);
		}
	
		int num = 8;
		System.out.println(num >>=2);
	}

}
