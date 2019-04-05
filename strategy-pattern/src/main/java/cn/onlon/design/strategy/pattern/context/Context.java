/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  Context.java   
 * @Package cn.onlon.design.strategy.pattern.context   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月5日 上午11:12:14   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.strategy.pattern.context;

import cn.onlon.design.strategy.pattern.strategy.Istrategy;

/**   
 * @ClassName:  Context   
 * @Description:TODO(策略的上下文)   
 * @author: 郭清存 
 * @date:   2019年4月5日 上午11:12:14   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public class Context {

	Istrategy strategy;
	
	public Context(Istrategy strategy) {
		this.strategy = strategy;
	}
	
	public void oprate() {
		strategy.fight();
	}
}
