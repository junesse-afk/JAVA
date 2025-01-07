package test;

public class SmartPhone extends Phone {
		
		//부모, 자식 생성자
		public SmartPhone(String owner) {
			super(owner);
		}
		
		@Override
		public void sound() {
			System.out.println("벨 소리가 들린다");
		}
		
		public void internetSearch(){
			System.out.println("인터넷을 검색합니다.");
		}
}
