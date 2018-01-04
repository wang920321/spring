/**
 * 
 */
package com.springinaction.springidol.instrument;

/**
 * @author Administrator
 *
 */
public class Piano implements Instrument {
    
	/**
	 *constructors
	 */
	public Piano() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.springinaction.springidol.Instrument#play()
	 */
	public void play() {
		System.out.println("PLINK PLINK PLINK");

	}

}
