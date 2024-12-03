package test;

public class Test1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '+';

		int sum = 0;
		if (operator == '+') {
			sum = num1 + num2;
		} else if (operator == '-') {
			sum = num1 - num2;
		} else if (operator == '*') {
			sum = num1 * num2;
		} else if (operator == '/') {
			sum = num1 / num2;
		} else {
			System.out.println("오류");
			return;
		}
		System.out.println(sum);

		switch (operator) {
		case '+':
			sum = num1 + num2;
			break;
		case '-':
			sum = num1 - num2;
			break;
		case '*':
			sum = num1 * num2;
			break;
		case '/':
			sum = num1 / num2;
			break;
		default:
			System.out.println("오류");
		} // == 의 경우에만 주로 사용
		System.out.println(sum);
		// 3의 배수 갯수 구하기 / 5의 배수 갯수 구하기
		int i =1;
		int sum2 = 0;
		int sum3 = 0;
		//처음과 끝을 모를때 while 문 써야함
		while (i <= 100) {
			if (i%3==0) {
				sum2++;
			}
			if (i%5==0) {
				sum3++;
			}
			i++;
		}
		/*
		 * for (i = 1; i <= 100; i++) {
		 *  if (i % 3 == 0) {
		 *   sum2++; 
		 *   	} 
		 *  if (i % 5 == 0) {
		 * 	sum3 += 1;
		 *  	} 
		 *  }
		 */
		System.out.println(sum2);
		System.out.println(sum3);

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			if (ch == 'G') {
				continue; // G빼고 전체출력 // break는 G 밑으로 미출력
			}
			System.out.println(ch);
		}

	}

}
