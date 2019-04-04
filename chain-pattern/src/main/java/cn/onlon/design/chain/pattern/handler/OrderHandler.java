/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  OrderHandler.java   
 * @Package cn.onlon.design.chain.pattern.handler   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月4日 下午1:22:51   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.chain.pattern.handler;

import java.util.Random;

import cn.onlon.design.chain.pattern.model.Request;
import cn.onlon.design.chain.pattern.model.Response;

/**   
 * @ClassName:  OrderHandler   
 * @Description:TODO(下单handler)   
 * @author: 郭清存 
 * @date:   2019年4月4日 下午1:22:51   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public class OrderHandler extends AbstractHandler {

	/**   
	 * <p>Title: handlerMsg</p>   
	 * <p>Description: </p>   
	 * @param request
	 * @return   
	 * @see cn.onlon.design.chain.pattern.handler.AbstractHandler#handlerMsg(cn.onlon.design.chain.pattern.model.Request)   
	 */

	@Override
	public Response handlerMsg(Request request) {
		
		return execute(request);
	}

	/**   
	 * <p>Title: execute</p>   
	 * <p>Description: </p>   
	 * @param request
	 * @return   
	 * @see cn.onlon.design.chain.pattern.handler.AbstractHandler#execute(cn.onlon.design.chain.pattern.model.Request)   
	 */

	@Override
	public Response execute(Request request) {
		// TODO Auto-generated method stub
		return new Response("用户下单成功，订单号：" + new Random().nextInt(100000000));
	}

}
