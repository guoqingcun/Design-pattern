+ 定义

	抽象工厂模式定义：provide an interface for creating families of related or dependent objects without specifying their concrete classes。  
	汉化 ：为创建一组相关或相互依赖的对象而提供的一个接口，且在创建时不必指定具体的实现类。  
	
+ 优点

	封装性好，符合迪米特法则(最少知识原则)，横向扩展容易，例如在例子代码种添加双性人,只需添加一个双性人工厂及各人种的实现类。符合开闭原则  
	
+ 缺点

	竖向扩展难，比如添加棕色人种，就需从修改底层工厂（AbstractHumanFactory）类及工厂实现类(FemaleFactory,MaleFactory)。从这点抽象工厂不符合开闭原则。  
	
	
+ 使用场景

	略  
	
	