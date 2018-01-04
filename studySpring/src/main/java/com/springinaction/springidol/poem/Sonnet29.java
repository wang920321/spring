/**
 * 
 */
package com.springinaction.springidol.poem;

/**
 * @author Administrator
 *
 */
public class Sonnet29 implements Poem {
     private static String[] LINES={"12","05","06","19","09","24","03"};
     /**
 	 *constructors
 	 */
 	public Sonnet29() {
 		super();
 		// TODO Auto-generated constructor stub
 	}
	/* (non-Javadoc)
	 * @see com.springinaction.springidol.Poem#recite()
	 */
	public void recite() {
		for(int i=0;i<LINES.length;i++){
			System.out.println(LINES[i]);
		}

	}

	

}
