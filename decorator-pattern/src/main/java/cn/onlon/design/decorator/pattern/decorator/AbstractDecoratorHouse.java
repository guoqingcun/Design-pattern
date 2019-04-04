/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  AbstractDecoratorHouse.java   
 * @Package cn.onlon.design.decorator.pattern.decorator   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月4日 下午11:34:43   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.decorator.pattern.decorator;

import cn.onlon.design.decorator.pattern.model.AbstractHouse;

/**   
 * @ClassName:  AbstractDecoratorHouse   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: 郭清存 
 * @date:   2019年4月4日 下午11:34:43   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public abstract class AbstractDecoratorHouse extends AbstractHouse {

	private AbstractHouse house;
	
	public AbstractDecoratorHouse(AbstractHouse house) {
		this.house = house;
	}
	/**   
	 * <p>Title: operate</p>   
	 * <p>Description: </p>      
	 * @see cn.onlon.design.decorator.pattern.model.AbstractHouse#operate()   
	 */

	@Override
	public void operate() {
		house.operate();

	}

}
