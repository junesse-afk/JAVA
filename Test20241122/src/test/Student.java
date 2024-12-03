package test;

public class Student {

	public int num;
	public String name;
	public int java;
	public int db;
	public int jsp;
	public int html;

	
	public Student(int num, String name, int java, int db, int jsp, int html) {
			this.num = num;
			this.name = name;
			this.java = java;
			this.db = db;
			this.jsp = jsp;
			this.html = html;
	}
	
	
	public int sum() {
		return java + db + jsp + html;
	}
	
	
	public void intro() {
				System.out.println("번호 : " + num + ", 이름 : " +  name);
			}
}
