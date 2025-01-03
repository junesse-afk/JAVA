package test;

public class InstanceofTest{
	
	public void method(Parent parent){
		//if Child1 다운캐스팅 가능한지 판별 다운캐스팅, "Child1변환성공"
		//if Child2 다운캐스팅 가능한지 판별 다운캐스팅, "Child2변환성공"
		
		if (parent instanceof Child1) {
			System.out.println("Child1 변환성공");
		} else if(parent instanceof Child2) {
			System.out.println("Child2 변환성공");
			Child2 child2 = (Child2)parent;
			parent.prn();
			child2.prn();
			child2.child2Prn();
			
		} else {
			System.out.println("Child로 변환되지 않음");
		}
	}

}
