package test;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {3, 6, 9, 12};
		 
		System.out.println(arr[0] + 2);
		System.out.println(arr[1] + arr[2]);
		System.out.println(arr[3] - 3);
		
		char arr2[] = new char[26];
		char ch = 'A';
		for (int i = 0; i < arr2.length; i++, ch++) {
			arr2[i] = ch;
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i] + " , " + (int)arr2[i]);
		}
//		for (char c : arr2) { 
//			 System.out.println(arr2[c] + " , " + (int)arr2[c]);
//		}
		
		String arr3[] = {"여행", "게임", "운동"};
		for (int s = 0; s < arr3.length; s++) {
			System.out.println(arr3[s]);
		}
		for(String hobby : arr3) {
			System.out.println(hobby);
		}
	}

}
