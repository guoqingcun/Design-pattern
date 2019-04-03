/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  IntegralReceiver.java   
 * @Package cn.onlon.design.command.pattern.receiver   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月4日 上午12:13:04   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.command.pattern.receiver;

/**   
 * @ClassName:  IntegralReceiver   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: 郭清存 
 * @date:   2019年4月4日 上午12:13:04   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public class IntegralReceiver extends AbstractReceiver {

	/**   
	 * <p>Title: doSomething</p>   
	 * <p>Description: </p>      
	 * @see cn.onlon.design.command.pattern.receiver.AbstractReceiver#doSomething()   
	 */

	@Override
	public void doSomething() {
		System.out.println("系统给用户添加了10个积分");

	}

}
