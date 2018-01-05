/**
 * 
 */
package com.springinaction.knights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.springinaction.quests.Quest;
import com.study.tool.QuestException;

/**
 * @author Administrator
 * 使用@Component注解必须要有一个无参构造函数
 */
@Component
public class BraveKnight implements Knight{
	
	/**
	 *constructors
	 */
	public BraveKnight() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Autowired
	@Qualifier("quest")
    private Quest quest;
  
    public BraveKnight(Quest quest){
    	this.quest=quest;
    }
    public void embarkOnQuest() throws QuestException{
    	
    	quest.embark();
    	
    }
}
