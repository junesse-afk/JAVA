package test;

import java.util.ArrayList;

public class Test4 {

	public static void main(String[] args) {
		
		// 부모 = 자식 객체 생성 => 자동으로 형변환(업캐스팅)
		// Animal ani = new Human(); -> 이때 Human 은 Animal형으로 변환
		// 자식 = (부모 = 자식) 객체 생성 => 명시적으로 형변환(다운캐스팅)
		// ani instanceof Human -> 이때 Human이면 Human형으로 변환
		
		//업캐스팅
		//session.setAttribute("이름", 모든형 받는 변수(모든형의 부모 Object 변수))
		
		//다운캐스팅
		//String 변수 = (자식형 String) session.getAttribute("이름")
		
		// 부모 = 부모
		Animal ani = new Animal();
		System.out.println(ani);
		ani.move();
		System.out.println("-----------------------");
		
		//부모 = 자식(업캐스팅)
		Animal ani2 = new Eagle();
		System.out.println(ani2);
		ani2.move(); // 부모 접근, 재정의 접근
		//ani.moveEagle() // 자식 접근 못함
		System.out.println("-----------------------");
		
		//Eagle eag = (Eagle)ani; => 예외발생
		//eag.move();
		//class test.Animal cannot be cast to class test.Eagle

		//자식 = 부모 (명시적으로 형변환 다운캐스팅)
		Eagle eag = (Eagle)ani2;
		eag.move();
		eag.moveEagle();
		System.out.println("-----------------------");
		
		Animal ani3 = new Tiger();
		Tiger tig = (Tiger)ani3;
		tig.move();
		tig.moveTiger();
		System.out.println("-----------------------");
		
		Zoo zoo = new Zoo();
		zoo.setAnimal(tig);
		//zoo.setAnimal(eag);
		System.out.println("-----------------------");
		zoo.setAnimal(new Tiger());
		zoo.setAnimal(new Eagle());
		//다운캐스팅을 하면서 Tiger거만 정의해서 Eagle이 오류가남
		System.out.println("-----------------------");
		
		// 다운캐스팅 instanceof연산자
		Animal aa = new Animal();
		System.out.println(aa instanceof Animal); //true
		System.out.println(aa instanceof Eagle); //false
		System.out.println(aa instanceof Tiger); //false
		System.out.println("-----------------------");
		
		Animal aaE = new Eagle();
		System.out.println(aaE instanceof Animal); //true
		System.out.println(aaE instanceof Eagle); //true
		System.out.println(aaE instanceof Tiger); //false
		System.out.println("-----------------------");
		
		Animal aaT = new Tiger();
		System.out.println(aaT instanceof Animal); //true
		System.out.println(aaT instanceof Eagle); //false
		System.out.println(aaT instanceof Tiger); //true
		System.out.println("-----------------------");
		
		
		zoo.setAnimal(new Tiger());
		zoo.setAnimal(new Eagle());
		System.out.println("-----------------------");
		
		ArrayList<Animal> anilist = new ArrayList<Animal>();
		anilist.add(new Tiger());
		anilist.add(new Eagle());
		
		for (Animal anii : anilist) {
			anii.move();
		}
	}

}
