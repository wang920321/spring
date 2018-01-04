/**
 * 
 */
package com.springinaction.springidol.performer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.springinaction.springidol.instrument.Instrument;
import com.study.tool.PerformanceException;

/**
 * @author Administrator
 *
 */
public class Instrumentalist implements Performer {
    private String song;
   
    
	/**
	 * @return the song
	 */
	public String getSong() {
		return song;
	}

	/**
	 * @param song the song to set
	 */
	public void setSong(String song) {
		this.song = song;
	}
	 private Instrument instrument;
	 @Autowired
	 @Qualifier("piano")
	 public void setInstrument(Instrument instrument){
		 this.instrument=instrument;
	 }

	/**
	 *constructors
	 */
	public Instrumentalist() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.springinaction.springidol.Performer#perform()
	 * @throws PerformanceException
	 */
	public void perform() throws PerformanceException {
	    System.out.println("playing " +song +" : ");
	    instrument.play();

	}
	

}
