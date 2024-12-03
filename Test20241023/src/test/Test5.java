package test;

public class Test5 {

	public static void main(String[] args) {
		//실수형 : 소수점 있는 수 - float(4byte), 기본형 double(8byte)
		double dnum = 3.14;
		System.out.println(dnum);
		// float = double 형이 맞지 않아 오류생김
		float fnum = 3.14f; //double형으로 바꿔주는 건 뒤에 F 또는 f를 붙여야함 Long과 같다고 생각하면됨
		System.out.println(fnum);
	}

}
