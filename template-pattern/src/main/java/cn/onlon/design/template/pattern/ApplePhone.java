/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  ApplePhone.java   
 * @Package cn.onlon.design.template.pattern   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月2日 下午1:20:57   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.template.pattern;

/**   
 * @ClassName:  ApplePhone   
 * @Description:TODO(苹果电话)   
 * @author: 郭清存 
 * @date:   2019年4月2日 下午1:20:57   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public class ApplePhone extends Phone {

	/**   
	 * <p>Title: dial</p>   
	 * <p>Description: </p>      
	 * @see cn.onlon.design.template.pattern.Phone#dial()   
	 */

	@Override
	public void dial() {
		System.out.println("苹果电话拨号");

	}

	/**   
	 * <p>Title: connecting</p>   
	 * <p>Description: </p>      
	 * @see cn.onlon.design.template.pattern.Phone#connecting()   
	 */

	@Override
	public void connecting() {
		System.out.println("苹果电话建立连接");

	}

	/**   
	 * <p>Title: talk</p>   
	 * <p>Description: </p>      
	 * @see cn.onlon.design.template.pattern.Phone#talk()   
	 */

	@Override
	public void talk() {
		System.out.println("苹果电话通话");

	}

	/**   
	 * <p>Title: hangup</p>   
	 * <p>Description: </p>      
	 * @see cn.onlon.design.template.pattern.Phone#hangup()   
	 */

	@Override
	public void hangup() {
		System.out.println("苹果电话挂断");

	}

}
