package net.mollrow.felis;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Logan Blackburn
 */
public class FelisException extends Exception {
	public FelisException(String message) {
		super(message);
	}

	public FelisException(String message, Throwable cause) {
		super(message, cause);
	}
}
