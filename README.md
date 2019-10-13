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