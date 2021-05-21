@shuimowang

#第12章 组合模式

Component: 抽象构件

Leaf: 叶子构件

Composite: 容器构件

##水果盘：实例说明

  在水果盘(Plate)中有一些水果，如苹果(Apple)、香蕉(Banana)、梨子(Pear)，当然大水果盘中还可以有小水果盘，现需要对盘中的水果进行遍历（吃），当然如果对一个水果盘执行“吃”方法，实际上就是吃其中的水果。使用组合模式模拟该场景。

![Image text](https://github.com/shuimowang/shejimoshi/blob/main/Picture/composite1.jpg)

##水果盘：参考类图

![Image text](https://github.com/shuimowang/shejimoshi/blob/main/Picture/composite2.jpg)

##水果盘：代码运行

![Image text](https://github.com/shuimowang/shejimoshi/blob/main/Picture/composite3.jpg)
