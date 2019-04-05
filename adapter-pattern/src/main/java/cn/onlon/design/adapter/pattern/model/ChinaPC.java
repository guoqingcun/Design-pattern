/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  ChianPC.java   
 * @Package cn.onlon.design.adapter.pattern.model   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月5日 下午1:27:31   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.adapter.pattern.model;

/**   
 * @ClassName:  ChianPC   
 * @Description:TODO(中国电脑)   
 * @author: 郭清存 
 * @date:   2019年4月5日 下午1:27:31   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public class ChinaPC extends PC {

	/**   
	 * <p>Title: charge</p>   
	 * <p>Description: </p>      
	 * @see cn.onlon.design.adapter.pattern.model.PC#charge()   
	 */

	@Override
	public void charge() {
		System.out.print("中国电脑");

	}

}
