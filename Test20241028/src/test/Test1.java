package test;

public class Test1 {

	public static void main(String[] args) {

		String a ="Hello World";
		System.out.println("문자열 출력 :"+a+100+" 안녕하세요");
		//특수 출력 문자 > \" 또는 \'
		System.out.println("\"출력\"");
		//""문자로 출력
		System.out.println("\\출력\\");
		//\\문자로 출력
		System.out.println("\'출\'");
		//탭만큼 이동 출력 \t
		System.out.println("출\t력");
		//다음줄로 이동 \n
		System.out.println("출\n력");
		//파일경로를 사용할 때는
		
		String b = "D:\\workspace_java\\Test20241028\\src";
		System.out.println(b);
		
		System.out.println("Hello\n\"Java\"\t\\programming");
	}

}
