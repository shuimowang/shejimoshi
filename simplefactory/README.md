@shuimowang

#第4章 简单工厂模式

Factory：工厂角色

Product：抽象产品角色

ConcreteProduct：具体产品角色

##简单电视机工厂：实例说明

  某电视机厂专为各知名电视机品牌代工生产各类电视机，当需要海尔牌电视机时只需要在调用该工厂的工厂方法时传入参数“Haier”，需要海信电视机时只需要传入参数“Hisense”，工厂可以根据传入的不同参数返回不同品牌的电视机。现使用简单工厂模式来模拟该电视机工厂的生产过程。

##简单电视机工厂：参考类图

![Image text](https://github.com/shuimowang/shejimoshi/blob/main/Picture/simplefactory1.jpg)

##简单电视机工厂：代码运行

![Image text](https://github.com/shuimowang/shejimoshi/blob/main/Picture/simplefactory2.jpg)
