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

工厂方法模式 (Factory Method Pattern) [第8章](src/main/java/chapter8)
- a interface for creating an object
- let subclasses decide which class to instantiate
- let a class defer instantiation to subclasses
- 典型的解耦框架框架，符合迪米特法则、依赖倒置原则和里氏替换原则
- 扩展：简单工厂模式（Simple Factory Pattern，也叫做 静态工厂模式）

抽象工厂模式 (Abstract Factory Pattern) [第9章](src/main/java/chapter9)
- provide an interface
- creating families of related or dependent objects
- without specifying their concrete classes

模版方式模式 (Template Method Pattern) [第10章](src/main/java/chapter10)
- define the skeleton of an algorithm in an operation
- defer some steps to subclasses
- 钩子方法（Hook Method)

建造者模式 (Builder Pattern) [第11章](src/main/java/chapter11)
- separate the construction of a complex object from its representation
- 与工厂模式的不同点在于：构造者关心的是基本方法的调用顺序安排，工厂关心创建

代理模式 (Proxy Pattern) [第12章](src/main/java/chapter12)
- provide a surrogate or placeholder for another object
- control access to real object
- 动态代理在运行阶段才指定代理哪一个对象