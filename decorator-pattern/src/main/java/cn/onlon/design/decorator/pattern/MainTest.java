/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  MainTest.java   
 * @Package cn.onlon.design.decorator.pattern   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月4日 下午11:43:47   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.decorator.pattern;

import cn.onlon.design.decorator.pattern.decorator.KitchenDecorator;
import cn.onlon.design.decorator.pattern.decorator.LivingRoomDecorator;
import cn.onlon.design.decorator.pattern.model.AbstractHouse;
import cn.onlon.design.decorator.pattern.model.House;

/**   
 * @ClassName:  MainTest   
 * @Description:TODO(场景类)   
 * @author: 郭清存 
 * @date:   2019年4月4日 下午11:43:47   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public class MainTest {

	/**   
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) {
		AbstractHouse house = new House();
		house = new LivingRoomDecorator(house);
		house = new KitchenDecorator(house);
		house.operate();

	}

}
