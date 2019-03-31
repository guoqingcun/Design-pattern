### Design-pattern

+ 单一职责原则
	
	SRP: Single Responsibility Principle 原话解释是 “There should never be more than one reason for a class to change”
	
+ 里氏替换原则
	
	所有引用基类的地方可以透明的用子类替代。如下是里氏替换的四个规范
	
	1. 子类必须实现父类全部的方法
	2. 子类可以有自己的属性和方法
	3. 重载父类方法时，输入参数可以被放大
	4. 重载或重写父类方法时，返回类型可缩小
	
+ 依赖倒置原则

	DIP：Dependence Inversion Principle.原话解释是 “High level modules should not depend on low modules.Both should depend upon abstractions.Abstractions should not depend upon details.Details should depend upon abstractions. ”
	汉化版如下：
	1. 高层模块不应依赖底层模块，两者都要依赖抽象。
	2. 抽象不应依赖具体
	3. 具体应该依赖抽象
	
+ 接口隔离原则
+ 迪米特法则
+ 开闭原则
