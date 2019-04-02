/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  Phone.java   
 * @Package cn.onlon.design.template.pattern   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月2日 下午1:12:33   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.template.pattern;

/**   
 * @ClassName:  Phone   
 * @Description:TODO(电话)   
 * @author: 郭清存 
 * @date:   2019年4月2日 下午1:12:33   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public abstract class Phone {

	/**
	 * 
	 * @Title: dial   
	 * @Description: TODO(拨号)   
	 * @param:       
	 * @return: void      
	 * @throws
	 */
	public abstract void dial();
	/**
	 * 
	 * @Title: connecting   
	 * @Description: TODO(连接)   
	 * @param:       
	 * @return: void      
	 * @throws
	 */
	public abstract void connecting();
	/**
	 * 
	 * @Title: talk   
	 * @Description: TODO(通话)   
	 * @param:       
	 * @return: void      
	 * @throws
	 */
	public abstract void talk();
	/**
	 * 
	 * @Title: hangup   
	 * @Description: TODO(挂断)   
	 * @param:       
	 * @return: void      
	 * @throws
	 */
	public abstract void hangup();
	
	public void execute() {
		dial();
		connecting();
		talk();
		hangup();
	}
	
}
