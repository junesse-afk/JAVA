package test;

public class Car {

	static String kind;
	private int price;
	
	
	static void prn() {
		System.out.println(kind);
		
	}
	void prn2(){
		System.out.println(kind);
		System.out.println(price);
	}
	public static String getKind() {
		return kind;
	}
	public static void setKind(String kind) {
		Car.kind = kind;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
