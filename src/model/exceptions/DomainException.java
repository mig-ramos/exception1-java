package model.exceptions;

// public class DomainException extends Exception {
// RuntimeException - não obriga a tratar a excessão, foi tirada as thows exception.
	public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);
	}
}
