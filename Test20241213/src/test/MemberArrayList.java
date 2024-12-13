package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class MemberArrayList {
		private ArrayList<Member> arrayList; //ArrayList 선언
			
			//Member형으로 선언한 ArrayList 생성
			public MemberArrayList() {
				arrayList = new ArrayList<Member>();
			}
			
			//ArrayList에 멤버 추가
			public void addMember(Member member) {
				arrayList.add(member);
			}
			
			public boolean removeMember(int memberId) { //멤버 아이디를 매게변수로, 삭제 여부 판단
				for(int i = 0; i < arrayList.size(); i++) {
					Member member = arrayList.get(i); //get() 메서드로 회원을 순차적으로 가져옴
					//회원 아이디가 매개변수와 일치하면 해당 회원을 삭제
					int tempId = member.getMemberId();
					
					if (tempId == memberId ) {
						arrayList.remove(i);
						return true;
					}
				}
				
				Iterator<Member> ir = arrayList.iterator(); // iterator 반환
				while (ir.hasNext()){ // 해당요소가 있는 동안
					Member member = ir.next(); 
					int tempId = member.getMemberId(); // 다음 회원을 반환받음
					if(tempId == memberId) { //회원아이디가 매개변수와 일치하면
						arrayList.remove(member); //해당 회원 삭제
						return true;
					}
				}
			System.out.println(memberId + "가 존재하지 않습니다");
			return false;
			}
		//전체 회원을 출력하는 메서드
		public void showAllMember() {
			for (Member member : arrayList) {
				System.out.println(member);
			}
			System.out.println();
		}

}
