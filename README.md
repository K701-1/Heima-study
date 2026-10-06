# Java 基础学习项目

这是一个 Java 基础学习项目，涵盖了从 Java 语法入门到面向对象编程的核心知识点与示例代码。项目适合 Java 初学者，通过大量循序渐进的代码示例配合中文笔记，帮助掌握 Java 编程的基础概念与面向对象思想。

> 学习来源：黑马程序员 Java + AI 入门课程 ｜ 包路径：`com.basic.*`、`com.opp.*`、`com.opp_advanced.*`

## 项目结构

```
heima/
├── src/com/                     # 源代码根目录
│   ├── basic/                   # Java 基础语法（93 个文件，14 个包）
│   │   ├── helloworld/          # Java 入门（1）
│   │   ├── varlable/            # 变量与基本数据类型（8）
│   │   ├── operator/            # 运算符（16）
│   │   ├── ifdemo/              # 条件判断 if（9）
│   │   ├── switchdemo/          # 分支判断 switch（6）
│   │   ├── loopfor/             # for 循环（7）
│   │   ├── loopwhile/           # while 循环（4）
│   │   ├── loopdowhile/         # do...while 循环（1）
│   │   ├── infiniteloop/        # 死循环（1）
│   │   ├── looploop/            # 嵌套循环（9）
│   │   ├── controllerloop/      # 循环控制 break/continue（8）
│   │   ├── array/               # 数组（15）
│   │   ├── method/              # 方法（6）
│   │   └── test/                # 综合练习（2）
│   ├── opp/                     # 面向对象基础（16 个文件，8 组示例）
│   │   └── ooptest1 ~ opptest8  # 类与对象、封装、this、构造方法
│   └── opp_advanced/            # 面向对象进阶与高级（54 个文件）
│       ├── staticvariabletest/  # static 成员变量（2）
│       ├── finaltest/           # final 关键字（4）
│       ├── enumtest/            # 枚举 enum（3）
│       ├── toolclasstest/       # 静态工具类（2）
│       ├── oop_extends/         # 继承与方法重写（test1~test9，37）
│       └── oop_polymorphic/     # 多态（6）
├── 笔记/                        # 学习笔记（Markdown）
│   ├── Java基础/                # 8 篇
│   └── 面向对象/                # 3 篇
├── out/                         # 编译产物（.class）
├── basic-code.iml               # IDEA 模块配置
└── README.md                    # 项目说明文档
```

## 模块说明

### 一、Java 基础语法（`com.basic.*`）

#### 1. HelloWorld 入门（`com.basic.helloworld`，1 个）
- **HelloWorld.java**：Java 程序入口示例，演示类结构、`main` 方法与注释写法。

#### 2. 变量与基本数据类型（`com.basic.varlable`，8 个）
- **VariableDemo1~8.java**：变量定义与使用、8 种基本数据类型、命名规则、注意事项、类型转换、`Scanner` 键盘录入，以及 BMI 等综合练习。

#### 3. 运算符（`com.basic.operator`，16 个）
- **OperatorDemo1~16.java**：算术运算符、数字拆分与时间换算、类型转换、ASCII 大小写转换、字符串拼接、赋值/关系/逻辑（含短路）运算符、三元运算符、运算符优先级，以及回文数、有缘数等综合练习。

#### 4. 条件判断 if（`com.basic.ifdemo`，9 个）
- **IfDemo1~9.java**：单分支、双分支、多分支 `else if`，布尔判断、书写细节（大括号风格、分号陷阱），以及外卖比价、优惠券满减、充值分档、BMI 分级等综合实战。

#### 5. 分支判断 switch（`com.basic.switchdemo`，6 个）
- **SwitchDemo1~6.java**：`switch` 基本语法、`case` 穿透与 `break`、`switch` 的多种写法及与 `if` 的对比应用。

#### 6. for 循环（`com.basic.loopfor`，7 个）
- **ForDemo1~7.java**：`for` 循环语法、执行流程、基本应用与练习（求和、计数、遍历等）。

#### 7. while 循环（`com.basic.loopwhile`，4 个）
- **WhileDemo1~4.java**：`while` 循环语法与应用，理解其与 `for` 的等价关系。

#### 8. do...while 循环（`com.basic.loopdowhile`，1 个）
- **DoWhileDemo.java**：`do...while` 语法，掌握"至少执行一次"的特点。

#### 9. 死循环（`com.basic.infiniteloop`，1 个）
- **InfiniteLoopDemo.java**：死循环的写法、成因及实际应用场景。

