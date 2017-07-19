package exceptions;

public class CustomExceptionExample {

	public double divide(double a, double b) throws BadNumberException {
		if (b == 0.0) {
			throw new BadNumberException("cannot divide by 0");
		}
		return a / b;
	}

	public void loadUrl(String url) {
		if (url == null) {
			throw new BadUrlException("cannot load null url");
		}
		// do something with the url
	}
}

// checked exception
class BadNumberException extends Exception {
	public BadNumberException(String s) {
		super(s);
	}
}

// unchecked exception
class BadUrlException extends RuntimeException {
	public BadUrlException(String s) {
		super(s);
	}
}