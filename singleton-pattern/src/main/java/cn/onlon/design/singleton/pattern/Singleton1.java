package cn.onlon.design.singleton.pattern;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @ClassName:  Singleton1   
 * @Description:TODO(饿汉模式)   
 * @author: 郭清存 
 * @date:   2019年3月31日 下午4:25:28   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目
 */
public class Singleton1 {

	private static final Singleton1 singleton = new Singleton1();
	
	private Singleton1() {}
	
	public static Singleton1 getSingleton() {
		return singleton;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Singleton1> set = new HashSet<Singleton1>();
		for (int i = 0; i < 10; i++) {
			set.add(Singleton1.getSingleton());
		}
		
		System.out.println("集合中Singleton的实例个数:" + set.size());
		

	}

}