#### 10. 嵌套循环（`com.basic.looploop`，9 个）
- **Test1~9.java**：双重/多层循环的应用，如打印矩形、九九乘法表、图形打印等综合练习。

#### 11. 循环控制（`com.basic.controllerloop`，8 个）
- **BreakDemo1~3.java**：`break` 跳出循环、配合标记退出多层循环。
- **ContinueDemo1~3.java**：`continue` 结束本次循环，进入下一次。
- **Test1~2.java**：`break`/`continue` 综合练习。

#### 12. 数组（`com.basic.array`，15 个）
- **ArrayDemo1~5.java**：数组静态初始化、动态初始化、元素访问与修改、遍历、索引越界与边界检查。
- **ArrayTest1~6.java**：查找元素是否存在、求最大值、交换变量、打乱数组、生成不重复随机数、有序数组去重（快慢指针）。
- **ArraySelfTest.java**：生成不重复随机数的优化写法（`j < i` 查重）。
- **SelfTest1~3.java**：力扣算法练习——两数之和、合并有序数组（归并双指针）、搜索插入位置（二分查找）。

#### 13. 方法（`com.basic.method`，6 个）
- **MethodDemo1~6.java**：方法的定义与调用、带参数与带返回值的方法、方法重载（Overload），以及方法在解决代码重复中的应用。

#### 14. 综合练习（`com.basic.test`，2 个）
- **Test1~2.java**：基础语法阶段的综合性编程练习。

### 二、面向对象基础（`com.opp.*`，8 组示例）

以"JavaBean 类 + 测试类"的形式，循序渐进地讲解面向对象的核心概念：

- **ooptest1（Dog）**：只用属性描述对象，学习创建对象（`类名 对象名 = new 类名();`）与访问属性。
- **ooptest2（Student）**：常用属性类型选择、属性的默认值。
- **opptest3（Teacher）**：给类添加行为（成员方法），JavaBean 方法不写 `static`。
- **opptest4（Cook）**：属性 + 行为的综合示例。
- **opptest5（Dog）**：封装——`private` 私有化属性，提供 `set`/`get` 方法并做合法性校验。
- **opptest6（Student）**：`this` 关键字——区分同名的成员变量与局部变量。
- **opptest7（Student）**：构造方法——空参与全参构造，理解 `new` 时自动调用及重载规则。
- **opptest8（Student）**：标准 JavaBean 完整模板（私有属性 + 空参 + 全参 + set/get + 行为）。

### 三、面向对象进阶与高级（`com.opp_advanced.*`，54 个文件）

面向对象进阶：
- **staticvariabletest（2 个）**：`static` 修饰成员变量（静态变量），理解共享、归属类、生命周期，推荐用 `类名.变量名` 调用。
- **finaltest（4 个）**：`final` 关键字——修饰常量、对基本类型与引用类型的不同含义，以及用 `final` 定义 `Circle` 圆周率常量。
- **enumtest（3 个）**：枚举 `enum`——`OrderState` 订单状态枚举的定义、构造私有化、`values()`/`valueOf()`，以及配合 `switch` 匹配。
- **toolclasstest（2 个）**：静态方法与现代工具类——`ArrayUtil` 工具类（方法 `static` + 构造私有化），遍历打印数组与求平均分。

面向对象高级——继承（`oop_extends`，test1~test9，共 37 个）：
  - **test1**：`extends` 基本语法，子类继承父类属性与方法（`Person`/`Student`/`Teacher`）。
  - **test2**：多层继承体系（`SmartDevice` → `Phone`/`Computer` → `Android`/`Apple`）。
  - **test3**：继承中构造方法与成员变量的特点（`Fu`/`Zi`）。
  - **test4**：方法重写 `@Override`（`Gen1Phone` → `Gen3Phone` 演进）。
  - **test5**：方法重写应用——智能设备打折 `payment()`（`SmartDevice`/`Phone`/`Pad`/`Computer`）。
  - **test6**：继承中构造方法细节与 `super()`（`Person`/`Student`/`Teacher`）。
  - **test7**：`this()` 调用本类其他构造方法（`Student`）。
  - **test8**：综合继承案例——本科/硕士研究生、专业课/通识课老师。
  - **test9**：权限修饰符 `private`/`default`/`protected`/`public`。

面向对象高级——多态（`oop_polymorphic`，共 6 个）：
  - **test**：多态——父类引用指向子类对象，学生/老师/管理员注册场景（`Person`/`Student`/`Teacher`/`Admin`/`StudentMenager`）。

## 学习笔记

### Java 基础（`笔记/Java基础/`）

