package test;

public class Test4 {

	public static void main(String[] args) {
		//Member 클래스 정의
		//멤버변수 private id, pass, name
		//메서드 setter, getter
		
		//MemberDAO 클래스 정의
		
		//메서드 정의 리턴할 형이 없음 insertMember
		//(Member기억장소 주소를 전달 받은 값을 저장하는 변수)
		//전달받은 값을 아이디 : 비밀번호 : 이름 : 출력
		//
		
		Member member = new Member();
		member.setId("아이디");
		member.setPass(1234);
		member.setName("홍길동");
		
		MemberDAO memberDAO = new MemberDAO();
		memberDAO.insertMember(member);
	}

}
