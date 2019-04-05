/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  MainTest.java   
 * @Package cn.onlon.design.adapter.pattern   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月5日 下午1:36:44   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.adapter.pattern;

import cn.onlon.design.adapter.pattern.adapter.UsaPCAdapter;
import cn.onlon.design.adapter.pattern.model.PC;
import cn.onlon.design.adapter.pattern.model.UsaPower;

/**   
 * @ClassName:  MainTest   
 * @Description:TODO(场景类)   
 * @author: 郭清存 
 * @date:   2019年4月5日 下午1:36:44   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public class MainTest {

	/**   
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) {
		PC chinaPC = new UsaPCAdapter(new UsaPower());
		chinaPC.charge();

	}

}