| 笔记文件 | 对应内容 |
| --- | --- |
| Java运行机制及内存.md | Java 运行机制、JVM/JRE/JDK 与内存分区 |
| 基本数据类型.md | 变量与 8 种基本数据类型 |
| 运算符.md | 各类运算符与优先级 |
| if语句.md | 条件判断 if/else |
| switch语句.md | switch 分支语句 |
| 循环loop.md | for / while / do...while / 嵌套循环 / break、continue |
| 数组Array.md | 数组语法、经典练习与算法 |
| 方法Method.md | 方法定义、参数、返回值与重载 |

### 面向对象（`笔记/面向对象/`）

| 笔记文件 | 对应内容 |
| --- | --- |
| 面向对象基础.md | 类与对象、封装、this、构造方法、JavaBean 规范 |
| 面向对象进阶.md | static 成员、final、枚举、静态工具类 |
| 面向对象高级.md | 继承、重写、多态（整理中） |

## 学习内容

### 核心知识点
1. **Java 程序结构**：类、方法、`main` 入口、注释、Java 运行机制与内存分区。
2. **数据类型与变量**：8 种基本数据类型、定义使用、类型转换。
3. **运算符**：算术、赋值、关系、逻辑、三元及优先级。
4. **流程控制**：if/switch 分支，for/while/do...while 循环，嵌套循环，break/continue。
5. **数组**：初始化、访问、遍历，以及查找、去重、排序相关的经典算法练习。
6. **方法**：定义与调用、参数与返回值、方法重载。
7. **面向对象基础**：类与对象、封装（`private` + set/get）、`this`、构造方法、JavaBean 规范。
8. **面向对象进阶**：`static` 成员、`final` 关键字、枚举、静态工具类。
9. **面向对象高级**：继承（`extends`）、方法重写（`@Override`）、多态。
10. **输入输出**：`System.out.println()`、`Scanner`。

### 编码规范
- 使用驼峰命名法（camelCase）。
- 类名首字母大写（`PascalCase`），方法名/变量名首字母小写。
- 常量全大写、下划线分隔。
- 代码遵循 K&R 大括号风格，缩进统一。
- JavaBean 类：私有属性 + 空参/全参构造 + set/get + 成员方法（不写 `static`）。

## 运行项目

### 环境要求
- JDK 8 或更高版本（本项目在 **JDK 21 / IntelliJ IDEA** 下开发）。
- IntelliJ IDEA（推荐）或其他 Java IDE。

### IDE 运行步骤
1. 使用 IntelliJ IDEA 打开项目。
2. 配置好 Project SDK（JDK）。
3. 右键点击要运行的 Java 文件，选择 "Run"。

### 命令行运行
```bash
# 编译（示例：HelloWorld）
javac -encoding UTF-8 -d out src/com/basic/helloworld/HelloWorld.java

# 运行
java -cp out com.basic.helloworld.HelloWorld
```

## 学习建议

1. **循序渐进**：按"入门 → 变量 → 运算符 → 分支 → 循环 → 数组 → 方法 → 面向对象"的顺序学习。
2. **动手实践**：每个示例都亲自运行和修改。
3. **理解原理**：不仅会写代码，还要理解背后的执行流程与内存模型。
4. **配合笔记**：结合 `笔记/` 目录下的 Markdown 笔记复习巩固。
5. **多做练习**：尝试修改示例代码，观察不同结果。

## 项目特点

- **示例丰富**：每个知识点都有对应的代码示例（共 163 个源文件）。
- **注释详细**：代码中包含详细的中文注释与要点说明。
- **结构清晰**：按"基础语法 → 面向对象"分阶段、分包组织，配有系统化笔记。
- **适合入门**：从最简概念起步，逐步深入到数组算法与面向对象三大特征。

## 常见问题

### Q: 为什么我的代码运行出错？
A: 请检查：类名与文件名是否一致、是否缺少分号或括号、是否导入了必要的包（如 `java.util.Scanner`、`java.util.Random`）。

### Q: 如何查看代码运行结果？
A: 运行程序后，结果会显示在 IDE 的控制台或终端窗口中。

### Q: 数组访问报错 `ArrayIndexOutOfBoundsException`？
A: 索引超出了 `0 ~ 数组长度-1` 的范围，访问前应先做边界检查。

### Q: 命令行编译中文注释乱码？
A: 编译时加上 `-encoding UTF-8` 参数（见上方命令行示例）。

## 扩展学习

完成本项目后，可以继续学习：
- 继承体系进阶（`super`、抽象类、接口）
- 集合框架（List、Set、Map）
- 常用 API、异常处理
- 文件 IO、多线程编程

## 许可证

本项目仅供学习使用。
