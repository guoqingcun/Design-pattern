package cn.onlon.design.chain.pattern;

import cn.onlon.design.chain.pattern.handler.LoginHandler;
import cn.onlon.design.chain.pattern.handler.OrderHandler;
import cn.onlon.design.chain.pattern.model.Request;
import cn.onlon.design.chain.pattern.model.Response;

/**
 * 
 * @ClassName:  MainTest   
 * @Description:TODO(场景类)   
 * @author: 郭清存 
 * @date:   2019年4月4日 下午1:26:37   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目
 */
public class MainTest {
	/**
	 * 
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param args      
	 * @return: void      
	 * @throws
	 */
	public static void main(String[] args) {
		LoginHandler lh = new LoginHandler();
		OrderHandler oh = new OrderHandler();
		lh.setNextHandler(oh);
		
		Request r = new Request();
		r.setUserId(1);
		
		Response response = lh.handlerMsg(r);
		System.out.println(response.getMsg());
		
	}
}
