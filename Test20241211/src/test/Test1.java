package test;

public class Test1 {

	public static void main(String[] args) {
		//p369 String 클래스 : 문자열 관련 내장객체
		//내장객체 java.lang.String
		
		//객체생성 방법
		//1) String s = "안녕";
		//   : 상수값으로 저장(상수 풀)
		
		String s = "안녕";
		String s1 = "안녕";
		System.out.println(s == s1); //true
		System.out.println(s.equals(s1)); //true
		
		//2) String s2 = new String("안녕");
		String s2 = new String("안녕");
		String s3 = new String("안녕");
		System.out.println(s2 == s3); //false
		System.out.println(s2.equals(s3)); //true 재정의했기에
		
		System.out.println("---------------------------");
		
		//public final class String
		//String => char value[] => char 배열
		
		//문자열 연결
		String str1 = new String("java");
		String str2 = new String("jsp");
		System.out.println(str1);
		System.out.println("기억장소 주소 : " + System.identityHashCode(str1));
		System.out.println("기억장소 주소 : " + System.identityHashCode(str2));
		
		//문자열 합치기
		String str = str1.concat(str2);
		System.out.println(str);
		
		//문자열 뽑아내기
		str ="Java Programming";
		//0부터 시작해서 5부터 끝까지
		System.out.println(str.substring(5)); //Programming
		//str 변수의 값은 변경 안됨
		//str = str.substring(5);
		//System.out.println(str);
		
		//0부터 시작해서 시작위치 5부터 끝까지 8 앞에까지
		System.out.println(str.substring(5, 8)); //Pro
		
		//문자열 => 한자 뽑아오기
		System.out.println(str.charAt(5)); //P
		
		//문자열 비교 => true/false
		System.out.println(str1.equals("jsp")); //str1에 있는거랑 비교 맞으면 true 틀리면 false
		
		//특정문자 찾는 위치 // 찾는 문자가 없을때 -> -1로 뜸
		System.out.println(str.indexOf('P')); //5위치
		System.out.println(str.lastIndexOf('a')); //10위치 //뒤에서부터 찾는 내장객체?
		//문자열 길이
		System.out.println(str.length()); //16
		//문자열 변경
		System.out.println(str.replace("Java", "Jsp"));//Jsp Programming
		//문자열 분리 1.jpg, 2.jpg, 3.jpg => , 기준으로 배열 분리
		String strSplit[] = str.split(" ");
		System.out.println(strSplit[0]);
		System.out.println(strSplit[1]);
		
		String img = "1.jpg,2.jpg,3.jpg";
		String imgSplit[] = img.split(",");
		System.out.println(imgSplit[0]);
		System.out.println(imgSplit[1]);
		System.out.println(imgSplit[2]);
		System.out.println("-----------------------------------------");
		
		String jumin = "961205-1234567";
		//주민번호 뒷자리 첫번째 => 성별 나타냄
		char c = jumin.charAt(7);
		
		if(c == '1' || c == '2') {
			System.out.println("남자");
		} else if (c == '3' || c == '4'){
			System.out.println("여자");
		} else {
			System.out.println("사람아님");
		}
		
		String ss = jumin.substring(7, 8);
		if(ss.equals("1")|| ss.equals("3")) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
	}

}