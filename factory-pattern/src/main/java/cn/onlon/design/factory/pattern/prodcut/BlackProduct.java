/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  BlockProduct.java   
 * @Package cn.onlon.design.factory.pattern   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月1日 上午11:27:53   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.factory.pattern.prodcut;

/**   
 * @ClassName:  BlackProduct   
 * @Description:TODO(黑色产品)   
 * @author: 郭清存 
 * @date:   2019年4月1日 上午11:27:53   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public class BlackProduct extends AbstractProduct {

	/**   
	 * <p>Title: getColor</p>   
	 * <p>Description: </p>      
	 * @see cn.onlon.design.factory.pattern.prodcut.AbstractProduct#getColor()   
	 */

	@Override
	public void getColor() {
		System.out.println("我是黑色产品");

	}

}
