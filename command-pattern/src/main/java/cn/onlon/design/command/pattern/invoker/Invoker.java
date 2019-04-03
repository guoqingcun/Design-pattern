/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  Invoker.java   
 * @Package cn.onlon.design.command.pattern.invoker   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月4日 上午12:02:33   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.command.pattern.invoker;

import cn.onlon.design.command.pattern.command.Command;

/**   
 * @ClassName:  Invoker   
 * @Description:TODO(执行人)   
 * @author: 郭清存 
 * @date:   2019年4月4日 上午12:02:33   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public class Invoker {
	Command command;

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void action() {
		this.command.execute();
	}

}
