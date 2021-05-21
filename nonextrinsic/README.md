@shuimowang

#第15章 享元模式

Flyweight: 抽象享元类

ConcreteFlyweight: 具体享元类

UnsharedConcreteFlyweight: 非共享具体享元类

FlyweightFactory: 享元工厂类

##共享网络设备（无外部状态）：实例说明

  很多网络设备都是支持共享的，如交换机、集线器等，多台终端计算机可以连接同一台网络设备，并通过该网络设备进行数据转发，如图所示，现用享元模式模拟共享网络设备的设计原理。

![Image text](https://github.com/shuimowang/shejimoshi/blob/main/Picture/nonextrinsic1.jpg)

##共享网络设备（无外部状态）：参考类图

![Image text](https://github.com/shuimowang/shejimoshi/blob/main/Picture/nonextrinsic2.jpg)

##共享网络设备（无外部状态）：代码运行

![Image text](https://github.com/shuimowang/shejimoshi/blob/main/Picture/nonextrinsic3.jpg)

