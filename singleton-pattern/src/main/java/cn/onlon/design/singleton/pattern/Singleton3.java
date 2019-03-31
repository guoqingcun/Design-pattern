/**  
 * All rights Reserved, Designed By www.onlon.cn
 * @Title:  Singleton2.java   
 * @Package cn.onlon.design.singleton.pattern   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 郭清存     
 * @date:   2019年3月31日 下午4:32:44   
 * @version V1.0 
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 */  
package cn.onlon.design.singleton.pattern;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**   
 * @ClassName:  Singleton3   
 * @Description:TODO(懒汉模式)   
 * @author: 郭清存 
 * @date:   2019年3月31日 下午4:32:44   
 *     
 * @Copyright: 2019 www.onlon.cn Inc. All rights reserved. 
 * 注意：本内容仅限于公益交流，禁止外泄以及用于其他的商业目 
 */
public class Singleton3 {
	
	private static  Singleton3 singleton = null;
	
	public static synchronized Singleton3 getSingleton() throws InterruptedException {
		TimeUnit.MILLISECONDS.sleep(10);
		if(null == singleton) {
			
			singleton = new Singleton3();
		}
		return singleton;
	}

	/**
	 * @throws ExecutionException 
	 * @throws InterruptedException    
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		final Set<Singleton3> set = new HashSet<Singleton3>();
		final CountDownLatch cd = new CountDownLatch(1);
		
		ExecutorService es = Executors.newFixedThreadPool(50);
		
		/*
		 * es.execute(new Runnable() { public void run() {
		 * set.add(Singleton2.getSingleton());
		 * 
		 * } });
		 */
		List<Future> listFuture = new ArrayList<Future>(50);
		for (int i = 0; i < 50; i++) {
			Future f = es.submit(new Runnable() {
				public void run() {
					try {
						System.out.println("thread wait");
						cd.await();
						set.add(Singleton3.getSingleton());
						System.out.println("thead doed");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			listFuture.add(f);
		}
		cd.countDown();
		
		Integer count = 0;
		for (Future future : listFuture) {
			while(!future.isDone()) {
				TimeUnit.MILLISECONDS.sleep(10);
				
			}
			
			count++;
		}
		System.out.println("有多少个线程已经完成：" + count);
		
		System.out.println("集合中singleton3的实例个数是：" + set.size());

	}

}
