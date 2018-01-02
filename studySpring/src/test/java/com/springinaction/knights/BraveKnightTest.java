/**
 * 
 */
package com.springinaction.knights;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Mockito.*;

import com.springinaction.quests.Quest;
import com.study.tool.QuestException;
/**
 * @author Administrator
 *
 */
public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQuest() throws QuestException{
    	Quest mockQuest=Mockito.mock(Quest.class);
    	BraveKnight knight=new BraveKnight(mockQuest);
    	knight.embarkOnQuest();
    	Mockito.verify(mockQuest).embark();
    }
}
