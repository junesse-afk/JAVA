package test;

public class Point2 {
	
			// Point2 클래스 정의
			// 멤버변수 protected int x, int y, set, get 메서드
			// 메서드() prn2() x, y 출력
	
		protected int x;
		protected int y;
		
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
