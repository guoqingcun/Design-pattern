/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  UsaPower.java   
 * @Package cn.onlon.design.adapter.pattern.model   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月5日 下午1:23:58   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.adapter.pattern.model;

/**   
 * @ClassName:  UsaPower   
 * @Description:TODO(美国电源)   
 * @author: 郭清存 
 * @date:   2019年4月5日 下午1:23:58   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public class UsaPower implements IPower {

	/**   
	 * <p>Title: charge</p>   
	 * <p>Description: </p>      
	 * @see cn.onlon.design.adapter.pattern.model.IPower#charge()   
	 */

	public void charge() {
		System.out.println("正在使用美国电源");

	}

}
