/**
 * 
 */
package com.springidol.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.knights.Knight;
import com.springinaction.springidol.performer.Juggler;
import com.springinaction.springidol.performer.Performer;
import com.study.tool.PerformanceException;

/**
 * @author Administrator
 *
 */
public class SpringidolMain {

	/**
	 * @Title: SpringidolMain.java 
	 * @Package com.springidol.main 
	 * @Description: TODO(用一句话描述该文件做什么) 
	 * @author kpwang   
	 * @date 2018年1月3日 下午3:49:26
	 * @param args
	 * @throws PerformanceException 
	 */
	public static void main(String[] args) throws PerformanceException {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring/spring-idol.xml");
		Performer performer=(Performer) context.getBean("poeticDuke");
		performer.perform();

	}

}
