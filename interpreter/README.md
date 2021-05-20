#第19章 解释器模式

AbstractExpression: 抽象表达式

TerminalExpression: 终结符表达式

NonterminalExpression: 非终结符表达式

Context: 环境类

##数学运算解释器：实例说明

  现需要构造一个语言解释器，使得系统可以执行整数间的乘、除和求模运算。例如：用户输入表达式“3 * 4 / 2 % 4”，输出结果为2。使用解释器模式实现该功能。

##数学运算解释器：参考类图

![Image text](https://github.com/shuimowang/shejimoshi/blob/main/Picture/interpreter1.jpg)

##数学运算解释器：代码运行

![Image text](https://github.com/shuimowang/shejimoshi/blob/main/Picture/interpreter2.jpg)
