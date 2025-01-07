package test;

public abstract class Animal {
	
		String kind;
		
		public Animal(String kind) {
			this.kind=kind;
		}
		
		public void breath() {
			System.out.println("숨을 쉽니다");
		}
		
		public abstract void sound();
}
