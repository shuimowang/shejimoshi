@shuimowang

#第9章 单例模式

Singleton：单例

##打印池：实例说明

在操作系统中，打印池(Print Spooler)是一个用于管理打印任务的应用程序，通过打印池用户可以删除、中止或者改变打印任务的优先级，在一个系统中只允许运行一个打印池对象，如果重复创建打印池则抛出异常。现使用单例模式来模拟实现打印池的设计。

##打印池：参考类图

![Image text](https://github.com/shuimowang/shejimoshi/blob/main/Picture/singleton1.jpg)

##打印池：代码运行

![Image text](https://github.com/shuimowang/shejimoshi/blob/main/Picture/singleton2.jpg)
