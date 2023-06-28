package exceptionDemo.basicDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CardFileUploadFunction {

	public void uploadFile() throws IOException {

		String filePath = "K:\\myfile\\Hello.txt";
		FileInputStream cust_xlsFile = null;

		try {
			cust_xlsFile = new FileInputStream(filePath);
			int i = cust_xlsFile.read();
			System.out.println((char) i);

		} catch (FileNotFoundException e) {
			try {
				throw new FileUploadExp("PLease check File Name or path", e);
			} catch (Exception fileE) {
				// getting message and stack Trace for exception
				fileE.getMessage();
				fileE.printStackTrace();
			}
		} finally {
			cust_xlsFile.close();
		}

	}

}
