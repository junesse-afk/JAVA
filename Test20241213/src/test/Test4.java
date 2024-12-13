package test;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Test4 {

	public static void main(String[] args) {
		// p404 컬렉션 프레임워크
		// 자료구조 : 기억장소(메모리) 구조
		//       : 프로그램 실행 중 메모리에 자료를 유지 관리하기 위해 사용
		
		// java.util 패키지 : 자바에서 필요한 자료구조 만들어 놓음
		// 컬렉션 프레임워크(collection framework)
		// => 자바 내장 객체 (자료 구조)
		
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
		
		// List 부모인터페이스 = ArrayList 자식인터페이스(추상화, 업캐스팅, 다형성)
		// 처음 기억장소 10개 할당 => 추가되면 10개씩 추가
		
		List<String> list = new ArrayList<String>();
		list.add("일");
		list.add("이");
		list.add("삼");
		list.add("사");
		list.add("오");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("---------------------------");
		
//		Vector : 처음에는 기억장소 10개 지정=> 추가 할때 크기지정
		Vector<Integer> vector = new Vector<Integer>();
		List<Integer> list2 = new Vector<Integer>();
		System.out.println(list2);
		vector.add(1);
		vector.add(2);
		vector.add(3);
		System.out.println("배열크기 : " + vector.size());
		System.out.println(vector.get(0));
		System.out.println(vector.get(1));
		System.out.println(vector.get(2));
		for(Integer i : vector) {
			System.out.println(i);
		}
		
		System.out.println("---------------------------");
		
		//배열 : 생성할때 용량 지정, 추가 용량 늘려시 사용
		//링크드리스트 : 요소가 추가할 때 동적으로 요소의 메모리 생성
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("c");
		System.out.println(linkedList);
		//중간에 삽입
		linkedList.add(2, "D");
		System.out.println(linkedList);
		
		System.out.println("---------------------------");
		
		//Iterator : 다양한 자료구조의 내용을 받아서 사용
		Iterator<Integer> ir = vector.iterator();
		//hasNext() : 데이터가 있으면 true / false
		while(ir.hasNext()) {
			Integer i = ir.next();
			System.out.println(i);
		}
		Iterator<String> str = list.iterator();
		Iterator<String> str1 = linkedList.iterator();
		while (str.hasNext()) {
			System.out.println(str.hasNext() + "");
			
		}
		
		while (str1.hasNext()) {
			System.out.println(str1.hasNext()+"");
		}
		
		System.out.println("---------------------------");
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member mbHong = new Member(101, "홍길동");
		Member mbLee = new Member(102, "이순신");
		Member mbGang = new Member(103, "강감찬");
		Member mbDae = new Member(104, "대한민국");
		
		memberArrayList.addMember(mbHong);
		memberArrayList.addMember(mbLee);
		memberArrayList.addMember(mbGang);
		memberArrayList.addMember(mbDae);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(mbHong.getMemberId());
		memberArrayList.showAllMember();
		

	}
	
}
