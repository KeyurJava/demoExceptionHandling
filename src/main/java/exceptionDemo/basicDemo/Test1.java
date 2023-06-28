package exceptionDemo.basicDemo;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dostuff();

	}

	public static void dostuff() {
		
		System.out.println("===>"+10/0);
		domorestuff();
	}

	public static void domorestuff() {
		System.out.println("hello");
	}

}
