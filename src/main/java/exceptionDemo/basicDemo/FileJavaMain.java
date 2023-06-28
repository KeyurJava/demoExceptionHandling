package exceptionDemo.basicDemo;

import java.io.IOException;

// Exception class

public class FileJavaMain {
	public static void main(String[] main) throws IOException {

		CardFileUploadFunction c = new CardFileUploadFunction();
		c.uploadFile();
		// CardFileUploadFunction.uploadFile();
	}
}
