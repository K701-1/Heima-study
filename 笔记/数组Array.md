# Java 数组学习笔记

## 一、数组的基本概念

### 1.1 什么是数组

数组是**同一种数据类型**的多个数据值组成的集合，可以理解为一个"容器"，能批量存储、批量处理数据。

- 在没有数组时，存储 5 个同学的身高需要 5 个变量；有了数组，只需一个数组名即可。
- 数组中的每个元素都可以通过**索引（编号）** 来访问。

### 1.2 索引规则

- 索引（下标）从 **0** 开始，表示数组元素的位置编号。
- 索引范围为：`0 ~ 数组长度-1`。

```
数组：   {10, 20, 30, 40, 50}
索引：    0   1   2   3   4
```

### 1.3 数组的两种初始化方式

| 方式 | 说明 | 特点 |
|------|------|------|
| 静态初始化 | 由元素确定数组内容和长度 | 创建时就写好具体数据 |
| 动态初始化 | 由长度确定数组，元素取默认值 | 只指定长度，内容后续填充 |

---

## 二、数组的静态初始化

**对应文件：`ArrayDemo1.java`**

### 2.1 语法格式

```java
// 完整格式：数据类型[] 数组名 = new 数据类型[]{元素1, 元素2, ...};
// 简写格式：数据类型[] 数组名 = {元素1, 元素2, ...};
```

> 注意：简写格式**必须写在定义这一行**，不能先定义再用 `= {}` 赋值（那样会编译报错）。

### 2.2 示例

```java
// 定义数组存储 3 位同学年龄
int[] ageArr1 = new int[]{18, 19, 20};  // 完整格式
int[] ageArr2 = {18, 19, 20};           // 简写格式

// 定义数组存储 5 位同学身高
double[] heightArr = {1.75, 1.76, 1.77, 1.78, 1.79};

// 定义数组存储 3 位同学姓名
String[] nameArr = {"zhangsan", "lisi", "wangwu"};
```

---

## 三、数组元素的访问

**对应文件：`ArrayDemo2.java`**

### 3.1 获取元素

**格式：** `数组名[索引]`

```java
int[] arr = {10, 20, 30, 40, 50};
System.out.println(arr[0]);  // 10
```

### 3.2 修改元素

**格式：** `数组名[索引] = 新值`

```java
arr[0] = 100;
System.out.println(arr[0]);  // 100
```

---

## 四、数组的遍历

**对应文件：`ArrayDemo3.java`**

### 4.1 for 循环遍历

**关键：`arr.length` 获取数组长度（元素个数）。**

```java
int[] arr = {10, 20, 30, 40, 50};

for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

> IDEA 快速生成技巧：输入 `数组名.fori` 再按回车，可自动生成遍历循环。

### 4.2 foreach 增强 for 循环（补充）

只需要元素、不关心索引时，可用增强 for 循环，更简洁：

```java
for (int num : arr) {
    System.out.println(num);
}
```

---

## 五、数组的动态初始化

**对应文件：`ArrayDemo4.java`**

### 5.1 语法格式

```java
// 完整格式：数据类型[] 数组名 = new 数据类型[数组长度];
int[] arr = new int[5];
```

### 5.2 默认值规则

数组创建后，元素会自动带上**默认值**：

| 数据类型 | 默认值 |
|---------|--------|
| `int` / `byte` / `short` / `long` | `0` |
| `double` / `float` | `0.0` |
| `char` | `'\u0000'`（空格） |
| `boolean` | `false` |
| 引用类型（如 `String`） | `null` |

### 5.3 示例：键盘录入填充数组

```java
Scanner sc = new Scanner(System.in);
int[] arr = new int[5];

// 赋值：创建后数组内默认值为 0
for (int i = 0; i < arr.length; i++) {
    System.out.println("请输入一个整数：");
    int num = sc.nextInt();
    arr[i] = num;
}

// 遍历输出
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

---

## 六、数组的常见问题：索引越界

**对应文件：`ArrayDemo5.java`**

### 6.1 异常说明

访问数组时如果索引超出 `0 ~ 数组长度-1` 的范围，会抛出：

