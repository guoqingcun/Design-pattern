/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  House.java   
 * @Package cn.onlon.design.decorator.pattern.model   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月4日 下午11:33:35   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.decorator.pattern.model;

/**   
 * @ClassName:  House   
 * @Description:TODO(房子)   
 * @author: 郭清存 
 * @date:   2019年4月4日 下午11:33:35   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public class House extends AbstractHouse {

	/**   
	 * <p>Title: operate</p>   
	 * <p>Description: </p>      
	 * @see cn.onlon.design.decorator.pattern.model.AbstractHouse#operate()   
	 */

	@Override
	public void operate() {
		System.out.println("正在装修房子");

	}

}
