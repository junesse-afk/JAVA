package test;

public class Test2 {

	public static void main(String[] args) {
		// for문안에 for문을 써서 조건값까지 반복해서 출력가능함
		/*
		 * for (int j = 1; j <= 5; j++) { System.out.print("j = " + j + " : "); for (int
		 * i = 1; i <= 5; i++) { System.out.print(i + " "); } System.out.println();// 줄
		 * 띄우기 }
		 */
		/*******/
		/*
		 * for (int z = 1; z<=5; z++)//행 { // System.out.println(); for (int x = 1;
		 * x<=5; x++) //열 { // System.out.print("*"+" "); System.out.print(z+ " " + x +
		 * " , "); System.out.print(x); if (x != 5){ System.out.print(z + " "+ x + ",");
		 * }else { System.out.print(z + " "+ x + " "); } } System.out.println(); }
		 */
		// 2~9단 출력

		for (int dan = 2; dan <= 9; dan++) {
				if(dan%2!=0) continue; {
				}
				for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " * "+ i + " = "+ dan*i);	
				}
				
				
			}
		System.out.println("===================================");
		for (int a = 2; a<=9; a++) {
			System.out.println(a + "단");
				for (int b = 1; b<=9; b++) {
					System.out.println(a + " * "+ b + " = "+ a * b);
						if(b >= a) {
							break;
						}				
				}
		}
		
	}
}