```
ArrayIndexOutOfBoundsException（数组索引越界异常）
```

### 6.2 边界检查规范

访问数组元素前，应先判断索引是否合法：

```java
int[] arr = {10, 20, 30, 40, 50};
int index = 10;

if (index >= 0 && index < arr.length) {
    System.out.println(arr[index]);
} else {
    System.out.println("索引越界，无效索引：" + index);
}
```

> 补充：如果数组变量本身为 `null` 却去访问元素，会抛 `NullPointerException`（空指针异常）。使用前应确保数组已被正确初始化。

---

## 七、数组经典练习

### 7.1 查找元素是否存在

**对应文件：`ArrayTest1.java`**

**需求：** 已知数组 `{33, 5, 22, 44, 55, 33}`，键盘录入一个数据，查找是否存在；若出现多次只取第一次的索引；存在打印索引，不存在提示"该数据不存在"。

```java
int[] arr = {33, 5, 22, 44, 55, 33};

Scanner sc = new Scanner(System.in);
System.out.println("请输入一个数据：");
int num = sc.nextInt();

// 标记：false 表示不存在，true 表示存在
boolean flag = false;

for (int i = 0; i < arr.length; i++) {
    if (arr[i] == num) {
        System.out.println(i);   // 打印第一次匹配的索引
        flag = true;
        break;                   // 只取第一次，找到即退出
    }
}

if (!flag) {
    System.out.println("该数据不存在");
}
```

**要点：**
- 用 `boolean flag`（或计数器 `count`）标记"是否找到"。
- `break` 保证"出现多次只取第一次的索引"。
- 判断放在循环**外**，避免每次循环都输出"不存在"。

### 7.2 求数组最大值

**对应文件：`ArrayTest2.java`**

```java
int[] arr = {33, 5, 44, 55, 22};

// max 初始化为数组的第一个元素，而不是 0
int max = arr[0];

for (int i = 0; i < arr.length; i++) {
    if (arr[i] > max) {
        max = arr[i];
    }
}
System.out.println(max);
```

**两个重要细节：**
- **细节一：** 循环从 `i = 0` 开始对结果没影响，但会多比较一次，可优化为 `i = 1`（因为 `max` 已是 `arr[0]`）。
- **细节二：** `max` 初始化**不能写 0**。若数组全是负数，0 会被误当成最大值；应初始化为数组中的某个元素（通常 `arr[0]`）。

### 7.3 交换两个变量（数组元素交换的前置练习）

**对应文件：`ArrayTest3.java`**

```java
int a = 10;
int b = 20;

int temp = a;   // 第三方变量暂存 a
a = b;
b = temp;

System.out.println(a);  // 20
System.out.println(b);  // 10
```

> 核心思想：交换必须借助**第三方变量 `temp`** 暂存，否则数据会丢失。这是后面"打乱数组"操作的基础。

### 7.4 打乱数组元素

**对应文件：`ArrayTest4.java`**

**需求：** 已知数组 `{8,2,3,4,5,6,7,1,9,10}`，打乱数组中的数据。

```java
int[] arr = {8, 2, 3, 4, 5, 6, 7, 1, 9, 10};
Random r = new Random();

for (int i = 0; i < arr.length; i++) {
    // i 是当前索引，arr[i] 是当前元素
    int randomIndex = r.nextInt(arr.length);  // 获得一个随机索引

    // 拿当前位置元素与随机位置元素交换（借助 temp）
    int temp = arr[i];
    arr[i] = arr[randomIndex];
    arr[randomIndex] = temp;
}

for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
}
```

**要点：**
- `Random` 需 `import java.util.Random;`。
- `r.nextInt(n)` 生成 `[0, n)` 范围的随机整数，正好对应合法索引。

### 7.5 生成不重复的随机数存入数组

**对应文件：`ArrayTest5.java`、`ArraySelfTest.java`**

**需求：** 获取 10 个随机数存入数组，保证数据唯一。

**思路：** 生成一个随机数 → 判断数组中是否已存在 → 不存在才存入，存在则重新生成。

