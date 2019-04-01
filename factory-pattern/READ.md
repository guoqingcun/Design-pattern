+ 定义

	Define an interface for creating an object,but let subclasses decide which classes to instantiate.  
	Factory Method let a class defer instantiate to subclasses  
	
	定义一个用于创建对象的接口，由具体的类决定创建哪个具体的类。
	
+ 特点

	1. 良好的封装性，代码结构清晰，易于扩展
	2. 符合里氏替换原则（子类替换父类）
	3. 符合开闭原则(对扩展开放，比如例子中添加新的产品，只需在场景类中做修改)
	4. 符合依赖倒置原则（只依赖产品的抽象类。把关系在抽象层做关联）
	5. 符合迪米特法则 (最少知识原则)
	
	
+ 应用场景

	1. 数据库连接驱动（jdk抽象了数据源，具体的由驱动厂商实现），如oracle,mysql,PostgreSQL
