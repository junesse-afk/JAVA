package test;

import java.util.ArrayList;

public class MemberDAO {
	//MemberDAO 객체생성
	//리턴할형 없음
	
	
	public void insertMember(Member member){
		System.out.println(member.getId());
		System.out.println(member.getName());
		System.out.println(member.getPass());
	}
	
	//insertMember2(Member를 저장한 ArrayList 배열변수)
	//for 출력 메서드 정의
	public void insertMember2(ArrayList<Member> arr) {
		for(Member mb : arr) {
			mb.prn();
		}
	}
	
	
}
