package exceptionDemo.basicDemo;

public class StackMainDemo {

	public void m1() {
		m2();
	}

	public void m2() {
		m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackMainDemo s1 = new StackMainDemo();
		s1.m1();

	}

}
