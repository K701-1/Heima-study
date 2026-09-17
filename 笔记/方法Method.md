# Java 方法学习笔记

## 一、方法的基本概念

### 1.1 什么是方法

方法是**将一段具有独立功能的代码封装起来**，需要时通过"方法名"调用执行，是可以重复使用的代码单元。

### 1.2 方法的好处

- **代码复用**：同一段逻辑写一次，多处调用。
- **提高可读性**：把大段代码拆成有名字的小块，逻辑更清晰。
- **提高可维护性**：功能修改只需改方法内部一处即可。

---

## 二、方法的定义与调用

**对应文件：`MethodDemo1.java`**

### 2.1 语法格式

```java
// 定义格式
public static 返回值类型 方法名(参数1, 参数2, ...) {
    方法体;
    return 返回值;
}

// 调用格式
方法名(实参1, 实参2, ...);   // 实参要与形参一一对应（个数、类型）
```

### 2.2 示例：求两个数的和

```java
public static void main(String[] args) {
    // 调用方式一：用变量接收返回值
    int result = getSum(10, 20);
    System.out.println(result);        // 30

    // 调用方式二：直接打印返回值
    System.out.println(getSum(10, 20)); // 30
}

public static int getSum(int num1, int num2) {
    int sum = num1 + num2;
    return sum;
}
```

### 2.3 ⚠️ 注意事项

- **方法和方法之间是平级关系，不能嵌套**，即方法不能写在 `main` 方法内部。
- **方法需要被调用才会执行**内部代码，只定义不调用不会有任何输出。
- 调用时**实参要与形参一一对应**（个数相同、类型匹配）。

### 2.4 return 的作用

`return` 只能出现在方法中，有两个作用：

1. **结束方法**：执行到 `return` 时方法立即结束。
2. **返回值**：把后面的结果返回给调用处。

> 一个方法里可以有多个 `return`，但只要执行到其中一个，方法就直接结束（后面的代码不再运行）。

---

## 三、如何定义一个方法（三步法）

**对应文件：`MethodDemo5.java`**

面对一段代码，判断并设计方法时，遵循以下三步：

| 步骤 | 思考的问题 | 确定内容 |
|------|-----------|---------|
| 第 1 步 | 大段代码中，是否有重复使用的**独立功能**？ | 是否需要定义方法 |
| 第 2 步 | 这个独立功能，需要**什么数据**才能完成？ | 确定形参 |
| 第 3 步 | 调用处**是否需要这个结果**去做其他事？ | 确定是否需要返回值 |

### 示例：比较两个长方形面积大小

```java
public static void main(String[] args) {
    // 调用方法分别求面积，再比较结果
    double area1 = compareArea(10.1, 20.1);
    double area2 = compareArea(10.1, 2.1);

    if (area1 > area2) System.out.println("面积1更大");
    else if (area1 < area2) System.out.println("面积2更大");
    else System.out.println("面积相等");
}

// "求面积"是可复用的独立功能，需要长和宽 → 形参，结果要拿来比较 → 需要返回值
public static double compareArea(double len, double wid) {
    return len * wid;
}
```

**分析过程：**
- 求面积是被重复使用的独立功能 → 值得抽成方法。
- 求面积需要"长、宽"两个数据 → 形参为 `double len, double wid`。
- 求出的面积要拿回 `main` 里做比较 → 需要 `return`，返回类型为 `double`。

---

## 四、无返回值的方法（void）

当方法**只是完成一个动作、不需要把结果返回给调用处**时，返回值类型写 `void`。

### 4.1 示例：按格式遍历数组

**对应文件：`MethodDemo3.java`**

**需求：** 定义方法遍历数组，输出格式为 `[1, 2, 3, 4, 5]`。

```java
public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    printArr(arr);   // 直接调用，无需接收结果
}

// 没有返回值，返回值类型写 void
public static void printArr(int[] arr) {
    System.out.print("[");
    for (int i = 0; i < arr.length; i++) {
        if (i == arr.length - 1) {
            // 最后一个元素后面不加逗号
            System.out.print(arr[i]);
        } else {
            System.out.print(arr[i] + ", ");
        }
    }
    System.out.println("]");
}
```

**要点：**
- 输出用 `print`（不换行），最后一步才用 `println`，保证结果在同一行。
- 通过 `i == arr.length - 1` 判断最后一个元素，避免末尾多出逗号。

### 4.2 示例：无参方法打印九九乘法表

**对应文件：`MethodDemo4.java`**

**需求：** 定义方法打印九九乘法表。

```java
public static void main(String[] args) {
    printMultiTable();   // 无参方法，调用时括号内为空
}

// 没有参数：形参位置空着；没有返回值：写 void
public static void printMultiTable() {
    for (int i = 1; i <= 9; i++) {
        for (int j = 1; j <= i; j++) {          // j <= i，保证是"下三角"
            System.out.print(j + " * " + i + " = " + (i * j) + "\t");
        }
        System.out.println();                     // 每打印完一行换行
    }
}
```

**要点：**
- **没有参数**的方法，形参列表空着，调用时实参也为空 `()`。
- 内层循环条件 `j <= i`，让每行的列数随行号递增，形成三角形。
- `\t` 是制表符，用于对齐每一格；内层结束后 `println()` 换行。

> 小结：`MethodDemo3`（有参、void）、`MethodDemo4`（无参、void）、`MethodDemo1`（有参、有返回值）组合起来，覆盖了"参数有无"与"返回值有无"四种基本形态。

---

## 五、方法的应用：数组查重

**对应文件：`MethodDemo2.java`**

**需求：** 获取 10 个 `1~100` 之间的随机数存入数组，保证数据唯一（去除重复元素）。

