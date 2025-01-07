package test;

public class Dog extends Animal {

	public Dog (String kind) {
		super(kind);
		System.out.println("포유류");
	}

	@Override
	public void sound() {
		System.out.println("멍멍");
		
	}
}
