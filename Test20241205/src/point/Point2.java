package point;

public class Point2 {
	
			// Point2 클래스 정의
			// 멤버변수 protected int x, int y, set, get 메서드
			// 메서드() prn2() x, y 출력
	
		protected int x;
		protected int y;
		
		
//		public Point2() {
//			
//		}
//		
		public Point2(int x, int y) {
			//생성자 x,y를 받는 생성자
			//멤버변수 = 받은 값 저장
			this.x=x;
			this.y=y;
			System.out.println("x,y를 받는 생성자");
			//출력 "x,y를 받는 생성자"
		}

		
		
		
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		
		public void prn2() {
			System.out.println(x);
			System.out.println(y);
		}
		
}
