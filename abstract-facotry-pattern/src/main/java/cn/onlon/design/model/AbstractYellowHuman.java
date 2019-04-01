/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  AbstractYellowHuman.java   
 * @Package cn.onlon.design.model   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月1日 下午10:08:38   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.model;

/**   
 * @ClassName:  AbstractYellowHuman   
 * @Description:TODO(黄种人)   
 * @author: 郭清存 
 * @date:   2019年4月1日 下午10:08:38   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public abstract class AbstractYellowHuman extends AbstractHuman {

	/**   
	 * <p>Title: color</p>   
	 * <p>Description: </p>      
	 * @see cn.onlon.design.model.AbstractHuman#color()   
	 */

	@Override
	public void color() {
		System.out.println("我是黄种人");

	}

	/**   
	 * <p>Title: talk</p>   
	 * <p>Description: </p>      
	 * @see cn.onlon.design.model.AbstractHuman#talk()   
	 */

	@Override
	public void talk() {
		System.out.println("我说亚洲语言");

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
