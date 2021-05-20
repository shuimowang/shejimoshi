#第21章 中介者模式

Mediator: 抽象中介者

ConcreteMediator: 具体中介者

Colleague: 抽象同事类

ConcreteColleague: 具体同事类

#虚拟聊天室：实例说明

 某论坛系统欲增加一个虚拟聊天室，允许论坛会员通过该聊天室进行信息交流，普通会员(CommonMember)可以给其他会员发送文本信息，钻石会员(DiamondMember)既可以给其他会员发送文本信息，还可以发送图片信息。该聊天室可以对不雅字符进行过滤，如“日”等字符；还可以对发送的图片大小进行控制。用中介者模式设计该虚拟聊天室。

##虚拟聊天室：参考类图

![Image text](https://github.com/shuimowang/shejimoshi/blob/main/Picture/mediator1.jpg)

##虚拟聊天室：代码运行

![Image text](https://github.com/shuimowang/shejimoshi/blob/main/Picture/mediator2.jpg)
