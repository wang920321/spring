/**
 * 
 */
package com.springinaction.springidol;

import com.study.tool.PerformanceException;

/**
 * @author Administrator
 *
 */
public class Juggler implements Performer {
    private int beanBags=3;
    
	/**
	 *constructors
	 */
	public Juggler() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 *constructors
	 * @param beanBags
	 */
	public Juggler(int beanBags) {
		super();
		this.beanBags = beanBags;
	}
	/* (non-Javadoc)
	 * @see com.springinaction.springidol.Performer#perform()
	 * @throws PerformanceException
	 */
	public void perform() throws PerformanceException {
		System.out.println("JUGGLING" + beanBags +"BEANBAGS");

	}

}
