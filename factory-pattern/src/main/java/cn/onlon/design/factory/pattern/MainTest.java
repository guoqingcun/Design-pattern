/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  MainTest.java   
 * @Package cn.onlon.design.factory.pattern   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月1日 上午11:35:20   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.factory.pattern;

import cn.onlon.design.factory.pattern.factory.AbstractProductFactory;
import cn.onlon.design.factory.pattern.factory.ProductFactory;
import cn.onlon.design.factory.pattern.prodcut.AbstractProduct;
import cn.onlon.design.factory.pattern.prodcut.BlackProduct;
import cn.onlon.design.factory.pattern.prodcut.RedProduct;

/**   
 * @ClassName:  MainTest   
 * @Description:TODO(场景类)   
 * @author: 郭清存 
 * @date:   2019年4月1日 上午11:35:20   
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
		AbstractProductFactory apFactory= new ProductFactory();
		AbstractProduct red = apFactory.createProduct(RedProduct.class);
		red.getColor();
		
		AbstractProduct black = apFactory.createProduct(BlackProduct.class);
		black.getColor();

	}

}
