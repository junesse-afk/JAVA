package test;

public class EagleA extends AbsAnimal{

	//AbsAnimal 추상 클래스 상속 => 에러발생
	//추상메서드(메서드틀) => 추상메서드 강제적 오버라이딩(재정의)
	//추상메서드 틀을 구현
	
	@Override
	public void move() {
		// super를 못쓰는 이유는 부모가 추상클래스라서
		System.out.println("EagleA클래스 추상메서드 구현");
		
	}
	


	
	
}
