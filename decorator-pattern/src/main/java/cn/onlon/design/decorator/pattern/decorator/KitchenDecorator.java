/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  KitchenDecorator.java   
 * @Package cn.onlon.design.decorator.pattern.decorator   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月4日 下午11:41:36   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.decorator.pattern.decorator;

import cn.onlon.design.decorator.pattern.model.AbstractHouse;

/**   
 * @ClassName:  KitchenDecorator   
 * @Description:TODO(厨房装修)   
 * @author: 郭清存 
 * @date:   2019年4月4日 下午11:41:36   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public class KitchenDecorator extends AbstractDecoratorHouse {

	public KitchenDecorator(AbstractHouse house) {
		super(house);
		// TODO Auto-generated constructor stub
	}
	
	private void doSometing() {
		System.out.println("厨房装修好了");
	}
	
	@Override
	public void operate() {
		super.operate();
		doSometing();
	}

}
