package test;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * int[] kor = new int[3]; kor[0] = 100; kor[1] = 80; kor[2] = 95;
		 * 
		 * int[] math = new int[3]; math[0] = 75; math[1] = 70; math[2] = 65;
		 * 
		 * int arr[][] = {{100, 80, 95}, {75, 70, 65}}; for (int i=0; i<arr.length; i++)
		 * { for (int j=0; j<arr[i].length; j++) { System.out.print(arr[i][j] + " / ");
		 * } System.out.println(); }
		 */
		
		//java과목 85 88 82 89 87
		//web과목 95 92 96 99 91
		//db과목 77 75 73 72 79
		
		int arr2[][] = {{85, 88, 82, 89, 87}, 
						{95, 92, 96, 99, 91}, 
						{77, 75, 73, 72, 79}};
		System.out.println("과목 개수 : " + arr2.length);
		System.out.println("과목별 점수 개수 : " + arr2[0].length);
		
		
		for (int z = 0; z<arr2.length; z++) {
			int s = 0;
				if (z == 0) {
					System.out.print("java과목 : ");
				}
				if (z == 1) {
					System.out.print("web과목 : ");
				}
				if (z == 2) {
					System.out.print("db과목 : ");
				} 	
				for (int y = 0; y<arr2[z].length; y++) {
						System.out.print(arr2[z][y] + " ");
						s += arr2[z][y];
				}
				System.out.print("\n"+"총 합 : " + s + " ");
				System.out.print("\n"+ "평 균 : " + (double)s/arr2[z].length);
				System.out.println();
			}
			
	}
		
		
}


