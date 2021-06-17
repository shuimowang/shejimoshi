@shuimowang

# 第25章 策略模式

Context: 环境类

Strategy: 抽象策略类

ConcreteStrategy: 具体策略类

##排序策略：实例说明

  某系统提供了一个用于对数组数据进行操作的类，该类封装了对数组的常见操作，如查找数组元素、对数组元素进行排序等。现以排序操作为例，使用策略模式设计该数组操作类，使得客户端可以动态地更换排序算法，可以根据需要选择冒泡排序或选择排序或插入排序，也能够灵活地增加新的排序算法。

##排序策略：参考类图

![Image text](https://github.com/shuimowang/shejimoshi/blob/main/Picture/strategy1.jpg)

##排序策略：代码运行

![Image text](https://github.com/shuimowang/shejimoshi/blob/main/Picture/strategy2.jpg)


