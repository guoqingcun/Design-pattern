/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  ProductFactory.java   
 * @Package cn.onlon.design.factory.pattern   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月1日 上午11:32:25   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.factory.pattern.factory;

import cn.onlon.design.factory.pattern.prodcut.AbstractProduct;

/**   
 * @ClassName:  ProductFactory   
 * @Description:TODO(产品工厂)   
 * @author: 郭清存 
 * @date:   2019年4月1日 上午11:32:25   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public class ProductFactory extends AbstractProductFactory {

	/**   
	 * <p>Title: createProduct</p>   
	 * <p>Description: </p>   
	 * @param c
	 * @return   
	 * @see cn.onlon.design.factory.pattern.factory.AbstractProductFactory#createProduct(java.lang.Class)   
	 */

	@Override
	public <T extends AbstractProduct> T createProduct(Class<T> c) {
		T t = null;
		try {
			t = (T)Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return t;
	}

}
