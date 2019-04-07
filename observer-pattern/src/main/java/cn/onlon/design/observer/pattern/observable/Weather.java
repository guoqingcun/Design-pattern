/**   
* @Title: Weather.java 
* @Package cn.onlon.design.observer.pattern.observable 
* @Description: TODO(用一句话描述该文件做什么) 
* @author guoqingcun   
* @date 2019年4月7日 上午9:17:29 
* @version V1.0   
*/
package cn.onlon.design.observer.pattern.observable;

import java.util.Observable;

/** 
* @ClassName: Weather 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author guoqingcun
* @date 2019年4月7日 上午9:17:29 
*  
*/
public class Weather extends Observable implements IWeather {

	/* (非 Javadoc) 
	* <p>Title: temperature</p> 
	* <p>Description: </p>  
	* @see cn.onlon.design.observer.pattern.observable.IWeather#temperature() 
	*/
	public void temperature() {
		System.out.println("今天的温度是21度");
		super.setChanged();
		super.notifyObservers("21度");

	}

}
