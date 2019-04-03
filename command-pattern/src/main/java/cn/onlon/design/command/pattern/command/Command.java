/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  Command.java   
 * @Package cn.onlon.design.command.pattern   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月3日 下午11:51:11   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.command.pattern.command;

import cn.onlon.design.command.pattern.receiver.AbstractReceiver;

/**   
 * @ClassName:  Command   
 * @Description:TODO(抽象命令)   
 * @author: 郭清存 
 * @date:   2019年4月3日 下午11:51:11   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public abstract class Command {

//	public AbstractReceiver receiver;
	
	public abstract void execute();
}
