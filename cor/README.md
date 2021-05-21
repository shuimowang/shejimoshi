@shuimowang

#第17章 职责链模式

Handler: 抽象处理者

ConcreteHandler: 具体处理者

##审批假条：实例说明

  某OA系统需要提供一个假条审批的模块，如果员工请假天数小于3天，主任可以审批该假条；如果员工请假天数大于等于3天，小于10天，经理可以审批；如果员工请假天数大于等于10天，小于30天，总经理可以审批；如果超过30天，总经理也不能审批，提示相应的拒绝信息。

##审批假条：参考类图

![Image text](https://github.com/shuimowang/shejimoshi/blob/main/Picture/cor1.jpg)

##审批假条：代码运行

![Image text](https://github.com/shuimowang/shejimoshi/blob/main/Picture/cor2.jpg)
