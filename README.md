# Java 基础学习项目

这是一个 Java 基础学习项目，涵盖了 Java 编程入门的核心知识点与示例代码。项目适合 Java 初学者，通过大量循序渐进的代码示例配合中文笔记，帮助掌握 Java 编程的基础概念。

> 学习来源：黑马程序员 Java + AI 入门课程 ｜ 包路径：`com.heima.*`

## 项目结构

```
heima/
├── src/com/heima/          # 源代码目录
│   ├── helloworld/         # Java 入门（1）
│   ├── varlable/           # 变量与基本数据类型（8）
│   ├── operator/           # 运算符（16）
│   ├── ifdemo/             # 条件判断 if（9）
│   ├── switchdemo/         # 分支判断 switch（6）
│   ├── loopfor/            # for 循环（7）
│   ├── loopwhile/          # while 循环（4）
│   ├── loopdowhile/        # do...while 循环（1）
│   ├── infiniteloop/       # 死循环（1）
│   ├── looploop/           # 嵌套循环（9）
│   ├── controllerloop/     # 循环控制 break/continue（8）
│   └── array/              # 数组（15）
├── 笔记/                    # 学习笔记（6 篇 Markdown）
├── out/                    # 编译产物（.class）
├── 已完成Demo总结.md         # Demo 完成进度总结
├── heima.iml               # IDEA 模块配置
└── README.md               # 项目说明文档
```

## 模块说明

### 1. HelloWorld 入门 (`com.heima.helloworld`，1 个)
- **HelloWorld.java**：Java 程序入口示例，演示类结构、`main` 方法与注释写法。

### 2. 变量与基本数据类型 (`com.heima.varlable`，8 个)
- **VariableDemo1~8.java**：变量定义与使用、8 种基本数据类型、命名规则、注意事项、类型转换、`Scanner` 键盘录入，以及 BMI 等综合练习。

### 3. 运算符 (`com.heima.operator`，16 个)
- **OperatorDemo1~16.java**：算术运算符、数字拆分与时间换算、类型转换、ASCII 大小写转换、字符串拼接、赋值/关系/逻辑（含短路）运算符、三元运算符、运算符优先级，以及回文数、有缘数等综合练习。

### 4. 条件判断 if (`com.heima.ifdemo`，9 个)
- **IfDemo1~9.java**：单分支、双分支、多分支 `else if`，布尔判断、书写细节（大括号风格、分号陷阱），以及外卖比价、优惠券满减、充值分档、BMI 分级等综合实战。

### 5. 分支判断 switch (`com.heima.switchdemo`，6 个)
- **SwitchDemo1~6.java**：`switch` 基本语法、`case` 穿透与 `break`、`switch` 的多种写法及与 `if` 的对比应用。

### 6. for 循环 (`com.heima.loopfor`，7 个)
- **ForDemo1~7.java**：`for` 循环语法、执行流程、基本应用与练习（求和、计数、遍历等）。

### 7. while 循环 (`com.heima.loopwhile`，4 个)
- **WhileDemo1~4.java**：`while` 循环语法与应用，理解其与 `for` 的等价关系。

### 8. do...while 循环 (`com.heima.loopdowhile`，1 个)
- **DoWhileDemo.java**：`do...while` 语法，掌握"至少执行一次"的特点。

### 9. 死循环 (`com.heima.infiniteloop`，1 个)
- **InfiniteLoopDemo.java**：死循环的写法、成因及实际应用场景。

### 10. 嵌套循环 (`com.heima.looploop`，9 个)
- **Test1~9.java**：双重/多层循环的应用，如打印矩形、九九乘法表、图形打印等综合练习。

### 11. 循环控制 (`com.heima.controllerloop`，8 个)
- **BreakDemo1~3.java**：`break` 跳出循环、配合标记退出多层循环。
- **ContinueDemo1~3.java**：`continue` 结束本次循环，进入下一次。
- **Test1~2.java**：`break`/`continue` 综合练习。

### 12. 数组 (`com.heima.array`，15 个)
- **ArrayDemo1~5.java**：数组静态初始化、动态初始化、元素访问与修改、遍历、索引越界与边界检查。
- **ArrayTest1~6.java**：查找元素是否存在、求最大值、交换变量、打乱数组、生成不重复随机数、有序数组去重（快慢指针）。
- **ArraySelfTest.java**：生成不重复随机数的优化写法（`j < i` 查重）。
- **SelfTest1~3.java**：力扣算法练习——两数之和、合并有序数组（归并双指针）、搜索插入位置（二分查找）。

## 学习笔记（`笔记/` 目录）

| 笔记文件 | 对应内容 |
| --- | --- |
| 基本数据类型.md | 变量与 8 种基本数据类型 |
| 运算符.md | 各类运算符与优先级 |
| if语句.md | 条件判断 if/else |
| switch语句.md | switch 分支语句 |
| 循环loop.md | for / while / do...while / 嵌套循环 / break、continue |
| 数组Array.md | 数组语法、经典练习与算法 |

## 学习内容

### 核心知识点
1. **Java 程序结构**：类、方法、`main` 入口、注释。
2. **数据类型与变量**：8 种基本数据类型、定义使用、类型转换。
3. **运算符**：算术、赋值、关系、逻辑、三元及优先级。
4. **流程控制**：if/switch 分支，for/while/do...while 循环，嵌套循环，break/continue。
5. **数组**：初始化、访问、遍历，以及查找、去重、排序相关的经典算法练习。
6. **输入输出**：`System.out.println()`、`Scanner`。

### 编码规范
- 使用驼峰命名法（camelCase）。
- 类名首字母大写（`PascalCase`），方法名/变量名首字母小写。
- 常量全大写、下划线分隔。
- 代码遵循 K&R 大括号风格，缩进统一。

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
# 编译 Java 文件
javac -d out src/com/heima/helloworld/HelloWorld.java

# 运行程序
java -cp out com.heima.helloworld.HelloWorld
```

## 学习建议

1. **循序渐进**：按"入门 → 变量 → 运算符 → 分支 → 循环 → 数组"的顺序学习。
2. **动手实践**：每个示例都亲自运行和修改。
3. **理解原理**：不仅会写代码，还要理解背后的执行流程。
4. **配合笔记**：结合 `笔记/` 目录下的 Markdown 笔记复习巩固。
5. **多做练习**：尝试修改示例代码，观察不同结果。

## 项目特点

- **示例丰富**：每个知识点都有对应的代码示例（共 85 个源文件）。
- **注释详细**：代码中包含详细的中文注释与要点说明。
- **结构清晰**：按知识点分包组织，配有系统化笔记。
- **适合入门**：从最简概念起步，逐步深入到算法练习。

## 常见问题

### Q: 为什么我的代码运行出错？
A: 请检查：类名与文件名是否一致、是否缺少分号或括号、是否导入了必要的包（如 `java.util.Scanner`、`java.util.Random`）。

### Q: 如何查看代码运行结果？
A: 运行程序后，结果会显示在 IDE 的控制台或终端窗口中。

### Q: 数组访问报错 `ArrayIndexOutOfBoundsException`？
A: 索引超出了 `0 ~ 数组长度-1` 的范围，访问前应先做边界检查。

## 扩展学习

完成本项目后，可以继续学习：
- 面向对象编程（类、对象、封装、继承、多态）
- 方法与方法重载
- 集合框架（List、Set、Map）
- 异常处理、文件 IO、多线程编程

## 许可证

本项目仅供学习使用。
