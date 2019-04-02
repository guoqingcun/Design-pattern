/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  GooglePhone.java   
 * @Package cn.onlon.design.template.pattern   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月2日 下午1:18:38   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.template.pattern;

/**   
 * @ClassName:  GooglePhone   
 * @Description:TODO(谷歌电话)   
 * @author: 郭清存 
 * @date:   2019年4月2日 下午1:18:38   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public class GooglePhone extends Phone {

	/**   
	 * <p>Title: dial</p>   
	 * <p>Description: </p>      
	 * @see cn.onlon.design.template.pattern.Phone#dial()   
	 */

	@Override
	public void dial() {
		System.out.println("谷歌电话拨号");

	}

	/**   
	 * <p>Title: connecting</p>   
	 * <p>Description: </p>      
	 * @see cn.onlon.design.template.pattern.Phone#connecting()   
	 */

	@Override
	public void connecting() {
		System.out.println("谷歌电话建立连接");
	}

	/**   
	 * <p>Title: talk</p>   
	 * <p>Description: </p>      
	 * @see cn.onlon.design.template.pattern.Phone#talk()   
	 */

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("谷歌电话通话");
	}

	/**   
	 * <p>Title: hangup</p>   
	 * <p>Description: </p>      
	 * @see cn.onlon.design.template.pattern.Phone#hangup()   
	 */

	@Override
	public void hangup() {
		// TODO Auto-generated method stub
		System.out.println("谷歌电话挂断");
	}

}
