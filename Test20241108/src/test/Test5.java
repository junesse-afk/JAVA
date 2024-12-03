package test;

public class Test5 {

	public static void main(String[] args) {
		// int 형 num 배열 변수 선언
		// 원하는 초기값 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		
		int num[]= {1,2,3,4,5,6,7,8,9,10};
			System.out.println(num.length);
		
		for (int i = 0; i < num.length; i++) {	
			System.out.println(num[i]);
		}
		System.out.println("---------------");
		//향상된 for문 배열
		for (int z : num) {
			System.out.println(z);
		}
		System.out.println("-----------------");
		//double형 data 배열 변수 5개 기억장소 선언
		double num2[]= {1.0, 2.0, 3.0, 4.0, 5.0};
		for (int a = 0; a<num2.length; a++) {
			System.out.print(num2[a]+"\n");
		}
		System.out.println("-----------------");
		for (double g: num2) {
			System.out.println(g);
		}
		System.out.println("-----------------");
		// char형 ch 배열 변수 5개 기억장소 선언
		// 초기값 'A', 'B', 'C', 'D', 'E'
		char num3[]= {'A', 'B', 'C', 'D', 'E'};
		for (int b=0; b<num3.length; b++) {
			System.out.println(num3[b]);
		}
		System.out.println("-----------------");
		for (char y : num3) {
			System.out.println(y);
		}
		System.out.println("-----------------");
		// String형 str 배열 변수 3개 기억장소 선언
		//초기값 "java", "html", "db"
		String num4[]= {"java", "html", "db"};
		for (int c=0; c<num4.length; c++) {
			System.out.println(num4[c]);
		}
		System.out.println("-----------------");	
		for (String x : num4) {
			System.out.println(x);
		}
		System.out.println("-----------------");
	}
}
