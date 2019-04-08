/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  Facade.java   
 * @Package cn.onlon.design.facade.pattern.facade   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月8日 下午11:42:16   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */
package cn.onlon.design.facade.pattern.facade;

import cn.onlon.design.facade.pattern.subsystem.ClassA;
import cn.onlon.design.facade.pattern.subsystem.ClassB;
import cn.onlon.design.facade.pattern.subsystem.ClassC;

/**
 * @ClassName: Facade
 * @Description:TODO(门面)
 * @author: 郭清存
 * @date: 2019年4月8日 下午11:42:16
 * 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved.
 *             注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目
 */
public class Facade {

	private ClassA ca = new ClassA();
	private ClassB cb = new ClassB();
	private ClassC cc = new ClassC();

	public void methodA() {
		ca.doSomething();

	}

	public void methodB() {
		cb.doSomething();

	}

	public void methodC() {
		cc.doSomething();

	}
}
