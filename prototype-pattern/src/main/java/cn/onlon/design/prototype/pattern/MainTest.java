/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  MainTest.java   
 * @Package cn.onlon.design.prototype.pattern   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月3日 上午11:58:40   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.prototype.pattern;

/**   
 * @ClassName:  MainTest   
 * @Description:TODO( 场景类)   
 * @author: 郭清存 
 * @date:   2019年4月3日 上午11:58:40   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public class MainTest {

	/**
	 * @throws CloneNotSupportedException    
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		Product p = new Product(1,"产品");
		
		for (int i = 1; i <= 100; i++) {
			Product tem = p.clone();
			tem.setName("产品" + i);
			System.out.println(tem);
		}
		System.out.println(p);

	}

}
