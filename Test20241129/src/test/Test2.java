package test;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car.kind="아반떼";
		Car c = new Car();
		
		c.setPrice(10000);
		
		Car.prn();
		System.out.println("------");
		c.prn2();
		System.out.println("------");
		
		Car c2 = new Car();
		
		c2.setPrice(20000);
		Car.prn();
		c2.prn2();
	}

}
