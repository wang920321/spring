/**
 * 
 */
package com.kenny.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.springidol.performer.Performer;
import com.study.tool.PerformanceException;

/**
 * @author Administrator
 *
 */
public class KennyMain {

	/**
	 * @Title: KennyMain.java 
	 * @Package com.kenny.main 
	 * @Description: TODO(用一句话描述该文件做什么) 
	 * @author kpwang   
	 * @date 2018年1月4日 下午1:07:53
	 * @param args
	 * @throws PerformanceException 
	 */
	public static void main(String[] args) throws PerformanceException {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring/spring-idol.xml");
		//Performer performer=(Performer) context.getBean("kenny");用到多态，Performer performer=new Instrumentalist();
		Performer performer=(Performer) context.getBean("kenny");
		performer.perform();

	}

}
