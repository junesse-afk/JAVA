package test;

public class Test3 {

	public static void main(String[] args) {
		// 부모 = 자식 객체생성(업캐스팅:위(부모)로 자동 형변환)
		// Shape sha = new Circle();
		// 메서드 오버라이딩 된 메서드 호출() => 다형성 적용
		// : 부모의 참조변수, 오버라이딩 메서드 동일
		// : 자식이 재정의한 메서드 구현 내용이 다양함
		
		Animal animal = new Animal();
		System.out.println(animal);
		animal.move();
		
		//애니멀 단독 주소 사용
		
		//Tiger 업캐스팅 객체생성
		Animal ani = new Tiger(); //애니멀+타이거 주소 사용
		System.out.println(ani);
		//메서드호출()
		ani.move();
		
		
		//Eagle 업캐스팅 객체생성
		Animal ani2 = new Eagle(); //애니멀+이글 주소 사용
		System.out.println(ani2);
		//메서드 호출()
		ani2.move();
		
		
		System.out.println("----------------------");
		
		//Tiger 객체생성
		Tiger tiger = new Tiger();
		
		//Eagel 객체생성
		Eagle eagle = new Eagle();
		
		//Zoo 객체생성
		//setXXX()메서드 호출
		Zoo zoo = new Zoo();
		zoo.setTiger(tiger);
		zoo.setEagle(eagle); //이런식이면 메서드가 늘어난다 그래서 부모껄 호출한다
		zoo.setAnimal(tiger);
		zoo.setAnimal(eagle);
		//업캐스팅인데 부모껄 가져오면 코드가 줄어든다
		//주로 데이터 초기화 후 새로입력할때 쓰이는가봄
		
	}

}
