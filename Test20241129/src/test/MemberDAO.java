package test;

public class MemberDAO {

	
	
	public void insertMember(Member member){
		System.out.println(member.getId());
		System.out.println(member.getName());
		System.out.println(member.getPass());
	}
	
}
