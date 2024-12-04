package test;

public class Point3 extends Point2 {
	
			// Point3 클래스 정의 Point2 상속
			// 멤버변수 int z set, get 메서드
			// 메서드() prn3() x, y 출력

	protected int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public void prn3() {
		System.out.println(x+y+z);
	}
}
