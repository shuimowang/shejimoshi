@shuimowang

#第7章 建造者模式

Builder：抽象建造者

ConcreteBuilder：具体建造者

Director：指挥者

Product：产品角色

##KFC套餐：实例说明

  建造者模式可以用于描述KFC如何创建套餐：套餐是一个复杂对象，它一般包含主食（如汉堡、鸡肉卷等）和饮料（如果汁、可乐等）等组成部分，不同的套餐有不同的组成部分，而KFC的服务员可以根据顾客的要求，一步一步装配这些组成部分，构造一份完整的套餐，然后返回给顾客。

![Image text](https://github.com/shuimowang/shejimoshi/blob/main/Picture/builder1.jpg)

##KFC套餐：实例说明

![Image text](https://github.com/shuimowang/shejimoshi/blob/main/Picture/builder2.jpg)

##KFC套餐：代码运行

![Image text](https://github.com/shuimowang/shejimoshi/blob/main/Picture/builder3.jpg)
