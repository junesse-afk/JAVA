package test;

public class Zoo {
	
	//Tiger 받는 setTiger(Tiger 받는 변수) 메서드
		//move()메서드 호출
	public void setTiger(Tiger tig) {
		System.out.println("tig 전달받음");
		tig.move();
	
	}
	
	//Eagle 받는 setEalge(Eagle 받는 변수) 메서드
		//move()메서드 호출
	
	public void setEagle(Eagle eag) {
		System.out.println("eag 전달받음");
		eag.move();
	}
	
		//모든 동물을 받는 setAnimal(Animal 받는 변수) 메서드
		//move()메서드 호출
	
	public void setAnimal(Animal ani) {
		System.out.println("ani(tig+eag) 전달받음");
		ani.move();
		//자식 = ani 업캐스팅된 부모 => 다운캐스팅 tiger
		//move() 메서드 호출
	
		if (ani instanceof Tiger) {
			Tiger tig1 = (Tiger)ani;
			tig1.move();
			tig1.moveTiger();
		} else if (ani instanceof Eagle) {
			Eagle eag1 = (Eagle)ani;
			eag1.move();
			eag1.moveEagle();
		}
		
		//moveTiger() 메서드 호출
	}
	

}
