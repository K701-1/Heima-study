# 循环结构笔记

---

## 一、for 循环

### 1.1 基本语法

```java
for(初始化语句; 条件判断语句; 条件控制语句) {
    循环体语句;
}
```

- **初始化语句**：循环开始的条件
- **条件判断语句**：控制循环是否继续的条件
- **条件控制语句**：每次循环后执行的操作（如 i++）

### 1.2 示例：连续跳跃10次（ForDemo1）

```java
for(int i = 1; i <= 10; i++) {
    System.out.println("游戏人物在跳跃");
}
```

### 1.3 打印范围数据（ForDemo2）

```java
// 打印1-5
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}

// 打印5-1
for (int a = 5; a >= 1; a--) {
    System.out.println(a);
}
```

### 1.4 求和（ForDemo3）

```java
int sum = 0;
for (int i = 1; i <= 5; i++) {
    sum += i;
}
System.out.println("1-5之间的和是：" + sum);
```

### 1.5 求偶数和（ForDemo4）

```java
// 方法1：使用if判断
int sum = 0;
for(int i = 1; i <= 100; i++) {
    if (i % 2 == 0) {
        sum += i;
    }
}

// 方法2：优化写法，步长为2
for (int i = 2; i <= 100; i += 2) {
    sum += i;
}
```

### 1.6 统计个数（ForDemo5）

> 需求：统计范围中既能被3整除，又能被5整除的数字个数

```java
Scanner scanner = new Scanner(System.in);
System.out.println("请输入第一个数字：");
int num1 = scanner.nextInt();
System.out.println("请输入第二个数字：");
int num2 = scanner.nextInt();

int count = 0;
for (int i = num1; i <= num2; i++) {
    if (i % 3 == 0 && i % 5 == 0) {
        count++;
    }
}
System.out.println("既能被3整除，又能被5整除的数字个数为：" + count);
```

### 1.7 斐波那契数列（ForDemo6）

> 从第三项开始，每一项都是前两项数字的和：0,1,1,2,3,5,8,13,21,34...

```java
int a = 0;
int b = 1;
int c = 0;

for (int i = 3; i <= 10; i++) {
    c = a + b;
    a = b;
    b = c;
}
System.out.println("第10项是：" + c);
```

### 1.8 数列之和（ForDemo7）

> S(n) = 1 - 2 + 3 - 4 + ...

```java
Scanner scanner = new Scanner(System.in);
System.out.println("请输入n的值：");
int n = scanner.nextInt();

int sum = 0;
for (int i = 1; i <= n; i++) {
    if(i % 2 == 0) sum -= i;
    else sum += i;
}
System.out.println("数列前" + n + "项的和为：" + sum);
```

---

## 二、while 循环

### 2.1 基本语法

```java
初始化语句;
while(条件判断语句) {
    循环体语句;
    条件控制语句;
}
```

### 2.2 示例：跳跃10次（WhileDemo1）

```java
int i = 1;
while (i <= 10) {
    System.out.println("跳跃一次");
    i++;
}
```

### 2.3 for 与 while 的区别（WhileDemo2）

| 特点 | for 循环 | while 循环 |
|------|----------|------------|
| 变量作用域 | 控制循环的变量归属 for 结构，循环结束后无法访问 | 变量不属于 while 结构，循环结束后可以继续使用 |
| 适用场景 | 知道循环次数或循环范围 | 不知道循环次数，只知道循环结束条件 |

### 2.4 复利计算器（WhileDemo2）

> 银行投资100000元，复利1.7%，多少年后实现本金翻倍

```java
double money = 100000;
double expectMoney = 200000;

int year = 0;
while (money < expectMoney) {
    money += money * 0.017;
    year++;
}
System.out.println("需要" + year + "年实现本金翻倍");
```

### 2.5 纸张折叠问题（WhileDemo3）

> 0.1毫米的纸折叠多少次能超过8848.86米

```java
double paper = 0.1;
double mountHeight = 8848860;  // 单位：毫米

int count = 0;
while(paper < mountHeight) {
    paper = paper * 2;
    count++;
}
System.out.println("需要" + count + "次");
```

### 2.6 数位之和（WhileDemo4）

> 给定整数n，计算所有数位之和，若n为负数先计算其绝对值

