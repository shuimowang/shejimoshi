@shuimowang

#第5章 工厂方法模式

Product：抽象产品

ConcreteProduct：具体产品

Factory：抽象工厂

ConcreteFactory：具体工厂

##电视机工厂：实例说明

  将原有的电视机工厂进行分割，为每种品牌的电视机提供一个子工厂，海尔工厂专门负责生产海尔电视机，海信工厂专门负责生产海信电视机，如果需要生产TCL电视机或创维电视机，只需要对应增加一个新的TCL工厂或创维工厂即可，原有的工厂无须做任何修改，使得整个系统具有更加的灵活性和可扩展性。 

##电视机工厂：参考类图

![Image text](https://github.com/shuimowang/shejimoshi/blob/main/Picture/factorymethod1.jpg)

##电视机工厂：代码运行

![Image text](https://github.com/shuimowang/shejimoshi/blob/main/Picture/factorymethod2.jpg)
