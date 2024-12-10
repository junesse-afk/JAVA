package test;

public class Test8 {

	public static void main(String[] args) {
		// equals() 메서드
		// 주소에 해당하는 실제 기억장소 값이 같다
		
		Book book1 = new Book(1, "삼국지");
		System.out.println(book1); //test.Book@6b143ee9
		
		Book book2 = new Book(1, "삼국지");
		System.out.println(book2); //test.Book@1936f0f5
		
		//주소비교
		System.out.println(book1 == book2);//false
		
		System.out.println(book1.equals(book2));//false
		
		Book book3 = book1;
		System.out.println(book1 == book3); //true
		System.out.println(book1.equals(book3)); //true
		
		String str1 = new String("문자열");
		String str2 = new String("문자열");
		//주소비교
		System.out.println(str1 == str2); //false 주소틀림
		//주소에 해당하는 인스턴스(기억장소) 비교 equals() 재정의
		System.out.println(str1.equals(str2)); //true
		System.out.println("--------------------------");
		
		Student stu = new Student("홍길동", 1);
		Student stu2 = new Student("홍길동", 1);
		
		Student stu3 = stu;
		
		System.out.println(stu.toString());
		System.out.println(stu2.toString());
		System.out.println(stu3.equals(stu));
		
		System.out.println("---------------------------");
		
		Student stu4 = new Student("강감찬", 2);
		Student stu5 = new Student("강감찬", 2);
		// toString() 재정의
		System.out.println(stu4 == stu5); //false
		//equals() 재정의
		System.out.println(stu4.equals(stu5)); //true
		
		Integer integer1 = new Integer(100);
		Integer integer2 = new Integer(100);
		
		
	}

}
