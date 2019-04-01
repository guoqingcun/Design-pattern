/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  MaleFactory.java   
 * @Package cn.onlon.design.facory   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月1日 下午10:45:51   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.facory;

import cn.onlon.design.model.AbstractBlackHuman;
import cn.onlon.design.model.AbstractWhiteHuman;
import cn.onlon.design.model.AbstractYellowHuman;
import cn.onlon.design.model.MaleBlackHuman;
import cn.onlon.design.model.MaleWhiteHuman;
import cn.onlon.design.model.MaleYellowHuman;

/**   
 * @ClassName:  MaleFactory   
 * @Description:TODO(男性工厂)   
 * @author: 郭清存 
 * @date:   2019年4月1日 下午10:45:51   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public class MaleFactory extends AbstractHumanFactory {

	/**   
	 * <p>Title: createYellowHuman</p>   
	 * <p>Description: </p>   
	 * @return   
	 * @see cn.onlon.design.facory.AbstractHumanFactory#createYellowHuman()   
	 */

	@Override
	public AbstractYellowHuman createYellowHuman() {
		// TODO Auto-generated method stub
		return new MaleYellowHuman();
	}

	/**   
	 * <p>Title: createBlackHuman</p>   
	 * <p>Description: </p>   
	 * @return   
	 * @see cn.onlon.design.facory.AbstractHumanFactory#createBlackHuman()   
	 */

	@Override
	public AbstractBlackHuman createBlackHuman() {
		// TODO Auto-generated method stub
		return new MaleBlackHuman();
	}

	/**   
	 * <p>Title: createWhiteHuman</p>   
	 * <p>Description: </p>   
	 * @return   
	 * @see cn.onlon.design.facory.AbstractHumanFactory#createWhiteHuman()   
	 */

	@Override
	public AbstractWhiteHuman createWhiteHuman() {
		// TODO Auto-generated method stub
		return new MaleWhiteHuman();
	}

}
