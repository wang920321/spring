/**
 * 
 */
package com.springinaction.springidol;

/**
 * @author Administrator
 *单例
 */
public class Stage {

	/**
	 *constructors
	 */
	private Stage() {
	}
  /**
 * @author Administrator
 *延迟加载实例
 */
private static class StageSingletonHolder{
	  static Stage instance=new Stage();
  }
  /**
 * @Title: Stage.java 
 * @Package com.springinaction.springidol 
 * @Description: 返回实例
 * @author kpwang   
 * @date 2018年1月3日 下午5:02:23
 * @return
 */
public static Stage getInstance(){
	  return StageSingletonHolder.instance;
  }
}
