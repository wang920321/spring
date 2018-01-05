/**
 * 
 */
package com.knight.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.knights.Knight;
import com.study.tool.QuestException;

/**
 * @author Administrator
 *
 */
public class KnightMain {

	/**
	 * @Title: KnightMain.java 
	 * @Package com.knight.main 
	 * @Description: TODO(用一句话描述该文件做什么) 
	 * @author kpwang   
	 * @date 2018年1月2日 下午3:48:44
	 * @param args
	 * @throws QuestException 
	 */
	public static void main(String[] args) throws QuestException {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring/spring-idol2.xml");
		Knight knight=(Knight) context.getBean("braveKnight");
		knight.embarkOnQuest();

	}

}
