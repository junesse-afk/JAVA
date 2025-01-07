package test;

public class Cat extends Animal {

	public Cat (String kind) {
		super(kind);
		System.out.println("포유류");
	}

	@Override
	public void sound() {
		System.out.println("야옹");
		
	}
}
