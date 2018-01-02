/**
 * 
 */
package com.study.tool;

/**
 * @author Administrator
 *
 */
public class QuestException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 *constructors
	 */
	public QuestException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 *constructors
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public QuestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	/**
	 *constructors
	 * @param message
	 * @param cause
	 */
	public QuestException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 *constructors
	 * @param message
	 */
	public QuestException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 *constructors
	 * @param cause
	 */
	public QuestException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	

}
