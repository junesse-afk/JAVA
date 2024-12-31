package test;

import java.util.Calendar;

public class Test2 {

	public static void main(String[] args) {
		//열거 타입 : 한정된 값인 열거 상수 중에서 하나의 상수를 저장하는 타입
		//열거 타입(Enum Type)
		
		week today = week.SUNDAY;
		System.out.println(today);
		
		week today2 = null;
		today2 = week.MONDAY;
		System.out.println(today2);
		
		Calendar calendar = Calendar.getInstance();
		int week2 = calendar.get(Calendar.DAY_OF_WEEK);
		
		// week 1 SUNDAY, 2 MONDAY
		//switch
		switch (week2) {
		case 1: today = week.MONDAY;break;
		case 2: today = week.THUESDAY;break;
		case 3: today = week.WENDSDAY;break;
		case 4: today = week.THURSDAY;break;
		case 5: today = week.FRIDAY;break;
		case 6: today = week.SATURDAY;break;
		case 7: today = week.SUNDAY;break;
		default: break;
		}
		System.out.println("오늘 요일 : "+ today);
		
		// if today == SUNDAY 같으면 "일요일 축구를 합니다"
		//                    다르면 "열심히 자바 공부합니다"
		if (today == week.SUNDAY) {
			System.out.println("일요일 축구를 합니다");
		} else {
			System.out.println("열심히 자바 공부합니다");
		}
	}
}
