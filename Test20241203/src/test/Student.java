package test;


public class Student {
	
	public int num;
	public String name;
	
	public Student() {}
	
	public Student(int num, String name) {
		this.num=num;
		this.name=name;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
