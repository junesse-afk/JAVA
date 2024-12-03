package test;

public class Test2 {

	public static void main(String[] args) {
		// 부호연산자(단항연산자)
		// + 양수, - 음수 => +3, -3
		int num = 10;
		System.out.println(+num);//10
		System.out.println(-num);//-10
		System.out.println(num);//10
		num = -num;//10
		System.out.println();
		
		//++ > 1증가 
		//-- > 1감소
		//앞, 뒤에 사용하여 값을 1만큼 증가, 만큼 감소 연사자
		
		int num2 =10;
		System.out.println(++num2);
		System.out.println(--num2); // 위에 1증가했기 때문에 11-1이 되어진거임
		System.out.println(num2+=1);
		System.out.println();
		
		int b2 =10;
		System.out.println(--b2);
		System.out.println(b2-=1);
		System.out.println(b2-1);
		System.out.println(b2--);
		b2--;
		System.out.println(b2);
		
	}

}
