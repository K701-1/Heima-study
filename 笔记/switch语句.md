# Switch 语句详解

## 1. Switch 语句概述

Switch 语句是一种多分支选择结构，用于根据表达式的值执行不同的代码块。与 if-else 语句相比，switch 在处理多个固定值的分支时更加清晰和高效。

## 2. 基本语法

```java
switch (表达式) {
    case 值1:
        // 语句体1
        break;
    case 值2:
        // 语句体2
        break;
    // ...
    default:
        // 默认语句体
        break;
}
```

## 3. 注意事项

1. **表达式要求**：结果必须是以下类型之一：
   - 整数类型：`byte`, `short`, `int`
   - 字符类型：`char`
   - 字符串类型：`String`（JDK 7 及以上）
   - 枚举类型：`Enum`
   - **不支持**：`long` 类型、浮点数类型（`float`, `double`）

2. **case 值要求**：
   - 只能是常量或字面值，不能是变量
   - 所有 case 值必须不同
   - 值的数据类型必须与表达式类型兼容

3. **break 语句**：
   - 用于终止 switch 语句，防止穿透
   - 可省略，但会导致 case 穿透现象

4. **default 语句**：
   - 用于处理未匹配的情况
   - 可以省略，但一个 switch 中最多只能有一个 default

## 4. default 关键字

### 4.1 位置与省略
- **位置**：case 和 default 的顺序没有严格要求，但为了代码可读性，通常将 default 放在最后
- **省略**：default 可以省略，若没有 case 匹配，则不会执行任何语句体

### 4.2 示例代码
```java
// SwitchDemo2.java
int week = 3;
switch (week) {
    case 3:
        System.out.println("跑步");
        break;
    default:
        System.out.println("其他");
        break;
    case 1:
        System.out.println("游泳");
        break;
    case 2:
        System.out.println("慢走");
}
```

## 5. case 穿透

### 5.1 现象说明
当 switch 语句中缺少 `break` 时，程序会从匹配的 case 开始，依次执行后续所有 case 的语句体，直到遇到 `break` 或 switch 语句结束。

### 5.2 示例代码
```java
// SwitchDemo3.java
int week = 3;
switch (week) {
    case 1:
        System.out.println("跑步");
    case 2:
        System.out.println("游泳");
    case 3:
        System.out.println("慢走");
    default:
        System.out.println("其他");
}
// 输出：慢走、其他
```

### 5.3 应用场景
case 穿透可以用于多个 case 共享相同代码块的情况，简化代码：

```java
// SwitchDemo4.java - 根据月份判断季节
Scanner scanner = new Scanner(System.in);
System.out.println("请输入月份：");
int month = scanner.nextInt();

switch (month) {
    case 12:
    case 1:
    case 2:
        System.out.println("冬季");
        break;
    case 3:
    case 4:
    case 5:
        System.out.println("春季");
        break;
    case 6:
    case 7:
    case 8:
        System.out.println("夏季");
        break;
    case 9:
    case 10:
    case 11:
        System.out.println("秋季");
        break;
    default:
        System.out.println("输入的月份不存在");
}
```

## 6. JDK 14 新特性

### 6.1 箭头标签（`->`）
- 不会发生 case 穿透
- 语法更简洁
- 支持多值 case（`case 1, 2, 3 ->`）

### 6.2 switch 表达式
- switch 可以有返回值
- 使用 `yield` 关键字返回值（在代码块中）
- 单行语句可以省略 `yield` 和大括号

### 6.3 示例代码
```java
// SwitchDemo5.java
int week = 6;
int week2 = 4;

// 箭头标签示例
switch (week) {
    case 1 -> {
        System.out.println("跑步");
    }
    case 2 -> System.out.println("游泳");
    case 3, 4, 5 -> System.out.println("慢走");
}

// switch 表达式示例
String name = switch (week2) {
    default -> {
        yield "其他";
    }
    case 1 -> "一";  // 单行可省略 yield 和 {}
};
System.out.println(name);
```

## 7. 应用示例：模拟计算器

利用 switch 表达式实现简单的计算器功能：

```java
// SwitchDemo6.java
int a = 10;
int b = 20;
String operator = "*";

int result = switch (operator) {
    case "+" -> a + b;
    case "-" -> a - b;
    case "*" -> a * b;
    case "/" -> a / b;
    default -> 0;
};
System.out.println(result);
```

## 8. 最佳实践

1. **始终添加 break**：除非有意识地利用穿透特性
2. **合理使用 default**：处理意外情况，提高代码健壮性
3. **case 值排序**：按数字或字母顺序排列，提高可读性
4. **优先使用箭头语法**：在 JDK 14+ 版本中，推荐使用箭头语法避免穿透问题
5. **保持 case 语句简洁**：复杂逻辑应提取为方法

## 9. 常见错误

1. **忘记 break 导致穿透**：非故意穿透可能产生逻辑错误
2. **case 使用变量**：必须使用常量或字面值
3. **类型不匹配**：表达式类型与 case 值类型不兼容
4. **重复的 case 值**：会导致编译错误
5. **遗漏 default**：可能未处理所有边界情况

## 10. 总结

Switch 语句是 Java 中重要的分支结构，适用于多值判断场景。掌握其基本语法、注意事项和新特性，能够编写出更清晰、高效的代码。在实际开发中，应根据具体需求选择合适的写法，并遵循最佳实践以避免常见错误。