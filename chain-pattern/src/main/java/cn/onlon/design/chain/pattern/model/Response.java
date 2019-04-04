/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  Reponse.java   
 * @Package cn.onlon.design.chain.pattern.model   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月4日 下午1:06:45   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.chain.pattern.model;

/**   
 * @ClassName:  Response   
 * @Description:TODO(响应)   
 * @author: 郭清存 
 * @date:   2019年4月4日 下午1:06:45   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public class Response {

	private String msg;

	
	public Response(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
