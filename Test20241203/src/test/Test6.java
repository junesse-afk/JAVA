package test;

import java.util.ArrayList;

public class Test6 {

	public static void main(String[] args) {
		// 1명 Member 객체 생성, set메서드 호출 값을 저장
		// 2명 Member 객체 생성, set메서드 호출 값을 저장
		// 3명 Member 객체 생성, set메서드 호출 값을 저장
		
		Member mm = new Member();
		mm.setId("admin");
		mm.setName("홍길동");
		mm.setPass(1234);
		
		Member mm1 = new Member();
		mm1.setId("kim");
		mm1.setName("이순신");
		mm1.setPass(5678);
		
		Member mm2 = new Member();
		mm2.setId("Lee");
		mm2.setName("강감찬");
		mm2.setPass(9101);
		
		//ArrayList<Member> 배열 객체 생성
		//add() Member 저장
		
		ArrayList<Member> mb = new ArrayList<Member>();
		mb.add(mm);
		mb.add(mm1);
		mb.add(mm2);
		
		MemberDAO dao = new MemberDAO();
		dao.insertMember2(mb);
		//MemberDAO 객체생성
		//리턴할형 없음
		//insertMember2(Member를 저장한 ArrayList 배열변수)
		//for 출력 메서드 정의
		
		

	}

}
