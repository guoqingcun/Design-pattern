/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  MainTest.java   
 * @Package cn.onlon.design   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月1日 下午10:47:26   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */
package cn.onlon.design;

import cn.onlon.design.facory.AbstractHumanFactory;
import cn.onlon.design.facory.FemaleFactory;
import cn.onlon.design.facory.MaleFactory;
import cn.onlon.design.model.AbstractBlackHuman;
import cn.onlon.design.model.AbstractWhiteHuman;
import cn.onlon.design.model.AbstractYellowHuman;
import cn.onlon.design.model.MaleBlackHuman;

/**
 * @ClassName: MainTest
 * @Description:TODO(场景类)
 * @author: 郭清存
 * @date: 2019年4月1日 下午10:47:26
 * 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved.
 *             注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目
 */
public class MainTest {

	/**
	 * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param: @param args @return:
	 * void @throws
	 */
	public static void main(String[] args) {
		//男性工厂
		AbstractHumanFactory maleFactory = new MaleFactory();
		//女性工厂
		AbstractHumanFactory femaleFactory = new FemaleFactory();

		// 男性黑种人
		AbstractBlackHuman maleBlackHuman = maleFactory.createBlackHuman();
		maleBlackHuman.color();
		maleBlackHuman.talk();
		maleBlackHuman.setx();

		// 男性白种人
		AbstractWhiteHuman maleWhiteHuman = maleFactory.createWhiteHuman();
		maleWhiteHuman.color();
		maleWhiteHuman.talk();
		maleWhiteHuman.setx();

		// 男性黑种人
		AbstractYellowHuman maleYellowHuman = maleFactory.createYellowHuman();
		maleYellowHuman.color();
		maleYellowHuman.talk();
		maleYellowHuman.setx();

		System.out.println("-----------------------分割线----------------------");

		// 女性黑种人
		AbstractBlackHuman femaleBlackHuman = femaleFactory.createBlackHuman();
		femaleBlackHuman.color();
		femaleBlackHuman.talk();
		femaleBlackHuman.setx();

		// 女性白种人
		AbstractWhiteHuman femaleWhiteHuman = femaleFactory.createWhiteHuman();
		femaleWhiteHuman.color();
		femaleWhiteHuman.talk();
		femaleWhiteHuman.setx();

		// 女性黑种人
		AbstractYellowHuman femaleYellowHuman = femaleFactory.createYellowHuman();
		femaleYellowHuman.color();
		femaleYellowHuman.talk();
		femaleYellowHuman.setx();
	}

}