```java
int[] arr = new int[10];
Random r = new Random();

// 注意：for 的第三部分 i++ 被移到循环体内
for (int i = 0; i < arr.length; ) {
    int num = r.nextInt(100) + 1;   // 1~100 随机数

    // 判断 num 是否已存在
    int count = 0;
    for (int j = 0; j < arr.length; j++) {
        if (num == arr[j]) {
            count++;
            break;                  // 一旦发现重复，跳出内循环
        }
    }

    if (count == 0) {         // 不存在重复才存入
        arr[i] = num;
        i++;                  // 只有成功存入，i 才自增
    }
}
```

**⚠️ 关键陷阱：`i++` 的位置**
- 如果把 `i++` 写在 `for` 的第三部分（`for(int i=0; i<arr.length; i++)`），那么每次循环 `i` 都会自增，但重复的随机数并没有真正存入数组，该位置仍是默认值 `0`。
- 结果就是数组出现大量 `0`（例：`7 79 86 0 59 76 80 56 4 43`）。
- **正确做法：** 把 `i++` 移到"确认不重复并写入之后"，保证只有填好一个有效元素，指针才向后移动。

**优化（对应 `ArraySelfTest.java`）：** 内层查重循环只需遍历**已存入的部分** `j < i`，而不必遍历整个数组，效率更高：

```java
for (int j = 0; j < i; j++) {   // 只和已填入的前 i 个元素比较
    if (num == arr[j]) {
        count++;
        break;
    }
}
```

### 7.6 去除有序数组的重复元素（快慢指针）

**对应文件：`ArrayTest6.java`**

**需求：** 去除**递增有序**数组 `{1,1,2,2,2,2,3,3,3,3}` 中的重复元素。

```java
int[] arr = {1, 1, 2, 2, 2, 2, 3, 3, 3, 3};

int slow = 0;   // 慢指针：指向去重后结果的最后一个元素
int fast = 1;   // 快指针：负责向前探测新元素

while (fast < arr.length) {
    if (arr[slow] != arr[fast]) {   // 遇到不同的元素
        slow++;
        arr[slow] = arr[fast];      // 把新元素接到去重区后面
    }
    fast++;                          // 快指针始终前进
}

// 有效结果区间为 0 ~ slow
for (int i = 0; i <= slow; i++) {
    System.out.print(arr[i] + " ");   // 输出：1 2 3
}
```

**要点：**
- 快慢指针适用于**已排序**数组：重复元素一定相邻。
- `slow` 维护"不重复区"的末尾，`fast` 寻找下一个不同元素。
- 输出时循环条件是 `i <= slow`（长度 = `slow + 1`）。

---

## 八、力扣算法练习

### 8.1 两数之和

**对应文件：`SelfTest1.java`**

**题目：** 给定整数数组 `nums` 和目标值 `target`，找出和为 `target` 的两个数，输出它们的索引。先用两层循环即可。

```java
// 要求1：只输出第一对满足条件的索引
public static void firstPair(int[] nums, int target) {
    for (int i = 0; i < nums.length - 1; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] == target) {
                System.out.println(i + "," + j);
                return;               // 找到第一对立即结束
            }
        }
    }
    System.out.println("无解");
}

// 要求2：输出所有满足条件的索引对
public static void allPairs(int[] nums, int target) {
    boolean found = false;
    for (int i = 0; i < nums.length - 1; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] == target) {
                System.out.println(i + "," + j);
                found = true;         // 不 return，继续找下一对
            }
        }
    }
    if (!found) System.out.println("无解");
}
```

**要点：**
- 内层 `j = i + 1` 起始，避免自己和自己配对，也避免重复组合。
- 只要第一对：找到后 `return`；要找所有对：用 `found` 标记、不 `return`。
- 示例：`nums = [2,7,11,15], target = 9` → 输出 `0,1`。

### 8.2 合并有序数组（归并双指针）

**对应文件：`SelfTest2.java`**

**题目：** 两个有序数组合并为一个有序大数组。

