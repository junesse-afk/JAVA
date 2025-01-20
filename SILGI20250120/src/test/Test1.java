package test;

public class Test1 {

	public static void main(String[] args) {

//		2021년 3회 정보처리기사 실기 기출 //싱글톤패턴 문제
		//1번
		Connection conn1 = Connection.get();
		conn1.count(); // 1증가
		Connection conn2= Connection.get();
		conn1.count(); // 1증가
		Connection conn3 = Connection.get();
		conn1.count(); // 1증가
		
		System.out.println(conn1.getCount());
		
		//11번
		
		int a = 3, b = 4, c = 3, d = 5;
		System.out.println(a == 2);
		System.out.println(a == c);
		System.out.println(a == 2 | a == c);
		if((a==2| a==c)&!(c>d)&(1==b ^ c != d)) {
			a = b + c;
			if(7 == b ^ c != a) {
				System.out.println(a);
			} else {
				System.out.println(b);
			}
		} else {
			a = c + d;
			if(7 == c ^ d != a) {
				System.out.println(a);
			} else {
				System.out.println(d);
			}
		}
		//12번
		int arr[] = new int[3];
		a = 12; b = 24; c= 36;
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		System.out.println(arr[1] + arr[0] + 1); //결과 37

	}
	
	
}
	class Connection {
		private static Connection _isnt = null;
		private int count = 0;
		static public Connection get() {
			if(_isnt == null) {
				_isnt = new Connection();
				return _isnt;
			}
			return _isnt;
		}
		public void count() { count ++;}
		public int getCount() { return count;}
	}
	

