/**
 * 
 */
package com.springinaction.springidol;

import java.util.Collection;

import com.study.tool.PerformanceException;

/**
 * @author Administrator
 *
 */
public class OneManBand implements Performer {
    private Collection<Instrument> instruments;
	/**
	 * @param instruments the instruments to set
	 */
	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}

	/**
	 *constructors
	 */
	public OneManBand() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.springinaction.springidol.Performer#perform()
	 * @throws PerformanceException
	 */
	public void perform() throws PerformanceException {
		for (Instrument instrument : instruments) {
			instrument.play();
		}

	}

}
