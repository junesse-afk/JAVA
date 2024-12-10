package test;

public abstract class AbsAnimal {
	private String name;
	
	public void prn() {
		System.out.println("추상클래스 일반메서드");
	}
	
	public abstract void move();
}
