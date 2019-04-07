/**   
* @Title: Citizen.java 
* @Package cn.onlon.design.observer.pattern.observer 
* @Description: TODO(用一句话描述该文件做什么) 
* @author guoqingcun   
* @date 2019年4月7日 上午9:22:32 
* @version V1.0   
*/
package cn.onlon.design.observer.pattern.observer;

import java.util.Observable;
import java.util.Observer;

/** 
* @ClassName: Citizen 
* @Description: TODO(市民) 
* @author guoqingcun
* @date 2019年4月7日 上午9:22:32 
*  
*/
public class Citizen implements Observer {

	/* (非 Javadoc) 
	* <p>Title: update</p> 
	* <p>Description: </p> 
	* @param o
	* @param arg 
	* @see java.util.Observer#update(java.util.Observable, java.lang.Object) 
	*/
	public void update(Observable o, Object obj) {
		System.out.println(obj);

	}

}
