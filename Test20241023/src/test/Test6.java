package test;

public class Test6 {

	public static void main(String[] args) {
		//4. 논리형 : true/false = blooean(1byte)
		boolean a = true;
		System.out.println(a);
		
		boolean b = false;
		System.out.println(b);
		//기억장소(변수) -> 기억장소 크기, 자료형 지정
		
		var num = 10; // 형을 지정하지 않았지만 컴파일러가 자료형을 추측하고 사용(자바10버전부터)
		System.out.println(num);
		
		//num="문자"; // 자바는 처음에 저장된 형에 따라 계속 종속되나봄 / int형과 char형이 다르듯
		
		var dnum = 10.0;
		System.out.println(dnum);
		
		dnum = 3; // 작은형에서 큰형으로 변경됨
		//dnum = "a";
		System.out.println(dnum);
		
		var str ="hello";
		System.out.println(str);
		//str=3; // 형이 틀려서 에러 발생
		
		var fnum =3.4f;
		System.out.println(fnum);
		//fnum="삼점사";
		
		
		
	}

}
