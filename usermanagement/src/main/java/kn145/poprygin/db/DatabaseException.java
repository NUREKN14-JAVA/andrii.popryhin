package kn145.poprygin.db;

public class DatabaseException extends Exception {

	private static final long serialVersionUID = 1L;

	public DatabaseException(String exceptionMessage) {
		super(exceptionMessage);
	}

	public DatabaseException() {
		super();
	}

}
