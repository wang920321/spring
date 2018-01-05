/**
 * 
 */
package com.springinaction.springidol.performer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.springinaction.springidol.instrument.Instrument;
import com.study.tool.PerformanceException;

/**
 * @author Administrator
 *
 */
@Component("kenny")
public class Instrumentalist implements Performer {
	@Value("higher")
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
	//@Resource(name="piano")与
	
	//@Inject               @Autowired
	//@Named("piano") 和           @Qualifier("piano")
	
	//能达到同样效果
	 @Autowired
	 @Qualifier("guitar")
	 private Instrument instrument;
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