```java
Scanner scanner = new Scanner(System.in);
System.out.println("请输入一个整数：");
int num = scanner.nextInt();
int sum = 0;

// 取绝对值
if (num < 0) {
    num = -num;
}

// 求和
while (num != 0) {
    sum = sum + num % 10;  // 获取个位
    num = num / 10;         // 去掉个位
}
System.out.println("数位之和为：" + sum);
```

---

## 三、do while 循环

### 3.1 基本语法

```java
初始化语句;
do {
    循环体语句;
    条件控制语句;
} while(条件判断语句);
```

### 3.2 特点

- **do while**：先执行后判断，**至少执行一次**
- **for/while**：先判断后执行，可能一次都不执行

### 3.3 示例（DoWhileDemo）

```java
int i = 1;
do {
    System.out.println("hello world");
    i++;
} while (i <= 5);
```

---

## 四、无限循环

### 4.1 三种写法

```java
// for 无限循环
for (;;) {
    System.out.println("我好帅");
}

// while 无限循环（最常用）
while (true) {
    System.out.println("我好帅");
}

// do while 无限循环
do {
    System.out.println("我好帅");
} while (true);
```

### 4.2 注意事项

- 无限循环后面**不能写任何代码**（因为永远不会执行到）

---

## 五、嵌套循环

### 5.1 嵌套循环原理

- 先看内循环，外循环是重复执行内循环

### 5.2 输出矩形（Test1）

```java
// 打印4行5列的矩形
for (int i = 1; i <= 4; i++) {
    for (int j = 1; j <= 5; j++) {
        System.out.print("*");
    }
    System.out.println();  // 换行
}
```

**输出结果：**
```
*****
*****
*****
*****
```

### 5.3 输出正三角形（Test2）

```java
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

**输出结果：**
```
*
**
***
****
*****
```

### 5.4 输出倒三角形（Test3）

```java
for (int i = 5; i >= 1; i--) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

**输出结果：**
```
*****
****
***
**
*
```

### 5.5 打印梯形（Test6）

```java
for (int i = 1; i <= 3; i++) {
    for (int j = i; j <= 2; j++) {
        System.out.print(" ");
    }
    for (int j = 1; j < 2*i+1; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

### 5.6 打印菱形（Test7）

```java
// 上半部分
for (int i = 1; i <= 3; i++) {
    for (int j = i; j <= 3; j++) {
        System.out.print(" ");
    }
    for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
    }
    System.out.println();
}

// 中间最长行
for (int j = 0; j < 7; j++) {
    System.out.print("*");
}
System.out.println();

