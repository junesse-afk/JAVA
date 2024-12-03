package test;

public class Test2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* char arr[][] = new char[13][2]; */
		char arr[][] = new char[13][2];
		char ch = 'a';
		
		for (int i = 0; i < arr.length; i++) {
			for (int y = 0; y < arr[i].length; y++) {
				arr[i][y] = ch;
				ch++;
				System.out.print(arr[i][y]);
			}
			System.out.println();
		}

	}

}
