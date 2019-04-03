/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  BuyProxy.java   
 * @Package cn.onlon.design.proxy.pattern.staticproxy   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月3日 上午10:52:59   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.proxy.pattern.staticproxy;

/**   
 * @ClassName:  BuyProxy   
 * @Description:TODO(代购)   
 * @author: 郭清存 
 * @date:   2019年4月3日 上午10:52:59   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public class BuyProxy implements IBuyer {
	IBuyer buyer;
	public BuyProxy(IBuyer buyer) {
		this.buyer = buyer;
	}

	/**   
	 * <p>Title: buy</p>   
	 * <p>Description: </p>      
	 * @see cn.onlon.design.proxy.pattern.staticproxy.IBuyer#buy()   
	 */

	public void buy() {
		this.buyer.buy();

	}

}