// 下半部分
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(" ");
    }
    for (int j = 1; j <= 2 * (3 - i) + 1; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

### 5.7 打印99乘法表（Test8）

```java
for (int i = 1; i <= 9; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(j + "*" + i + "= " + (i * j) + "\t");
    }
    System.out.println();
}
```

### 5.8 制表符 \t（Test9）

```
制表符 \t 的作用：
- 简单理解：长度可变的大空格，打印表格类数据时，使其上下对齐
- 真正作用：在前面字符的后面补1-8个空格，让整体凑成8的整数倍
```

```java
System.out.println("name\t\tage\t\tgender");
System.out.println("zhangsan\t16\t\tnan");
System.out.println("lisi\t\t17\t\twoman");
```

---

## 六、循环控制

### 6.1 break 关键字

**作用**：不能单独出现，只能写在 **switch** 或 **循环** 中，表示**结束跳出**

#### 示例1：基础用法（BreakDemo1）

```java
for (int i = 0; i < 100; i++) {
    if (i == 15) {
        break;  // 当i等于15时跳出循环
    }
    System.out.println(i);
}
```

#### 示例2：输入验证（BreakDemo2）

> 使用 while(true) + break 实现输入验证

```java
// 循环+break解决负数问题
while (true) {
    System.out.println("请输入当前人物收到的伤害：");
    hurt = sc.nextInt();

    if (hurt > 0) {
        break;  // 输入正确，跳出循环
    } else {
        System.out.println("输入的伤害值必须为正数，请重新输入");
    }
}
```

#### 示例3：质数判断（BreakDemo3）

> 判断一个数是否为质数（只能被1和它本身整除的数）

```java
Scanner sc = new Scanner(System.in);
int num = 0;

while (true) {
    System.out.println("请输入一个大于2的整数：");
    num = sc.nextInt();
    if (num > 2) {
        break;
    } else {
        System.out.println("输入的数不大于2，请重新输入");
    }
}

int count = 0;
for (int i = 2; i < num - 1; i++) {  // 结束条件可以使用 Math.sqrt(num)
    if(num % i == 0) {
        count++;
        break;
    }
}

if(count == 0) {
    System.out.println(num + "是质数");
} else {
    System.out.println(num + "不是质数");
}
```

### 6.2 continue 关键字

**作用**：跳过本次循环，直接进入下一次循环

#### 示例1：基础用法（ContinueDemo1）

```java
for (int i = 0; i <= 10; i++) {
    if(i == 3) continue;  // 到3时，跳过本次循环
    System.out.println(i);
}
```

**输出结果**：0, 1, 2, 4, 5, 6, 7, 8, 9, 10（没有3）

#### 示例2：过7游戏（ContinueDemo2）

> 循环打印1-100，如果数字包含7或是7的倍数，输出"过"

```java
for (int i = 0; i <= 100; i++) {
    if (i % 7 == 0 || i / 10 % 10 == 7 || i % 10 == 7) {
        System.out.println("过");
        continue;
    }
    System.out.println(i);
}
```

#### 示例3：不含数字4（ContinueDemo3）

> 列出1到n之间所有不包含数字4又不是4的倍数的整数

```java
Scanner sc = new Scanner(System.in);
System.out.println("请输入一个整数：");
int n = sc.nextInt();
for (int i = 0; i <= n; i++) {
    if(i % 4 == 0 || i % 10 == 4 || i / 10 % 10 == 4 || 
       i / 100 % 10 == 4 || i / 1000 % 10 == 4 || 
       i / 10000 % 10 == 4 || i / 100000 % 10 == 4) continue;
    System.out.println(i);
}
```

---

## 七、综合练习

### 7.1 猜数字游戏（Test1）

> 生成1-100的随机数，一直猜直到猜中

```java
Random r = new Random();
int num = r.nextInt(1, 101);  // 生成1-100的随机数

while (true) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入你的猜测：");
    int guessNum = sc.nextInt();

    if(guessNum > num) System.out.println("猜大了");
    else if (guessNum < num) System.out.println("猜小了");
    else if (guessNum == num) {
        System.out.println("猜对了");
        break;
    }
}
```

**Random类常用方法：**
- `nextInt()` - 在int范围内随机取
- `nextInt(n)` - 在0到n之间随机取（不包含n）
- `nextInt(m, n)` - 在m到n之间随机取（包含m，不包含n）

### 7.2 猜数字游戏-保底版（Test2）

> 小保底：3次没猜中提示猜测范围  
> 大保底：10次没猜中直接猜中

```java
Random r = new Random();
int num = r.nextInt(1, 101);

int countA = 0;  // 小保底计数器
int countB = 0;  // 大保底计数器

while (true) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入你的猜测：");
    int guessNum = sc.nextInt();

    countA++;
    countB++;

    // 大保底机制：10次直接猜中
    if(countB == 10) {
        guessNum = num;
    }

    if(guessNum > num) System.out.println("猜大了");
    else if (guessNum < num) System.out.println("猜小了");
    else if (guessNum == num) {
        System.out.println("猜对了");
        break;
    }

    // 小保底机制：每3次没猜中提示范围
    if(countA % 3 == 0) {
        System.out.println("小保底触发，随机数字范围" + (num-5) + "~" + (num+5));
    }
}
```

---

## 八、循环选择指南

| 场景 | 推荐循环 |
|------|----------|
| 知道循环次数 | for |
| 不知道循环次数，知道结束条件 | while |
| 至少执行一次 | do while |
| 需要无限循环 | while(true) |
| 输入验证 | while(true) + break |

---

## 九、知识点总结

1. **三种循环可以互相转换**，选择哪种取决于具体场景
2. **break** 用于跳出整个循环
3. **continue** 用于跳过本次循环，继续下一次
4. **嵌套循环**的执行次数 = 外循环次数 × 内循环次数
5. **无限循环**后面不能写任何代码
6. 循环的快速生成方式：在 IDEA 中输入 `次数.fori` + 回车
