package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test6 {

	public static void main(String[] args) {
		
		//Math 클래스
		System.out.println("------------------------Math");
		//java.lang.Math
		//수학계산 사용
		//static 멤버변수, static 메서드()
		System.out.println(Math.PI);
		System.out.println(Math.max(10, 20));
		System.out.println(Math.min(10, 20));
		System.out.println(Math.abs(-10));
		System.out.println(Math.random());
		System.out.println(Math.round(5.3));
		System.out.println(Math.round(5.7));		
		
		//Date 클래스
		System.out.println("------------------------Date");
		Date date = new Date();
		String str = date.toString();
		System.out.println(str);
		
		SimpleDateFormat sdf
		= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str2 = sdf.format(date);
		System.out.println(str2);
		
		Calendar calender = Calendar.getInstance();
		System.out.println(calender);
		
		int year = calender.get(Calendar.YEAR);
		System.out.println(year);
		
		// month 0~11
		int month = calender.get(Calendar.MONTH);
		System.out.println(month);
		
		int day = calender.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		
		int week = calender.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		// week 이용해서 요일 출력 switch cas구문이요
		switch (week) {
			case 1:System.out.println("일요일");
			break;
			case 2:System.out.println("월요일");
			break;
			case 3:System.out.println("화요일");
			break;
			case 4:System.out.println("수요일");
			break;
			case 5:System.out.println("목요일");
			break;
			case 6:System.out.println("금요일");
			break;
			case 7:System.out.println("토요일");
			break;
			default : System.out.println("머선요일이고");
			break;
		}
	}
}
