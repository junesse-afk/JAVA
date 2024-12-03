package test;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("화면출력");
		System.out.println(100);
		System.out.println(100+200);
		System.out.println("화면출력"+100+200);
		System.out.println("화면출력"+(100+200));
		System.out.println("화면 출력"+" "+(100*200));
		
		int a = 10;
		int b = 20;
		char c = 'a';
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		a = 1;
		b = 2;
		
		System.out.println(a);
		System.out.println(b);
		
		String d = "ITWILL";
		String e = "ACADEMY";
		
		System.out.println(d);
		System.out.println(e);
		System.out.println(d+e);

		//byte > short > int > long
		//double > float
		
		double f = 3.1;
		double g = 3.14f;
		System.out.println(f);
		System.out.println(g);
		
		long z;
		z = 1241241232124124l;
		System.out.println(z);
		
		byte y;
		y=100;
		System.out.println(y);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		long x;
		x=100;
		System.out.println(x);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		float h = 1990;
		System.out.println(h);
		//print와 println의 차이는 줄바꿈
		//float은 약 15자릿수, double은 6~7자리
		
		int i;
		i = 35;
		int j;
		j = 10;
		System.out.println(i/j);
		System.out.println(i%j);
		
		final int k = 5;
		System.out.println(k);
		//k = 10; /final은 변하지 않도록
 		//System.out.println(k);
		
		boolean l = true;
		boolean n = false;
		
		System.out.println(l);
		System.out.println(n);
		
		//////////////////////////////////////////
		//문자 또는 숫자를 아스키코드로 변경시켜주는 방식
		
		char a1 = 'A';
		System.out.println((int)a1);
		char a2 = 'a';
		System.out.println((int)a2);
		
		int b1 = 99;
		System.out.println((char)b1);
		int b2 = 150;
		System.out.println((char)b2);
		
		Integer c1 = 50;
		// integer는  기억장소 주소를 찾아가는 연산자
		System.out.println(c1);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		
		
	}

}
