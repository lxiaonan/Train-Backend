消峰：验证码（用户发出请求之后，会弹出一个验证码，因为每个用户答题的时间是不一样的，就能很好的分散时间）、分时段(多个时间放票)、排队、限流、异步


# jdk9新特性(模块化)

- 使用module-info.java来声明一个模块一个模块只能有一个文件，且在顶层包同目录下
- 使用exports来声明可以被外部引用的包可以有多个exports语句
- 使用requires来声明依赖的外部的模块可以有多个requires语句

声明这个模块需要向外暴露的类，也就是提供给外部调用的类


# jdk10(var局部变量)

- 必须能推导出实际类型  如 var a = 1 ; var b = new ArrayList<>();  但是var c;或者var d = null;是不允许的
- 只能用于局部变量  不能用于全局



# jdk11(不用编译就能够直接java 文件名.java 运行)

java也支持脚本 需要在前面加上 #!



# jdk14(文本块)

## instanceof增强




# jdk16(record类)

会默认初始一个构造函数，带有里面所有属性，必须在实例化的时候就赋值

只有获取的属性值的方法，方法名跟属性名保存一致，但是不能再修改，也就相当于是final类型的属性



# jdk17

## sealed

**non-sealed打破原来显式的继承**

a permits b,c表示a只能被b,c继承

# springboot3新特性

## AOT

**优点：** 云原生，为云而生

- 启动和运行的速度快
- 打包体积小

**缺点：**

- 编译后的程序不支持跨平台
- 不支持动态功能，如AOP



预热:初始让程序自动运行热点代码几百次
流量控制:启动时小流量，运行几分钟后再放到正常流量



yml文件优先级：自身config下的文件>引入依赖包config下的文件>自身resources下的文件

# 遇到问题
## 网关模块
在配置网关模块的时候，遇到问题：配置了对应模块的内网ip，但是是使用http://localhost 这样会导致无法转发，将localhost更改为127.0.0.1，解决问题

## 版本问题
springboot3需要对应 mybatis-plus-boot-starter <version>3.5.5</version>
mybatis-spring-boot-starter<version>3.0.0</version>

## 错误：Invalid value type for attribute 'factoryBeanObjectType': java.lang.String
是因为mybatis-plus-boot-starter版本中存在一个mybatis-spring2.x
![img.png](img.png)
**解决：加入依赖mybatis-spring<version>3.0.3</version>**

Error creating bean with name 'memberController': Unsatisfied dependency expressed through field 'memberService': ...
解决yml中加入在resources![img_1.png](img_1.png)
