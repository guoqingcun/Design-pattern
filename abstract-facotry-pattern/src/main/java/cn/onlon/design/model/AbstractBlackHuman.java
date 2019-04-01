/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  AbstractBlackHuman.java   
 * @Package cn.onlon.design.model   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月1日 下午10:06:57   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.model;

/**   
 * @ClassName:  AbstractBlackHuman   
 * @Description:TODO(黑种人)   
 * @author: 郭清存 
 * @date:   2019年4月1日 下午10:06:57   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public abstract class AbstractBlackHuman extends AbstractHuman {

	/**   
	 * <p>Title: color</p>   
	 * <p>Description: </p>      
	 * @see cn.onlon.design.model.AbstractHuman#color()   
	 */

	@Override
	public void color() {
		System.out.println("我是黑种人");

	}

	/**   
	 * <p>Title: talk</p>   
	 * <p>Description: </p>      
	 * @see cn.onlon.design.model.AbstractHuman#talk()   
	 */

	@Override
	public void talk() {
		System.out.println("我说非洲语言");

	}

	/**   
	 * <p>Title: setx</p>   
	 * <p>Description: </p>      
	 * @see cn.onlon.design.model.AbstractHuman#setx()   
	 */

	@Override
	public void setx() {
		// TODO Auto-generated method stub

	}

}
