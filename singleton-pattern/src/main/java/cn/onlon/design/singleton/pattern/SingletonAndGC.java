/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  SingletonAndGC.java   
 * @Package cn.onlon.design.singleton.pattern   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年3月31日 下午5:28:56   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.singleton.pattern;

import java.util.concurrent.TimeUnit;

/**   
 * @ClassName:  SingletonAndGC   
 * @Description:TODO(单例对象是否被JVM回收)   
 * @author: 郭清存 
 * @date:   2019年3月31日 下午5:28:56   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public class SingletonAndGC {

	/**
	 * @throws InterruptedException    
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) throws InterruptedException {
		Singleton1 singleton = Singleton1.getSingleton();
		TimeUnit.SECONDS.sleep(2);
		
		singleton = null;
		System.gc();
		
		TimeUnit.SECONDS.sleep(3);
		boolean ok = null == Singleton1.getSingleton();
		System.out.println("单例实例是否为null：" + ok);
		

	}

}
