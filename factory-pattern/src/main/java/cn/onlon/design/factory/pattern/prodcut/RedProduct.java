/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  ProductOne.java   
 * @Package cn.onlon.design.factory.pattern   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月1日 上午11:26:04   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.factory.pattern.prodcut;

/**   
 * @ClassName:  RedProduct   
 * @Description:TODO(红色产品)   
 * @author: 郭清存 
 * @date:   2019年4月1日 上午11:26:04   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public class RedProduct extends AbstractProduct {

	/**   
	 * <p>Title: getColor</p>   
	 * <p>Description: </p>      
	 * @see cn.onlon.design.factory.pattern.prodcut.AbstractProduct#getColor()   
	 */

	@Override
	public void getColor() {
		System.out.println("我是红色产品");

	}

}
