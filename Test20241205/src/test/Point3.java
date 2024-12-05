package test;

import point.Point2;
//컨트롤 쉬프트 O > 자동으로 한꺼번에 import
public class Point3 extends Point2 {
	
			// Point3 클래스 정의 Point2 상속
			// 멤버변수 int z set, get 메서드
			// 메서드() prn3() x, y 출력
	protected int z;
	
	//생성자 x,y,z 받는 생성자
	//부모의 x,y 전달받는 생성자를 호출
	//출력 "생성자 x,y,z 받는 생성자"
	//멤버변수 <= 받은값 저장
	
//	public Point3() {
//		super(10,20);
//		System.out.println("x,y,z를 받는 생성자");
//	}
	
//	public Point3(int z) {
//		super(10, 20); //부모께 먼저 와야한다
//		this.z=z;
//		System.out.println("x,y,z를 받는 생성자");
//	}
	
	public Point3(int x, int y, int z) {
		super(x, y);
		System.out.println("생성자 x,y,z 받는 생성자");
		this.x=x;
		super.y=y;
		this.z=z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public void prn3() {
		super.prn2();
		System.out.println(x+y+z);
	}
}
