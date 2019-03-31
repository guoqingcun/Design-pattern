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

	接口分类：实例接口（new XXX（）），类接口（interface）
	接口隔离是对接口和类的定义。接口和类尽量使用原子接口或原子类。原子性可根据以下几个规则衡量。
	1. 一个接口只服务于一个子模块或业务逻辑
	2. 通过业务逻辑压缩接口中的public方法。
	3. 接口变更风险大的，可用适配器模式进行处理
	4. 接口拆分标准不同，好的设计需要深入了解业务逻辑。
	
+ 迪米特法则

	迪米特法则也称为最少知识原则，一个对象对其依赖的对象内部知道的越少越好，具体内部实现多么复杂，调用者不关心。
	迪米特法则对类的低耦合提出了明确要求，其包含以下4层含义。
	1. 只和朋友交流
	2. 朋友间保持距离
	3. 是自己的就是自己的
	4. 谨慎使用Serializable
	
	总结：低耦合，高内聚

+ 开闭原则

	开闭原则是以上5个原则的精神原则，是根本，它们是开闭原则的具体实现原则。
	对扩展开放，对修改关闭
	详述：通过扩展改变软件实体，而非修改现有代码改变软件实体。
	Software entities likes classes,modules and functions should open for extension  but closed for modifications
	

	总结
	6原则和称 SOLID（稳定的）。朝着六个原则的方向努力，可以很好的改善系统，真正做到“拥抱变化”	
	原则只供参考，如果违背原则，项目也未必做不成，这需要大家在使用原则时反复的度量，不遵循是不对，严格执行“过犹不及”
   
