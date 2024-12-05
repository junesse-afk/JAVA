package test;

public class Test4 {

	public static void main(String[] args) {
		//메서드 오버로딩 : 같은 클래스 내에서 메서드 이름을 동일하게 사용
		//           : 매게변수 개수, 매개변수 형 틀리게
		
		
		//메서드 오버라이딩(메서드 재정의)
		//부모와 자식 상속관계에서 부모의 메서드를 재정의(수정)
		
		Tiger tiger = new Tiger();
		tiger.move();
		//tiger.moveTiger();
		
		Eagle eagle = new Eagle();
		eagle.move();
		//eagle.moveEagle();

	}

}
