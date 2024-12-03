package test;

public class Tree {

	public String name ;
	public int age ;
	public float arr[];
	
	public void prn2(int a) {
		
		if (a < 10) {
			System.out.println("나무가 안자란다");
		} else {
			System.out.println("나무가 자란다");
		}
		return;
	}
	
	public static int sum(int arr2[]) {
		int a = 0;
		
		for (int i = 0; i<arr2.length; i++) {
			a += arr2[i];
		}
		return a;
	}	
}


