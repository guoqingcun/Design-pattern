/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  AbstractHandler.java   
 * @Package cn.onlon.design.chain.pattern.handler   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月4日 下午1:07:55   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.chain.pattern.handler;

import cn.onlon.design.chain.pattern.model.Request;
import cn.onlon.design.chain.pattern.model.Response;

/**   
 * @ClassName:  AbstractHandler   
 * @Description:TODO(抽象handler)   
 * @author: 郭清存 
 * @date:   2019年4月4日 下午1:07:55   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public abstract class AbstractHandler {
	
	public AbstractHandler nextHandler;

	public abstract Response handlerMsg(Request request) ;
	
	public  void setNextHandler(AbstractHandler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
	public abstract Response execute(Request request);
}
