@shuimowang

#第22章 备忘录模式

  在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样可以在以后将对象恢复到原先保存的状态。

##用户信息操作撤销：实例说明
  某系统提供了用户信息操作模块，用户可以修改自己的各项信息。为了使操作过程更加人性化，现使用备忘录模式对系统进行改进，使得用户在进行了错误操作之后可以恢复到操作之前的状态。

##用户信息操作撤销：参考类图

![Image text](https://github.com/shuimowang/shejimoshi/blob/main/Picture/memento1.jpg)

##用户信息操作撤销：代码运行

![Image text](https://github.com/shuimowang/shejimoshi/blob/main/Picture/memento2.jpg)