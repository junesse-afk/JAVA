package test;

public class Test4 {
	
	public static void main(String[] args) {

	//Parent 클래스 정의
	//child1 클래스 정의 parent 상속
	//child2 클래스 정의 parent 상속
	
	//instanceofTest 클래스 정의
	//method(Parent 받는 변수) 정의
	


	//Child1 자식객체생성
	//Child2 자식객체생성
	
	Parent parent = new Child1();
	Parent parent1 = new Child2();
	Parent parent2 = new Parent();
	
	Child1 child1 = (Child1)parent;
	Child2 child2 = (Child2)parent1;
	
	InstanceofTest iot = new InstanceofTest();
	iot.method(child1);
	iot.method(child2);
	iot.method(parent2);
	
	//상소 -> 메서드 오버라이딩(재정의) + 타입변환(업캐스팅)
	//=> 다형성
	
	}
}

