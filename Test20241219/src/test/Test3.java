package test;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {

	public static void main(String[] args) {
		
		//SQL TimeStamp 타입 대응
		Timestamp timeStamp = new Timestamp(System.currentTimeMillis());
		System.out.println(timeStamp);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String str = dateFormat.format(timeStamp);
		System.out.println(str);
		
		//String -> Date -> Timestamp 변환
		try {
			Date date = dateFormat.parse(str);
			Timestamp timestamp = new Timestamp(date.getTime());
			System.out.println(timestamp);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
