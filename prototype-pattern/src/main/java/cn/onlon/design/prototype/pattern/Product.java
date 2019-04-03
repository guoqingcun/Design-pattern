/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  Product.java   
 * @Package cn.onlon.design.prototype.pattern   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年4月3日 上午11:57:35   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */
package cn.onlon.design.prototype.pattern;

/**
 * @ClassName: Product
 * @Description:TODO(产品)
 * @author: 郭清存
 * @date: 2019年4月3日 上午11:57:35
 * 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved.
 *             注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目
 */
public class Product implements Cloneable {

	private Integer id;

	private String name;

	public Product(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ id = " +id+",name = " +name+ "]";
	}

	@Override
	protected Product clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Product)super.clone();
	}
}
