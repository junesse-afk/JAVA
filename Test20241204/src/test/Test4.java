package test;

public class Test4 {

	public static void main(String[] args) {
		// 객체개념 특징 : 데이터 은닉,  상속, 추상화, 다형성
		// 상속 : 부모와 자식 상속관계를 클래스로 정의
		//     : 부모의 모든 것을 자식이 사용할 수 있다
		// 부모클래스(상위클래스, super클래스), 자식클래스(하위클래스, sub클래스)
		// 부모클래스 Parent
		// 메서드 parentPrn() "부모메서드" 출력
		
		Parent parent = new Parent();
		parent.parentPrn();
		//parent.charPrn();
		// 자식클래스 child
		// 메서드 charPrn() "자식 메서드" 출력
		
		// 부모가 가지고 있는 코드는 자식껄로 못 가져옴
		// 부모가 상속시켜놓으면 자식이랑 부모랑 상속은 안됨
		
		Child child = new Child();
		child.charPrn();
		child.parentPrn();
		

	}
	

}
