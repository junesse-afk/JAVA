package test;

public class Test1 {

	public static void main(String[] args) {
		// 빌더패턴(Builder Pattern)
		// : 객체생성 -> 생성자 패턴, 정적(static) 메서드 패턴, 빌더 패턴 사용
		// : 필요한 데이터만 설정, 유연성 확보, 가독성 높임, 변경 최소화
		
		
		//생성자 패턴
		Member member = new Member("kim", "p123", "김길동", 20);
		System.out.println(member);
		
		//정적 메서드 패턴
		Member member2 = Member.of("lee", "p456", "이길동");
		System.out.println(member2);

		//빌더 패턴(선택적으로 사용 가능)
//		Member member3 = new Member.Builder()
//				.Id("park")
//				.Pass("p789")
//				.Name("박길동")
//				//.Age(30)
//				.Build();
		
		//빌더 패턴(매개변수를 필수로 가져가야할때)
		Member member3 = new Member.Builder("park")
				.Pass(null)
				.Name(null)
				.Age(0)
				.Build();
		System.out.println(member3);
	}

}
