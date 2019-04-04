+ 定义

	装饰者模式：Attach additional responsibilities to an object dynamically keeping the same interface。 
	Decorators provide a flexible alternative to subclassing for extending functionality
	汉化：动态的为对象添加额外的职责，就增加功能来说，装饰者模式比继承更为灵活。
	
+ 优点

	1. 装饰类与被装饰类相互独立。
	2. 符合依赖倒置原则
	3. 符合单一职责原则
	4. 动态扩展类功能
	
+ 缺点

	1. 装饰层多易复杂
	2. 不易调试
	
+ 场景

	1. 为对象添加功能
	2. 为对象动态添加/撤销功能