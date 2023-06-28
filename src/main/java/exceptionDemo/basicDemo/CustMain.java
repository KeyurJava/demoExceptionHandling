package exceptionDemo.basicDemo;

public class CustMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustMain c1 = new CustMain();
		c1.maths(4, 2);

	}
 
	public void maths(int a, int b) {
		int temp = a - b;

		if (temp != 2) {
			throw new CustExp1("Something wrong");
		} else {

			System.out.println("sucessfully pass");
		}

	}

}
