/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  BuyProxy.java   
 * @Package cn.onlon.design.proxy.pattern.dynnamicproxy   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月3日 上午10:57:58   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.proxy.pattern.dynnamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**   
 * @ClassName:  BuyProxy   
 * @Description:TODO(动态代购)   
 * @author: 郭清存 
 * @date:   2019年4月3日 上午10:57:58   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public class BuyHandler implements InvocationHandler{

	Object obj;
	
	public BuyHandler(Object obj) {
		this.obj = obj;
	}
	
	private void before() {
		System.out.println("我在买去日本机票");
		System.out.println("我已经到了日本");
		
	}
	
	private void after() {
		System.out.println("我已经回国");
	}
	/**   
	 * <p>Title: invoke</p>   
	 * <p>Description: </p>   
	 * @param proxy
	 * @param method
	 * @param args
	 * @return
	 * @throws Throwable   
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])   
	 */

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		before();
		Object obj = method.invoke(this.obj, args);
		after();
		return obj;
	}

}
