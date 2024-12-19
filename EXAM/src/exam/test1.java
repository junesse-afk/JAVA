package exam;

public class test1 {

	public static void main(String[] args) {
		
		int pee = 50000;
		int age = 3;
		
		if (age < 5 || age >= 65) {
			pee = 25000;
			System.out.println("나이가 " + age +"세이므로 입장료는 " + pee +"원입니다");
		} else if (age >= 5 && age < 19) {
			pee = 35000;
			System.out.println("나이가 " + age +"세이므로 입장료는 " + pee +"원입니다");
		} else {
			System.out.println("나이가 " + age + "세이므로 입장료는 " + pee + "원입니다.");
		}

	}

}
