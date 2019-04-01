/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  AbstractHumanFactory.java   
 * @Package cn.onlon.design.facory   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月1日 下午10:38:05   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.facory;

import cn.onlon.design.model.AbstractBlackHuman;
import cn.onlon.design.model.AbstractWhiteHuman;
import cn.onlon.design.model.AbstractYellowHuman;

/**   
 * @ClassName:  AbstractHumanFactory   
 * @Description:TODO(抽象的人类工厂)   
 * @author: 郭清存 
 * @date:   2019年4月1日 下午10:38:05   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public abstract class AbstractHumanFactory {

	/**
	 * 
	 * @Title: createYellowHuman   
	 * @Description: TODO(创建黑种人)   
	 * @param: @return      
	 * @return: AbstractYellowHuman      
	 * @throws
	 */
	public abstract AbstractYellowHuman createYellowHuman();
	
	/**
	 * 
	 * @Title: createBlackHuman   
	 * @Description: TODO(创建黑种人)   
	 * @param: @return      
	 * @return: AbstractBlackHuman      
	 * @throws
	 */
	public abstract AbstractBlackHuman createBlackHuman();
	/**
	 * 
	 * @Title: createWhiteHuman   
	 * @Description: TODO(创建白种人)   
	 * @param: @return      
	 * @return: AbstractWhiteHuman      
	 * @throws
	 */
	public abstract AbstractWhiteHuman createWhiteHuman();
}
