/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  UsaPCAdapter.java   
 * @Package cn.onlon.design.adapter.pattern.adapter   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月5日 下午1:30:27   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.adapter.pattern.adapter;

import cn.onlon.design.adapter.pattern.model.ChinaPC;
import cn.onlon.design.adapter.pattern.model.IPower;

/**   
 * @ClassName:  UsaPCAdapter   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: 郭清存 
 * @date:   2019年4月5日 下午1:30:27   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public class UsaPCAdapter extends ChinaPC implements IPower {

    private IPower power;
    
    public UsaPCAdapter(IPower power) {
		this.power = power;
	}
	/**   
	 * <p>Title: charge</p>   
	 * <p>Description: </p>      
	 * @see cn.onlon.design.adapter.pattern.model.PC#charge()   
	 */

	@Override
	public void charge() {
		super.charge();
		power.charge();

	}

}
