package test;

public class Test3 {

	public static void main(String[] args) {
		//인터페이스 InterAniaml
		//public interface 인터페이스이름 {
		//추상메서드()정의 => abstract 생략 가능
		//}
		
		//인터페이스 상속 받은 클래스 EagleInter
		//인터페이스 상속 받은 클래스 TigerInter
		
		//부모 인터페이스 = 틀을 구현한 자식 클래스(업캐스팅, 다형성)
		
		InterAnimal ia = new EagleInter();
		ia.move();
		
		ia = new TigerInter();
		ia.move();
		
		

	}

}
