# Java 基础学习项目

这是一个Java基础学习项目，包含了Java编程入门的核心知识点和示例代码。项目适合Java初学者，通过实际代码示例来学习Java编程的基础概念。

## 项目结构
heima/ 
├── src/ # 源代码目录 
│ └── com/ 
│ └── heima/ 
│ ├── helloworld/ # Java入门示例 
│ ├── operator/ # 运算符示例 
│ └── varlable/ # 变量示例 
├── 笔记/ # 学习笔记 
├── .gitignore # Git忽略文件 
└── README.md # 项目说明文档
## 模块说明

### 1. HelloWorld入门 (`com.heima.helloworld`)
- **HelloWorld.java**: Java程序的入口示例，演示基本的程序结构和输出语句

### 2. 运算符示例 (`com.heima.operator`)
- **OperatorDemo1.java**: 算术运算符演示（+、-、*、/、%）
- **OperatorDemo2.java**: 赋值运算符演示
- **OperatorDemo3.java**: 自增自减运算符演示
- **OperatorDemo4.java**: 关系运算符演示
- **OperatorDemo5.java**: 类型转换演示
- **OperatorDemo6.java**: 逻辑运算符演示
- **OperatorDemo7.java**: 三元运算符演示

### 3. 变量示例 (`com.heima.varlable`)
- **VariableDemo1.java**: 变量基本概念和使用
- **VariableDemo2.java**: 变量数据类型演示
- **VariableDemo3.java**: 变量命名规则
- **VariableDemo4.java**: 变量作用域
- **VariableDemo5.java**: 常量演示
- **VariableDemo6.java**: 数据类型转换
- **VariableDemo7.java**: 键盘输入演示
- **VariableDemo8.java**: 综合练习

## 学习内容

### 核心知识点
1. **Java程序结构**: 类、方法、主程序入口
2. **数据类型**: 整数、浮点数、字符、布尔类型
3. **变量**: 定义、命名、作用域、类型转换
4. **运算符**: 算术、赋值、关系、逻辑、三元运算符
5. **输入输出**: System.out.println()、Scanner类

### 编码规范
- 使用驼峰命名法（camelCase）
- 类名首字母大写
- 方法名首字母小写
- 常量全大写，下划线分隔

## 运行项目

### 环境要求
- JDK 8 或更高版本
- IntelliJ IDEA（推荐）或其他Java IDE

### 运行步骤
1. 使用IntelliJ IDEA打开项目
2. 等待项目索引完成
3. 右键点击要运行的Java文件
4. 选择"Run"或"Debug"运行程序

### 命令行运行
bash
编译Java文件
javac -d out src/com/heima/helloworld/HelloWorld.java
运行程序
java -cp out com.heima.helloworld.HelloWorld

## 学习建议

1. **循序渐进**: 从HelloWorld开始，逐步学习各个知识点
2. **动手实践**: 每个示例都要亲自运行和修改
3. **理解原理**: 不仅要会写代码，还要理解背后的原理
4. **多做练习**: 尝试修改示例代码，观察不同的结果
5. **记录笔记**: 将学习过程中的重点和难点记录下来

## 项目特点

- **示例丰富**: 每个知识点都有对应的代码示例
- **注释详细**: 代码中包含详细的中文注释
- **结构清晰**: 按知识点分类组织代码
- **适合入门**: 从最简单的概念开始，逐步深入

## 常见问题

### Q: 为什么我的代码运行出错？
A: 请检查：
- 类名和文件名是否一致
- 是否缺少分号或括号
- 是否导入了必要的包

### Q: 如何查看代码运行结果？
A: 运行程序后，结果会显示在IDE的控制台或终端窗口中。

### Q: 如何修改示例代码？
A: 直接编辑对应的.java文件，保存后重新运行即可。

## 扩展学习

完成本项目后，可以继续学习：
- 面向对象编程（类、对象、继承、多态）
- 数组和集合
- 异常处理
- 文件IO操作
- 多线程编程

## 贡献指南

欢迎提交Issue和Pull Request来改进这个学习项目！

## 许可证

本项目仅供学习使用。
