package test;

public class Test3 {

	public static void main(String[] args) {
		//비교연산자 == != > >= < <=
		int a = 10;
		int b = 15;
		System.out.println(a>=b); //false
		System.out.println("a == b =>" + (a == b)); //false
		System.out.println("a != b =>" + (a != b)); //true
		System.out.println("a > b =>" + (a > b)); //false
		System.out.println("a >= b =>" + (a >= b)); //false
		System.out.println("a < b =>" + (a < b)); //true
		System.out.println("a <= b =>" + (a <= b)); //true
		
		boolean c = a==b;
		System.out.println(c);
		
		char ch ='A'; //컴퓨터 언어 65
		
		System.out.println(ch == 65);//true
		System.out.println(ch == 'A');//true
		
		int f = 3;
		double d = 3.0;
		System.out.println(f == d);
		
		double z = 0.1;
		float x = 0.1f; //오버플로우로 false로 나옴
		System.out.println(z == x);
		System.out.println((float)z == x);
	}

}
