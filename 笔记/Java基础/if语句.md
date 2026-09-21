# Java if 语句学习笔记

## 一、if 语句的基本语法

### 1.1 单条件 if 语句

**语法格式：**
```java
if (条件表达式) {
    // 条件为true时执行的代码
}
```

**执行流程：**
- 如果条件表达式为 `true`，执行大括号内的代码
- 如果条件表达式为 `false`，跳过大括号内的代码

### 1.2 基本示例

**示例：体温判断**
```java
public class TemperatureCheck {
    public static void main(String[] args) {
        double temp = 38.5;
        
        if (temp >= 38) {
            System.out.println("请自我隔离");
        }
    }
}
```

**示例：判断布尔类型变量**
```java
public class BooleanCheck {
    public static void main(String[] args) {
        boolean b = false;
        
        if (b) {
            System.out.println("为真");
        }
    }
}
```

---

## 二、if 语句的实际应用

### 2.1 游戏血量系统

**需求：**
- 初始最大生命200点
- 受到伤害后血量减少
- 血量不能低于1点
- 技能恢复血量后不能超过200点

**实现代码：**
```java
import java.util.Scanner;

public class GameHealthSystem {
    public static void main(String[] args) {
        int Hp = 200;
        
        System.out.println("请输入当前人物受到的伤害：");
        Scanner sc = new Scanner(System.in);
        int hurt = sc.nextInt();
        
        // 计算受到伤害后的血量
        Hp = Hp - hurt;
        
        // 限制血量最小值为1
        if (Hp <= 0) {
            Hp = 1;
        }
        System.out.println("当前人物剩余血量：" + Hp);
        
        System.out.println("请输入技能恢复的血量：");
        int add = sc.nextInt();
        
        // 计算恢复后的血量
        Hp = Hp + add;
        
        // 限制血量最大值为200
        if (Hp > 200) {
            Hp = 200;
        }
        System.out.println("当前人物剩余血量：" + Hp);
    }
}
```

**关键点：**
- 使用 `if` 语句限制数值范围
- 多个 `if` 语句可以连续使用
- 每个 `if` 语句独立判断

---

## 三、if 语句的细节与规范

### 3.1 大括号的位置风格

#### K&R 风格（紧凑风）- Java推荐

**特点：** 左括号写在上一行的末尾

```java
if (condition) {
    // 代码体
}
```

**历史背景：**
- 由创造C语言的两位大神提出
  - 布莱恩·克尼汉（Brian Kernighan）
  - 丹尼斯·里奇（Dennis Ritchie）
- 在《The C Programming Language》书中使用
- 取两人名字首字母命名为 K&R 风格

**使用场景：**
- Java（Oracle官方示例）
- Go语言
- 谷歌编码规范
- Spring框架

#### Allman 风格（折叠风）

**特点：** 左括号另起一行

```java
if (condition)
{
    // 代码体
}
```

**历史背景：**
- 由BSD UNIX操作系统的主要开发者艾瑞克·奥尔曼（Eric Allman）提出

**使用场景：**
- C#语言（微软官方推荐）
- C++（部分项目和编码规范）
- 某些JavaScript项目（如ESLint配置）
- 代码格式化工具支持（Artistic Style、Uncrustify、Pretty Diff等）

#### 风格对比总结

| 特点 | K&R风格（紧凑风） | Allman风格（折叠风） |
|------|------------------|--------------------|
| **左括号位置** | 写在上一行末尾 | 独立另起一行 |
| **代码紧凑度** | 紧凑，节省垂直空间 | 宽松，代码结构更清晰 |
| **阅读体验** | 适合快速浏览代码 | 适合详细调试和审查 |
| **主要使用语言** | Java、Go、C、JavaScript | C#、C++、部分JavaScript项目 |
| **代表框架/规范** | Spring框架、谷歌编码规范 | 微软官方规范、BSD UNIX |
| **代码示例** | `if (x > 0) {` | `if (x > 0)`\n`{` |
| **适用场景** | 日常开发、快速编码 | 大型项目、团队协作、代码审查 |

**选择建议：**
- **Java开发**：推荐使用K&R风格（Java官方规范）
- **C#开发**：推荐使用Allman风格（微软官方规范）
- **团队项目**：遵循团队或项目的编码规范
- **个人项目**：选择自己更习惯、更易读的风格

### 3.2 大括号的省略规则

**规则：** 如果大括号中语句体**只有一行**，大括号可以省略

```java
// 完整写法
if (temp >= 38) {
    System.out.println("请自我隔离");
}

// 省略大括号（只有一行语句时）
if (temp >= 38) 
    System.out.println("请自我隔离");

// 更紧凑的写法
if (temp >= 38) System.out.println("请自我隔离");
```

**建议：** 为了代码可读性和维护性，建议始终使用大括号

### 3.3 常见错误

#### 错误1：小括号后面加分号

```java
// 错误写法
if (temp >= 38);  // 分号会结束if语句
{
    System.out.println("请自我隔离");  // 这行总会执行
}

// 正确写法
if (temp >= 38) {
    System.out.println("请自我隔离");
}
```

**问题分析：**
- 分号 `;` 会被视为一个空语句
- 大括号内的代码变成普通代码块，总会执行
- 逻辑错误，编译器不会报错

#### 错误2：布尔变量判断

```java
// 错误写法
boolean b = true;
if (b == true) {  // 冗余
    System.out.println("为真");
}

// 正确写法
if (b) {  // 直接使用布尔变量
    System.out.println("为真");
}
```

---

## 四、if 语句的应用场景

### 4.1 数据验证

```java
// 验证用户输入的年龄
int age = 15;

if (age >= 18) {
    System.out.println("已成年，可以注册");
}

if (age < 0 || age > 150) {
    System.out.println("年龄输入有误");
}
```

### 4.2 范围限制

```java
// 限制成绩在0-100之间
int score = 85;

if (score < 0) {
    score = 0;
}

if (score > 100) {
    score = 100;
}
```

### 4.3 状态判断

```java
// 判断是否为闰年
int year = 2024;

if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
    System.out.println(year + "年是闰年");
}
```

---

## 五、总结

| 知识点 | 要点 |
|-------|------|
| 基本语法 | `if (条件) { 代码 }` |
| 执行流程 | 条件为true执行，为false跳过 |
| 大括号风格 | K&R风格（推荐）vs Allman风格 |
| 大括号省略 | 只有一行语句时可省略 |
| 常见错误 | 小括号后加分号、布尔变量判断冗余 |
| 应用场景 | 数据验证、范围限制、状态判断 |

---

*学习日期：2026年7月28日*