/**
 * 
 */
package com.springinaction.quests;

import org.springframework.stereotype.Component;

/**
 * @author Administrator
 *
 */
@Component("quest")
public class SlayDragonQuest implements Quest {
	public void embark() {
		System.out.println("xiaomie Dragon");

	}

}
