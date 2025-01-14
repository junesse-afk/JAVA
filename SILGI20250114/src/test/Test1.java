package test;

import java.util.Arrays;
import java.util.HashSet;

public class Test1 {
	
//	class Parent {
//		public void show() {
//		System.out.println("Parent");
//		}
//	}
//	
//	class Child extends Parent {
//		public void show() {
//			System.out.println("Child");
//		}

	public static void main(String[] args) {
		int i, j;
		int temp;
		int[] a = {75, 95, 85, 100, 50};
		
		for(i=0; i<4; i++) {
			for(j=0; j<4-i; j++) {
				if(a[j] > a[j+1]) {
					temp=a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}

		for(i=0; i<5; i++) {
			System.out.println(("%d" + a[i]));
		}
		
		int z = 3;
		int k = 1;
		
		switch (z) {
		case 0:;
		case 1:;
		case 2:;
		case 3:k = 0;
		case 4:k += 3;
		case 5:k -= 10;
		default: k--;
		System.out.print(k);
	
		}
		
		//Parent pa = new Child();
		//pa.show();
		
		HashSet<String> kz= new HashSet<String>(Arrays.asList("일본", "중국", "한국"));
		kz.add("베트남");
		kz.add("중국");
		kz.remove("일본");
		kz.addAll(Arrays.asList("홍콩", "한국", "태국"));
		System.out.println(kz);
		
	}
}
