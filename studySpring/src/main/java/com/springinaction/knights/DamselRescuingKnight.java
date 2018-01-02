/**
 * 
 */
package com.springinaction.knights;

import com.springinaction.quests.RescueDamselQuest;
import com.study.tool.QuestException;

/**
 * @author Administrator
 *
 */
public class DamselRescuingKnight implements Knight{
    private RescueDamselQuest quest;
    public DamselRescuingKnight(){
    	quest=new RescueDamselQuest();
    }
    public void embarkOnQuest() throws QuestException{
    	quest.embark();
    }
}
