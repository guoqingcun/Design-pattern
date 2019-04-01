/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  FemaleFactory.java   
 * @Package cn.onlon.design.facory   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月1日 下午10:44:02   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.facory;

import cn.onlon.design.model.AbstractBlackHuman;
import cn.onlon.design.model.AbstractWhiteHuman;
import cn.onlon.design.model.AbstractYellowHuman;
import cn.onlon.design.model.FemaleBlackHuman;
import cn.onlon.design.model.FemaleWhiteHuman;
import cn.onlon.design.model.FemaleYellowHuman;

/**   
 * @ClassName:  FemaleFactory   
 * @Description:TODO(女性工厂)   
 * @author: 郭清存 
 * @date:   2019年4月1日 下午10:44:02   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public class FemaleFactory extends AbstractHumanFactory {

	/**   
	 * <p>Title: createYellowHuman</p>   
	 * <p>Description: </p>   
	 * @return   
	 * @see cn.onlon.design.facory.AbstractHumanFactory#createYellowHuman()   
	 */

	@Override
	public AbstractYellowHuman createYellowHuman() {
		// TODO Auto-generated method stub
		return new FemaleYellowHuman();
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
		return new FemaleBlackHuman();
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
		return new FemaleWhiteHuman();
	}

}
