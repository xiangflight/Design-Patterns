《设计模式之禅》

## 六大设计原则 (SOLID)

1. 开闭原则 原则的原则 对扩展开放，对修改关闭 Open Closed Principle [第6章](src/main/java/chapter6)
2. 单一职责原则 Single Responsibility Principle [第1章](src/main/java/chapter1)
3. 里氏替换原则 Liskov Substitution Principle [第2章](src/main/java/chapter2)
4. 迪米特法则 最少知识原则 Law of Demeter [第5章](src/main/java/chapter5)
5. 接口隔离原则 Interface Segregation Principle [第4章](src/main/java/chapter4)
6. 依赖倒置原则 Dependence Inversion Principle [第3章](src/main/java/chapter3)

## 演绎

单例模式 （Singleton Pattern）[第7章](src/main/java/chapter7) 
- ensure a class has only one instance
- provide a global point of access to it

---

工厂方法模式 (Factory Method Pattern) [第8章](src/main/java/chapter8)
- a interface for creating an object
- let subclasses decide which class to instantiate
- let a class defer instantiation to subclasses
- 典型的解耦框架框架，符合迪米特法则、依赖倒置原则和里氏替换原则
- 扩展：简单工厂模式（Simple Factory Pattern，也叫做 静态工厂模式）

---

抽象工厂模式 (Abstract Factory Pattern) [第9章](src/main/java/chapter9)
- provide an interface
- creating families of related or dependent objects
- without specifying their concrete classes

---

模版方法模式 (Template Method Pattern) [第10章](src/main/java/chapter10)
- define the skeleton of an algorithm in an operation
- defer some steps to subclasses
- 钩子方法（Hook Method)

---

建造者模式 (Builder Pattern) [第11章](src/main/java/chapter11)
- separate the construction of a complex object from its representation
- 与工厂模式的不同点在于：构造者关心的是基本方法的调用顺序安排，工厂关心创建

---

代理模式 (Proxy Pattern) [第12章](src/main/java/chapter12)
- provide a surrogate or placeholder for another object
- control access to real object
- 动态代理在运行阶段才指定代理哪一个对象

---

原型模式 (Prototype Pattern) [第13章](src/main/java/chapter13)
- specify the kinds of objects to create using a prototypical instance
- create new objects by copying this prototype
- 由一个正本创建多个副本
- 在 Java 中只需要实现 Cloneable 接口并覆写 clone() 方法即可
- 原型模式是在内存中的二进制流的拷贝，绕过了构造函数，性能较高
- 浅拷贝 --> Java 中只拷贝本对象，对内部的数组、引用对象等不拷贝，还是指向原生对象的内部元素地址
- 深拷贝 --> 原生对象和拷贝对象不共享私有变量

---

中介者模式 (Mediator Pattern) [第14章](src/main/java/chapter14)
- define a object that encapsulates how a set of objects interact.
- promote loose coupling by keeping objects from referring to each other
- vary their interaction independently.
- 类比：网络拓扑中的星型网络拓扑
- 符合迪米特法则
- 优点：减少类之间的依赖，把一对多变成一对一，降低了类间的耦合
- 使用场景：类图中出现蜘蛛网状结构

---

命令模式 (Command Pattern) [第15章](src/main/java/chapter15)
- encapsulate a request as an object
- support undoable operations
- 优点；调用者与接收者角色之间解耦，可扩展性
- 使用场景：只要有命令的地方就可以采用命令模式