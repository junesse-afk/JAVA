package test;

import java.io.FileNotFoundException;

public class Test2 {

	public static void main(String[] args) throws FileNotFoundException {
	
		ThrowsException exception =
				new ThrowsException();
			exception.loadfile();
	}

}
