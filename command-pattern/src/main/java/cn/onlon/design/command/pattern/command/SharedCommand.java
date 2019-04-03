/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  SharedCommand.java   
 * @Package cn.onlon.design.command.pattern.command   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月4日 上午12:08:20   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.command.pattern.command;

import cn.onlon.design.command.pattern.receiver.AbstractReceiver;
import cn.onlon.design.command.pattern.receiver.IntegralReceiver;
import cn.onlon.design.command.pattern.receiver.SharedReceiver;

/**   
 * @ClassName:  SharedCommand   
 * @Description:TODO(分享命令)   
 * @author: 郭清存 
 * @date:   2019年4月4日 上午12:08:20   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public class SharedCommand extends Command {
	SharedReceiver sharedReceiver = new SharedReceiver();
	IntegralReceiver integralReceiver = new IntegralReceiver();
	
	/**   
	 * <p>Title: execute</p>   
	 * <p>Description: </p>      
	 * @see cn.onlon.design.command.pattern.command.Command#execute()   
	 */

	@Override
	public void execute() {
		sharedReceiver.doSomething();
		integralReceiver.doSomething();

	}

}
