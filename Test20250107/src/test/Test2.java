package test;

public class Test2 {

	public static void main(String[] args) {
		//Animal 추상클래스
		//멤버변수 문자열 kind
		//일반 메서드 breath() "숨을 쉽니다"
		//추상 메서드 sound() 리턴값 없음
		
		//Dog 클래스 Animal 상속
		//Dog 생성자 kind = "포유류"
		//sound 메서드 오버라이딩 "멍멍" 출력
		
		//Cat 클래스 Animal 상속
		//Cat 생성자 kind = "포유류"
		//sound 메서드 오버라이딩 "야옹" 출력
		
		Animal animal = new Dog("멍멍이");
		System.out.println(animal.kind);
		animal.breath();
		animal.sound();
		
		Animal animal2 = new Cat("야옹이");
		System.out.println(animal2.kind);
		animal.breath();
		animal.sound();
		
		Dog dog = (Dog)animal;
		System.out.println(dog.kind);
		dog.breath();
		dog.sound();
		
		Cat cat = (Cat)animal2;
		System.out.println(cat.kind);
		cat.breath();
		cat.sound();
		
		System.out.println("---------------------------");
		AnimalSound animalsound = new AnimalSound();
		animalsound.animalSound(dog);
		animalsound.animalSound(cat);
		
	}

}
