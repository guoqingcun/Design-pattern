/**   
* @Title: MainTest.java 
* @Package cn.onlon.design.observer.pattern 
* @Description: TODO(用一句话描述该文件做什么) 
* @author guoqingcun   
* @date 2019年4月7日 上午9:23:26 
* @version V1.0   
*/
package cn.onlon.design.observer.pattern;

import cn.onlon.design.observer.pattern.observable.Weather;
import cn.onlon.design.observer.pattern.observer.Citizen;

/** 
* @ClassName: MainTest 
* @Description: TODO(场景类) 
* @author guoqingcun
* @date 2019年4月7日 上午9:23:26 
*  
*/
public class MainTest {

	/**
	 * 
	* @Title: main 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param args    设定文件 
	* @return void    返回类型 
	* @throws
	 */
	public static void main(String[] args) {
		Citizen citizen = new Citizen();
		Weather weather = new Weather();
		weather.addObserver(citizen);
		
		weather.temperature();
		
	}
}
