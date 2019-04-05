/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  MainTest.java   
 * @Package cn.onlon.design.strategy_pattern   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月5日 上午11:06:03   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.strategy.pattern;

import cn.onlon.design.strategy.pattern.context.Context;
import cn.onlon.design.strategy.pattern.strategy.Istrategy;
import cn.onlon.design.strategy.pattern.strategy.WeiDianDaYuanStrategy;
import cn.onlon.design.strategy.pattern.strategy.WeiWeiJouZhaoStrategy;

/**   
 * @ClassName:  MainTest   
 * @Description:TODO(场景类)   
 * @author: 郭清存 
 * @date:   2019年4月5日 上午11:06:03   
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
		//救赵国，打魏国，让魏国军队从赵国退军
		Istrategy strategy = new WeiWeiJouZhaoStrategy();
		
		Context context = new Context(strategy);
		context.oprate();
		
		//找准核心点，威胁核心点的存在，在半路截杀援军
		strategy = new WeiDianDaYuanStrategy();
		context = new Context(strategy);
		context.oprate();

	}

}