```java
public static int[] merge(int[] arr1, int[] arr2) {
    int[] arr3 = new int[arr1.length + arr2.length];
    int i = 0, j = 0, k = 0;   // i、j 扫描两个数组，k 指向结果位置

    // 两边都未走完时，较小者优先放入 arr3
    while (i < arr1.length && j < arr2.length) {
        if (arr1[i] <= arr2[j]) {
            arr3[k++] = arr1[i++];
        } else {
            arr3[k++] = arr2[j++];
        }
    }
    // 拷贝 arr1 剩余元素（若已走完则不执行）
    while (i < arr1.length) arr3[k++] = arr1[i++];
    // 拷贝 arr2 剩余元素
    while (j < arr2.length) arr3[k++] = arr2[j++];

    return arr3;
}
```

**要点：**
- 这就是"归并"的核心思想：**双指针**分别从两个数组头部比较，小的先放入。
- 主循环结束后，必有一个数组还有剩余，用后两个 `while` 把剩余段整体拷贝过去。
- `Arrays.toString(...)` 可方便打印数组内容。
- 示例：`[1,3,5,7,9]` + `[2,4,6,8,10]` → `[1,2,3,4,5,6,7,8,9,10]`。

### 8.3 搜索插入位置（二分查找）

**对应文件：`SelfTest3.java`**

**题目：** 递增有序数组和目标值，找到目标值打印索引；不存在则打印应插入的位置。

```java
public static int searchInsert(int[] nums, int target) {
    int left = 0, right = nums.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;   // 防止 left+right 溢出的写法
        if (nums[mid] == target) {
            return mid;              // 找到目标，返回索引
        } else if (nums[mid] < target) {
            left = mid + 1;          // 目标在右半区
        } else {
            right = mid - 1;         // 目标在左半区
        }
    }
    return left;   // 未找到：left 即为应插入的位置
}
```

**要点：**
- 前提必须是**有序数组**，时间复杂度 \(O(\log n)\)。
- 循环条件是 `left <= right`（带等号），否则会漏掉单元素区间。
- `mid = left + (right - left) / 2` 比 `(left + right) / 2` 更安全，可防止相加溢出。
- 循环结束仍未找到时，`left` 停下的位置就是应插入位置。
- 示例：`nums = [1,3,5,6]`，`target = 5` → `2`；`target = 2` → `1`；`target = 7` → `4`；`target = 0` → `0`。

---

## 九、常用数组相关 API（补充）

```java
import java.util.Arrays;

int[] arr = {3, 1, 2};

Arrays.toString(arr);        // 把数组转成字符串，便于打印："[3, 1, 2]"
Arrays.sort(arr);            // 升序排序：[1, 2, 3]
Arrays.equals(a, b);         // 判断两个数组内容是否相同
Arrays.copyOf(arr, 5);       // 拷贝并扩容为新长度
```

---

## 十、总结

| 知识点 | 要点 | 对应文件 |
|--------|------|---------|
| 静态初始化 | `int[] arr = {18, 19, 20};` | ArrayDemo1 |
| 动态初始化 | `int[] arr = new int[5];`（默认值 0） | ArrayDemo4 |
| 元素访问/修改 | `arr[索引]`、`arr[索引] = 新值` | ArrayDemo2 |
| 数组遍历 | `for` + `arr.length`，或 foreach | ArrayDemo3 |
| 索引越界 | 合法范围 `0 ~ length-1`，访问前做边界检查 | ArrayDemo5 |
| 查找元素 | `boolean flag` 标记 + `break` | ArrayTest1 |
| 求最大值 | `max` 初始化为 `arr[0]`，不能为 0 | ArrayTest2 |
| 数据交换 | 借助第三方变量 `temp` | ArrayTest3 / ArrayTest4 |
| 不重复随机数 | 双重循环查重，`i++` 只在成功存入后自增 | ArrayTest5 / ArraySelfTest |
| 去重（有序） | 快慢指针，结果区间 `0 ~ slow` | ArrayTest6 |
| 两数之和 | 双层循环，`j = i + 1` | SelfTest1 |
| 合并有序数组 | 归并双指针 + 拷贝剩余段 | SelfTest2 |
| 搜索插入位置 | 二分查找，返回 `left` | SelfTest3 |

---
*学习整理：基于 `src/com/heima/array` 目录下 15 个示例文件*
