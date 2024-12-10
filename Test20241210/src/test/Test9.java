package test;

public class Test9 {

	public static void main(String[] args) {
		// Object클래스 hashCode()
		// hash해쉬 : 정보를 저장, 검색 사용하는 자료 구조
		//        : 정보를 저장, 정보를 가져올때 사용
		// hash() 함수 : 정보가 저장된 위치를 반환
		// 해쉬코드 값(메모리 위치값, 기억장소 주조 값)
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println("-----------------------------------");
		Student student1 = new Student("홍길동", 1);
		Student student2 = new Student("홍길동", 1);
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(student1.getClass().getName());
		System.out.println("-----------------------------------");
		// hashCode() 16진수 변경
		System.out.println(Integer.toHexString(student1.hashCode()));
		System.out.println(Integer.toHexString(student2.hashCode()));
		
		//clone() 복제
//		try {
//			Student copystudent = (Student)student1.clone();
//			System.out.println(copystudent.toString());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}

}
