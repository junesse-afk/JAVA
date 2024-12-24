package test;

import java.io.FileReader;
import java.io.FileWriter;

public class Test4 {

	public static void main(String[] args) {
		//문자 단위 입력
		//1) 입력스트림
		// FileReader(문자단위처리), BufferedReader(문자단위처리)
				
		//2) 출력스트림
		// FileWriter(문자단위처리), BufferedWriter(문자단위처리)
		
		try {
			FileReader fileReader = new FileReader("writer.txt");
			int i;
			while((i = fileReader.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			FileWriter fileWriter = new FileWriter("writer.txt");
			fileWriter.write('A');
			char buf[] = {'B','C','D','F'};
			fileWriter.write(buf);
			fileWriter.write("안녕하세요");
			fileWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