**思路：** 生成一个随机数 → 调用方法判断数组中是否已存在 → 不存在才存入，存在则重新生成。

```java
public static void main(String[] args) {
    int[] arr = new int[10];
    Random r = new Random();

    for (int i = 0; i < arr.length; ) {   // i 为写入指针，注意第三部分为空
        int num = r.nextInt(100) + 1;

        // 调用方法，判断 num 是否已存在于数组中
        boolean flag = contains(num, arr);

        if (flag) {              // 不存在（未重复）才写入
            arr[i] = num;
            i++;                 // ⚠️ 只有成功写入后，i 才自增
        }
    }

    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}

// 定义方法：判断 num 是否在 arr 中存在
public static boolean contains(int num, int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        if (num == arr[i]) {
            return true;    // 一找到相同元素，立即返回 true，方法结束
        }
    }
    return false;           // 整个循环走完都没找到，返回 false
}
```

**⚠️ 关键陷阱：`i++` 的位置**
- `contains` 判断的是"是否重复"，返回 `true` 表示**已存在（重复）**。此处逻辑要对应好：只有生成了满足要求的新数，写入指针 `i` 才向后移动。
- 如果把 `i++` 写在 `for` 的第三部分，那么每循环一次 `i` 都自增，但遇到重复数时该位置并没有真正写入有效数据，仍是默认值 `0`，最终数组会出现大量 `0`。
- **正确做法：** 把 `i++` 移到"确认数据有效并写入之后"。

**`return` 在查重方法中的体现：**
- `contains` 里一旦匹配成功就 `return true`，方法**立刻结束**，不再继续循环——这正是 `return` "结束方法"作用的典型应用。
- 循环正常结束仍未返回，说明没找到，最后 `return false`。

---

## 六、方法的重载

**对应文件：`MethodDemo6.java`**

### 6.1 概念

**方法重载（Overload）：** 在**同一个类**中，定义多个**同名**方法，它们的**参数列表不同**，编译器根据调用时传入的实参自动匹配对应的方法。

### 6.2 判断重载的三个依据（参数列表不同）

| 依据 | 说明 |
|------|------|
| 参数**类型**不同 | `getSum(int, int)` 与 `getSum(double, double)` |
| 参数**个数**不同 | `getSum(int, int)` 与 `getSum(int, int, int)` |
| 参数**顺序**不同 | `getSum(int, double)` 与 `getSum(double, int)` |

> ⚠️ **仅返回值类型不同，不能构成重载。** 编译器无法根据返回值区分调用，会报错。

### 6.3 示例

```java
public static void main(String[] args) {
    int a = 10;
    int b = 20;

    // 调用形参、实参数据类型一一对应的方法
    // （IDEA 中点击调用的方法，会高亮显示匹配到的重载）
    System.out.println(getSum(a, b));   // 匹配 getSum(int, int)
}

public static int getSum(int a, int b) {
    return a + b;
}

public static double getSum(int a, double b) {
    return a + b;
}

public static double getSum(double a, double b) {
    return a + b;
}
```

### 6.4 ⚠️ 重载的歧义陷阱

当传入的两个参数**需要同时发生类型转换**才能匹配不同重载时，编译器无法二选一，会**报错**。

```java
// 同时保留下面两个方法，调用 getSum(10, 20) 时：
// int 既可匹配 (int, double)，也可匹配 (double, int)，产生歧义 → 编译报错
public static double getSum(int a, double b) { return a + b; }
// public static double getSum(double a, int b) { return a + b; }  // 二选一保留即可
```

**规避方法：** 出现歧义的两个重载**二选一保留**，或调整为不会产生歧义的参数列表。

---

## 七、总结

| 知识点 | 要点 | 对应文件 |
|--------|------|---------|
| 方法的好处 | 代码复用，提高可读性、可维护性 | MethodDemo1 |
| 定义/调用格式 | `public static 返回类型 方法名(参数){...}`，实参与形参一一对应 | MethodDemo1 |
| 注意事项 | 方法平级、不能嵌套、需被调用才执行 | MethodDemo1 |
| return 作用 | 结束方法，并返回结果 | MethodDemo1 / MethodDemo2 |
| 定义方法三步法 | 看独立功能 → 定形参 → 定是否返回 | MethodDemo5 |
| 有返回值方法 | 返回值类型写具体类型，用 `return` 返回 | MethodDemo1 / MethodDemo5 |
| 无返回值方法 | 返回值类型写 `void` | MethodDemo3 / MethodDemo4 |
| 无参方法 | 形参空着，调用时 `()` 内为空 | MethodDemo4 |
| 方法做数组查重 | 抽成 `contains` 方法，`i++` 只在成功写入后自增 | MethodDemo2 |
| 方法重载 | 同名、参数列表不同（类型/个数/顺序），返回值不同不算重载 | MethodDemo6 |

---

## 附：方法定义的四种形态速查

| 是否带参数 | 是否有返回值 | 定义写法示例 | 对应文件 |
|-----------|-------------|-------------|---------|
| 有参、有返回值 | ✔ ✔ | `public static int getSum(int a, int b){ return a+b; }`、`public static boolean contains(int num, int[] arr){ ... }` | MethodDemo1 / MethodDemo2 / MethodDemo5 / MethodDemo6 |
| 有参、无返回值 | ✔ ✘ | `public static void printArr(int[] arr){ ... }` | MethodDemo3 |
| 无参、无返回值 | ✘ ✘ | `public static void printMultiTable(){ ... }` | MethodDemo4 |
| 无参、有返回值 | ✘ ✔ | `public static double getPI(){ return 3.14; }`（示例，本批 Demo 未直接涉及） | —— |

---
*学习整理：基于 `src/com/basic/method` 目录下 6 个示例文件（MethodDemo1 ~ MethodDemo6）*
