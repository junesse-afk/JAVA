package p2;

import p1.Person;

public class Student extends Person {
	private String privateVar2;
			String packageVar2;
	protected String protectedVar2;
	public String publicVar2;
	
	public void personPrn2() {
		System.out.println("privateVar = " + getPrivateVar());//같은 클래스
		System.out.println("packageVar = " + getPackageVar());//같은 폴더
		System.out.println("protectedVar = " + protectedVar);//다른폴더 상속관계
		System.out.println("publicVar = " + publicVar);//모든 가능
		
		System.out.println("privateVar2 = " + privateVar2);//같은 클래스
		System.out.println("packageVar2 = " + packageVar2);//같은 클래스
		System.out.println("protectedVar2 = " + protectedVar2);//같은 클래스
		System.out.println("publicVar2 = " + publicVar2);//같은 클래스
	}
}
