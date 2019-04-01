/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  AbstractProductFactory.java   
 * @Package cn.onlon.design.factory.pattern   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月1日 上午11:23:55   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.factory.pattern.factory;

import cn.onlon.design.factory.pattern.prodcut.AbstractProduct;

/**   
 * @ClassName:  AbstractProductFactory   
 * @Description:TODO(产品的抽象生成工厂)   
 * @author: 郭清存 
 * @date:   2019年4月1日 上午11:23:55   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public abstract class AbstractProductFactory {
	
	/**
	 * 
	 * @Title: createProduct   
	 * @Description: TODO(input parameter should String,Enum,Class)   
	 * @param: @param c
	 * @param: @return      
	 * @return: T      
	 * @throws
	 */
	public abstract <T extends AbstractProduct> T createProduct(Class<T> c) ; 

}
