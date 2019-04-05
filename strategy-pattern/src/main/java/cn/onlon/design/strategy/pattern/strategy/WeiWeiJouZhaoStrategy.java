/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  WeiWeiJouZhaoStrategy.java   
 * @Package cn.onlon.design.strategy.pattern.strategy   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月5日 上午11:10:31   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.strategy.pattern.strategy;

/**   
 * @ClassName:  WeiWeiJouZhaoStrategy   
 * @Description:TODO(围魏救赵策略)   
 * @author: 郭清存 
 * @date:   2019年4月5日 上午11:10:31   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public class WeiWeiJouZhaoStrategy implements Istrategy {

	/**   
	 * <p>Title: fight</p>   
	 * <p>Description: </p>      
	 * @see cn.onlon.design.strategy.pattern.strategy.Istrategy#fight()   
	 */

	public void fight() {
		System.out.println("我们正在实行围魏救赵战略");

	}

}
