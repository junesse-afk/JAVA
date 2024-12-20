package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test5 {

	public static void main(String[] args) {
		//p473 스트림[for문 미리 구현해놓음] : 자료가 모여 있는 배열이나 컬렉션(arraylist, vector) 등의 자료를 일관성 있게 처리가 가능
		
		//기존 배열
		int[] arr = {1, 2, 3, 4, 5};
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("--------------------------------");
		for (int n : arr) {
			System.out.println(n);
		}
		System.out.println("--------------------------------");
		
		//스트림
		//스트림 생성부분       요소를 하나씩 꺼내어 출력하는 기능
		Arrays.stream(arr).forEach(n -> System.out.println(n));
		System.out.println("--------------------------------");
		
		//배열 내용의 합 ( sum() )
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		System.out.println("--------------------------------");
		
		//배열 개수 ( count() ) long 형태이기에 앞에 int 붙여함
		int count = (int)Arrays.stream(arr).count();
		System.out.println(count);
		System.out.println("--------------------------------");
		
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("jsp");
		list.add("html");
		list.add("db");
		
		Stream<String> str = list.stream();
		str.forEach(s -> System.out.println(s + " "));
		System.out.println("--------------------------------");
		
		//알파벳 순서로 정렬 ( sorted() )
		list.stream().sorted().forEach(s -> System.out.println(s + " "));
		System.out.println("--------------------------------");
		
		//조건이 일치하는 것만 노출 ( filter() )
		list.stream()
		.filter(s -> s.equals("html"))
		.forEach(s -> System.out.println(s + " "));
	}

}
