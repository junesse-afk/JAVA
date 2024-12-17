package test;

import java.util.List;
import java.util.Map;

//MemberDAO 클래스 정의
public class MemberDAO extends MemberDTO{
	
		// 메서드 정의 insertMember(MemberDTO memberDTO) => 출력
			public void insertMember(MemberDTO memberDTO) {
				System.out.println("MemberDAO insertMember()");
				System.out.println(memberDTO);
			}
			
			public void memberList(List<MemberDTO> memberlist) {
				
				for (MemberDTO mbdto : memberlist ) {
					System.out.println(mbdto);
				}
			}
			
			public void insertMap(Map<String, Object> map) {
				System.out.println(map);
			}
			
			public void maplist(List<Map<String, Object>> list) {
				for (Map<String, Object> list1 : list) {
					System.out.println(list1);
				}
			}
}
