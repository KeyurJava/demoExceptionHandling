package exceptionDemo.basicDemo;

public class FileUploadExp extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FileUploadExp(String msg, Throwable t) {
		super(msg, t);
	}

}
