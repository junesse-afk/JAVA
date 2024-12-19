package test;

//import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Test1 {

	public static void main(String[] args) {
		
		//현재 날짜 구하기
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		System.out.println("------------------------");
		
		LocalDate localDate2 = LocalDate.now(ZoneId.of("Europe/Paris"));
		System.out.println(localDate2);
		System.out.println("------------------------");
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		String formatedNow = localDate.format(formatter);
		System.out.println(formatedNow);
		System.out.println("------------------------");
		
		int year = localDate.getYear();
	
		String month = localDate.getMonth().toString();
		int mon = localDate.getMonthValue();
		
		int day = localDate.getDayOfMonth();
		
		String week = localDate.getDayOfWeek().toString();
		int wee = localDate.getDayOfWeek().getValue();
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(mon);
		System.out.println(day);
		System.out.println(week);
		System.out.println(wee);
		System.out.println("------------------------");
		
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		String str = localTime.format(formatter2);
		System.out.println(str);
		System.out.println("------------------------");
		
		int hour = localTime.getHour();
		int minute = localTime.getMinute();
		int second = localTime.getSecond();
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		System.out.println("------------------------");
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String str2 = localDateTime.format(formatter3);
		System.out.println(str2);
		System.out.println("------------------------");
		
		//Timestamp timeStamp = new Timestamp(second);
		
		
	}

}
