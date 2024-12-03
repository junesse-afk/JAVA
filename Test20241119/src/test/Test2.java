package test;

public class Test2 {

	public static void main(String[] args) {
		// Tree 클래스 정의
		// 멤버변수(나무의 특징을 저장하는 변수)
		// 나무의 이름, 나무의 나이
		// 멤버함수(메서드) 나무와 관련된 기능
		
		Tree a = new Tree();
		a.name = "대나무";
		a.age = 5;
		System.out.println(a.name);
		System.out.println(a.age);
		
		a.prn2(5);
		
		Tree b = new Tree();
		b.name = "은행나무";
		b.age = 15;

		System.out.println(b.name);
		System.out.println(b.age);
		
		System.out.println("==================");
		
		Animal a1 = new Animal(); //값은 다른 기억장소에 저장하고 주소를 변수 a1에 저장
		
		System.out.println("Animal형의 기억장소 주소 : " + a1);
		
		a1.name = "토끼";
		System.out.println(a1.name);
		a1.age = 10;
		System.out.println(a1.age);
		a1.run();
	}

}
