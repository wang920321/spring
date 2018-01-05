/**
 * 
 */
package com.springinaction.springidol.instrument;

import org.springframework.stereotype.Component;

/**
 * @author Administrator
 *
 */
@Component
public class Guitar implements Instrument {

	/* (non-Javadoc)
	 * @see com.springinaction.springidol.instrument.Instrument#play()
	 */
	public void play() {
		System.out.println("Strum strum strum");

	}

}
