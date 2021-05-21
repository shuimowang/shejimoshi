@shuimowang

#第18章 命令模式

Command: 抽象命令类

ConcreteCommand: 具体命令类

Invoker: 调用者

Receiver: 接收者

##电视机遥控器：实例说明

  电视机是请求的接收者，遥控器是请求的发送者，遥控器上有一些按钮，不同的按钮对应电视机的不同操作。抽象命令角色由一个命令接口来扮演，有三个具体的命令类实现了抽象命令接口，这三个具体命令类分别代表三种操作：打开电视机、关闭电视机和切换频道。显然，电视机遥控器就是一个典型的命令模式应用实例。

##电视机遥控器：参考类图

![Image text](https://github.com/shuimowang/shejimoshi/blob/main/Picture/command1.jpg)

##电视机遥控器：代码运行

![Image text](https://github.com/shuimowang/shejimoshi/blob/main/Picture/command2.jpg)
