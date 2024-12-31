package p1;

public class Person {
	private String privateVar;
			private String packageVar;
	protected String protectedVar;
	public String publicVar;
	
	public void personPrn() {
		System.out.println("privateVar = " + privateVar);
		System.out.println("packageVar = " + packageVar);
		System.out.println("protectedVar = " + protectedVar);
		System.out.println("publicVar = " + publicVar);
	}

	public String getPrivateVar() {
		return privateVar;
	}

	public void setPrivateVar(String privateVar) {
		this.privateVar = privateVar;
	}

	public String getPackageVar() {
		return packageVar;
	}

	public void setPackageVar(String packageVar) {
		this.packageVar = packageVar;
	}
}
