package test;

import java.util.ArrayList;

public class Test5 {

	public static void main(String[] args) {
		// 부모 Shape = 자식 Circle 객체 생성 => 업캐스팅
		Shape sha = new Circle();
		
		// 자식 = 업캐스팅된 부모 객체생성
		Circle cir = (Circle)sha;
		//prn()메서드 호출
		cir.prn();
		System.out.println("------------------------");
		
		Shape sha2 = new Rec();
		Rec rec = (Rec)sha2;
		sha2.prn();
		System.out.println("------------------------");
		
		Shape sha3 = new Tri();
		Tri tri = (Tri)sha3;
		sha3.prn();
		System.out.println("------------------------");
		
		ArrayList<Shape> shalist = new ArrayList<Shape>();
		shalist.add(cir);
		shalist.add(rec);
		shalist.add(tri);
		
		for (Shape shaa : shalist) {
			shaa.prn();
		}
		System.out.println("------------------------");
		// 배열에 특정한 형을 저장(제네릭타입)
		ArrayList<Circle> arr = new ArrayList<Circle>();
		//Circle 배열에 어떤형을 저장할껀지
		arr.add(cir);
		Circle circle2 = arr.get(0);
		circle2.prn();
		System.out.println("------------------------");
		
		//배열에 모든형을 저장
		
		//ArrayList arr2 = new ArrayList();
		//arr2.add(1); // Object형으로 업캐스팅 형변환
		//arr2.add("안녕"); // Object형으로 업캐스팅 형변환
		//arr2.add(new Circle()); //업캐스팅이 안된 상태 // Object형으로 업캐스팅 형변환
		//자식 = 업캐스팅 된 부모 => (명시적형변환)다운캐스팅
		//Integer integer = (Integer)arr2.get(0);
		//System.out.println(integer);
		//String string = (String)arr2.get(1);
		//System.out.println(string);
		//Circle circle3 = (Circle)arr.get(2);
		//circle3.prn();
		//System.out.println("------------------------");
		

	}
}
