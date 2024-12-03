package test;

public class Test4 {

	public static void main(String[] args) {

//		for (int i = 1; i <= 9; i++) {
////			System.out.print(i+"*"+ 1 + "=" + i*1 + "\t");
//			for (int a = 2; a <= 9; a++) {
//				System.out.print(a + "*" + i + "=" + a * i + "\t");
//			}
//			System.out.println();
//		}
		
		int b[]= {10,20,30,40,50};
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		System.out.println(b[4]);
		
		int c[]= new int[] {10,20,30,40,50};
		System.out.println("배열 크기 저장하는 변수 : " + c.length);
		for (int i=0; i>5; i++) {		
			System.out.println(c[i]);
		}
		
	}
}