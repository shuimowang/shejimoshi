@shuimowang

#第8章 原型模式

Prototype：抽象原型类

ConcretePrototype：具体原型类

Client：客户类

##邮件复制（浅克隆）：实例说明

  由于邮件对象包含的内容较多（如发送者、接收者、标题、内容、日期、附件等），某系统中现需要提供一个邮件复制功能，对于已经创建好的邮件对象，可以通过复制的方式创建一个新的邮件对象，如果需要改变某部分内容，无须修改原始的邮件对象，只需要修改复制后得到的邮件对象即可。使用原型模式设计该系统。
 
  在本实例中使用浅克隆实现邮件复制，即复制邮件(Email)的同时不复制附件(Attachment)。

##邮件复制（浅克隆）：参考类图

![Image text](https://github.com/shuimowang/shejimoshi/blob/main/Picture/shallow1.jpg)

##邮件复制（浅克隆）：代码运行

![Image text](https://github.com/shuimowang/shejimoshi/blob/main/Picture/shallow2.jpg)


