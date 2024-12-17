package test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test5 {

	public static void main(String[] args) {
		// MemberDTO 클래스 정의
		// 멤버변수 id, pass, name, int age, gender, email, date date
		// 생성자 멤버변수 모든 값을 받는 생성자
		// 메서드 set get, toString()
		
		// MemberDTO 객체 생성 new Timestamp(System.current)
		// List배열에 MemberDTO 3명을 담기
		MemberDTO memberDTO = new MemberDTO("id", "pass", "홍길동", 33, "남성", "email", new Date());
		MemberDTO memberDTO1 = new MemberDTO("id1", "pass1", "홍길동1", 34, "남성1", "email1", new Date());
		MemberDTO memberDTO2 = new MemberDTO("id2", "pass1", "홍길동2", 35, "남성2", "email2", new Date());
		
		List<MemberDTO> memberlist = new ArrayList<MemberDTO>();
		memberlist.add(memberDTO);
		memberlist.add(memberDTO1);
		memberlist.add(memberDTO2);
		
		// MemberDAO 클래스 정의
		// 메서드 정의 insertMember(MemberDTO memberDTO) => 출력
		
		// MemberDAO 객체 생성
		MemberDAO memberDAO = new MemberDAO();
		// insertMember(memberDTO) 메서드 호출
		memberDAO.insertMember(memberDTO);
		
		// MemberDAO에 memberList(List배열) 메서드 호출
		memberDAO.memberList(memberlist);
		
		//map "id:kim", "num:1", "name:applephone", "img:1.jpg"
		
		//MemberDAO파일 insertMap(map) 메서드 호출 => 출력
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", "kim");
		map.put("num", 1);
		map.put("name", "applephone");
		map.put("img", "1.jpg");
		
		memberDAO.insertMap(map);
		
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("id", "lee");
		map1.put("num", 2);
		map1.put("name", "samsungphone");
		map1.put("img", "2.jpg");
		
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("id", "gang");
		map2.put("num", 3);
		map2.put("name", "null");
		map2.put("img", "3.jpg");
		
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		list.add(map);
		list.add(map1);
		list.add(map2);
		
		memberDAO.maplist(list);
	}

}
