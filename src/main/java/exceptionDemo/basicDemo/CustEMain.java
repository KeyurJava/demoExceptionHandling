package exceptionDemo.basicDemo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Test101 extends Exception {
	public Test101(String s) {
		super(s);
	}
}

class Test102 {
	public void maths1() throws Test101 {
		throw new Test101("dddddd");

	}

	void maths2() {
		
		ExecutorService executorService = Executors.newSingleThreadExecutor() ;
		//executorService.execute();
		System.out.println("hello");
	}
}

public class CustEMain {

	public static void main(String[] args) throws Test101 {
		// TODO Auto-generated method stub

		Test102 t1 = new Test102();
		t1.maths1();
		t1.maths2();
		

	}

}
