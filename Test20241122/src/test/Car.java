package test;

public class Car {
	
	public String company;
	public String model;
	public int price;

	
//	생성자 생략 : 기억장소 할당, 초기값 할당
	public Car() {
		
	}
// 초기값을 받는 생성자 => 멤버 변수 저장
	
	public Car(String company, String model, int price) {
		this.company = company; //디스는 멤버변수 선언한 것을 가져옴
		this.model = model; // 지역변수 선언한 것을 가져옴
		this.price = price; // Car 안에 정의된 멤버변수
							// > this:자기자신클래스, Car 속해있는 클래스
	}
	
	public void run() {
		System.out.println("회사 : " + this.company + ", 모델 : " + this.model + ", 가격 : " + this.price);
	}
	
	
}
