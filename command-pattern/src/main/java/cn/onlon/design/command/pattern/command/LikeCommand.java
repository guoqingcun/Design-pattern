/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  LikeCommand.java   
 * @Package cn.onlon.design.command.pattern   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月3日 下午11:53:22   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.command.pattern.command;

import cn.onlon.design.command.pattern.receiver.AbstractReceiver;
import cn.onlon.design.command.pattern.receiver.LikeReceiver;

/**   
 * @ClassName:  LikeCommand   
 * @Description:TODO(点赞)   
 * @author: 郭清存 
 * @date:   2019年4月3日 下午11:53:22   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public class LikeCommand extends Command {
	LikeReceiver receiver = new LikeReceiver();
	
	/**   
	 * <p>Title: execute</p>   
	 * <p>Description: </p>      
	 * @see cn.onlon.design.command.pattern.command.Command#execute()   
	 */

	@Override
	public void execute() {
		receiver.doSomething();

	}

}
