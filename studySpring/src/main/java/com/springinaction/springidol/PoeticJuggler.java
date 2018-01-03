/**
 * 
 */
package com.springinaction.springidol;

import com.study.tool.PerformanceException;

/**
 * @author Administrator
 *
 */
public class PoeticJuggler extends Juggler {
    private Poem poem;

	/**
	 *constructors
	 * @param poem
	 */
	public PoeticJuggler(Poem poem) {
		super();
		this.poem = poem;
	}

	/**
	 *constructors
	 */
	public PoeticJuggler() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 *constructors
	 * @param beanBags
	 */
	public PoeticJuggler(int beanBags,Poem poem) {
		super(beanBags);
		this.poem=poem;
	}

	/* (non-Javadoc)
	 * @see com.springinaction.springidol.Juggler#perform()
	 * @throws PerformanceException
	 */
	@Override
	public void perform() throws PerformanceException {
		
		super.perform();
		System.out.println("While reciging...");
		poem.recite();
	}
    
}
