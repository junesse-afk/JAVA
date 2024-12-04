package test;

public class Test6 {

	public static void main(String[] args) {
		// 접근제어자 public / protected / default(package) / private
		// protected : 같은 클래스, 같은 폴더, 다른 폴더 중에 상속관계 접근
		
		// Point2 클래스 정의
		// 멤버변수 protected int x, int y, set, get 메서드
		// 메서드() prn2() x, y 출력
		
		// Point3 클래스 정의 Point2 상속
		// 멤버변수 int z set, get 메서드
		// 메서드() prn3() x, y 출력
		
//		Point2 point = new Point2();
//		point.setX(10);
//		point.setY(5);
		
		Point3 point2 = new Point3();
		point2.setX(10);
		point2.setY(5);
		point2.setZ(20);
		
		point2.prn3();
		System.out.println("-------------------------");
		System.out.println(point2.getX());
		System.out.println(point2.getY());
		System.out.println(point2.getZ());
		System.out.println(point2.getX()+point2.getY()+point2.getZ());
		System.out.println("-------------------------");
	}

}
