/**
 * 
 */
package com.springinaction.knights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springinaction.minstrel.Minstrel;
import com.springinaction.quests.Quest;
import com.study.tool.QuestException;

/**
 * @author Administrator
 *
 */
public class BraveKnight implements Knight{
    private Quest quest;
  
    public BraveKnight(Quest quest){
    	this.quest=quest;
    }
    public void embarkOnQuest() throws QuestException{
    	
    	quest.embark();
    	
    }
}
