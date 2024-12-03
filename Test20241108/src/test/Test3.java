package test;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int a=1; a<=5; a++) {
			for(int b=1; b<=a; b++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		System.out.println("----------------");
		
		
		for(int a=1; a<=5; a++) {
			for(int b=5; b>=a; b--) {
				System.out.print(" ");	
			}
			for (int c=1; c<=a; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------");
		
		for(int a=1; a<=5; a++) {
			for(int b=5; b>a; b--) {
			System.out.print(" ");	
		}
			for (int c=1; c<=2*a-1; c++) {
			System.out.print("*");
		}
			System.out.println();
	}
		System.out.println("----------------");
		
		for(int a=1; a<=5; a++) {
			for(int b=5; b>=a; b--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------");
		
	}
}
