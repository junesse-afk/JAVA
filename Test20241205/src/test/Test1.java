package test;

public class Test1 {

	public static void main(String[] args) {
		
//		Parent parent = new Parent();
//		parent.parentPrn();
		
		System.out.println("-----------------------");
		
		Child child = new Child();
		
		child.parentPrn();
		child.charPrn();
		//child 생성자 -> 부모껄 기억장소 저장 -> 부모기본생성자 -> 자식기본생성자 순
	}

}
