@shuimowang

#第11章 桥接模式

Abstraction：抽象类

RefinedAbstraction：扩充抽象类

Implementor：实现类接口

ConcreteImplementor：具体实现类类

##模拟毛笔：实例说明

  现需要提供大中小3种型号的画笔，能够绘制5种不同颜色，如果使用蜡笔，我们需要准备3*5=15支蜡笔，也就是说必须准备15个具体的蜡笔类。而如果使用毛笔的话，只需要3种型号的毛笔，外加5个颜料盒，用3+5=8个类就可以实现15支蜡笔的功能。本实例使用桥接模式来模拟毛笔的使用过程。

![Image text](https://github.com/shuimowang/shejimoshi/blob/main/Picture/bridge1.jpg)

##模拟毛笔：代码运行

![Image text](https://github.com/shuimowang/shejimoshi/blob/main/Picture/bridge2.jpg)


