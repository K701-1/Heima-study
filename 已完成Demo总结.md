# 已完成 Demo 总结

> 生成时间：基于当前项目目录（`src/`）中全部源码及 `out/` 编译产物统计
> 项目：Java 基础学习项目（heima）

## 一、总体概览

| 模块（包） | 对应知识点 | Demo 数量 | 状态 |
| --- | --- | --- | --- |
| `com.heima.helloworld` | Java 入门 | 1 | ✅ 已完成 |
| `com.heima.varlable` | 变量 | 8 | ✅ 已完成 |
| `com.heima.operator` | 运算符 | 16 | ✅ 已完成 |
| `com.heima.ifdemo` | 条件判断（if） | 9 | ✅ 已完成 |
| **合计** | | **34** | **全部完成** |

所有 Demo 均已提交至 Git，且 `out/` 目录下存在对应的 `.class` 编译产物，可直接运行。

---

## 二、模块详情

### 1. Java 入门 — `com.heima.helloworld`（1 个）

| 文件 | 内容 |
| --- | --- |
| `HelloWorld.java` | Java 第一个程序：演示类结构、`main` 方法入口、注释写法，输出 `Hello,World!` |

### 2. 变量 — `com.heima.varlable`（8 个）

| 文件 | 内容 |
| --- | --- |
| `VariableDemo1.java` | 变量初体验：用变量记录微信/支付宝/银行卡余额，计算总余额与红包收支后的余额 |
| `VariableDemo2.java` | 游戏战斗模拟：定义攻击力、防御力、血量、技能加成等变量，计算普攻与技能伤害 |
| `VariableDemo3.java` | 变量注意事项：先赋值再使用、一条语句定义多个变量、连续赋值 |
| `VariableDemo4.java` | 8 种基本数据类型演示：byte、short、int、long、float、double、char、boolean |
| `VariableDemo5.java` | BMI 计算：体重 / 身高平方，扩展计算标准 BMI 下的最高体重 |
| `VariableDemo6.java` | 键盘输入入门：Scanner 读取整数、浮点数、字符串 |
| `VariableDemo7.java` | 键盘录入两个整数并求和 |
| `VariableDemo8.java` | 综合练习：键盘录入体重身高计算 BMI |

### 3. 运算符 — `com.heima.operator`（16 个）

| 文件 | 内容 |
| --- | --- |
| `OperatorDemo1.java` | 算术运算符：`+ - * / %`，整数相除取整、小数运算精度问题 |
| `OperatorDemo2.java` | 拆分三位数：用 `/` 和 `%` 拆出百位、十位、个位 |
| `OperatorDemo3.java` | 秒数转换：给定秒数换算成 小时/分钟/秒 |
| `OperatorDemo4.java` | 类型转换：隐式转换（小转大）与强制转换（大转小） |
| `OperatorDemo5.java` | 类型转换练习：混合运算的类型提升与转换陷阱 |
| `OperatorDemo6.java` | 字母大小写转换：利用 ASCII 码，`'A' + 32 = 'a'` |
| `OperatorDemo7.java` | 字符串拼接规则：出现字符串后后续均为拼接；附 `++`/`--` 说明 |
| `OperatorDemo8.java` | 赋值运算符：`= += -= *= /= %=` 演示 |
| `OperatorDemo9.java` | 关系运算符练习：键盘录入两人身高判断谁更高 |
| `OperatorDemo10.java` | 关系运算符练习：判断三位数各位数字之和能否被 3 整除 |
| `OperatorDemo11.java` | 逻辑运算符：`& | !` 与短路 `&& ||`，判断数字是否在 1~10 之间 |
| `OperatorDemo12.java` | 逻辑运算符练习：判断数字是否**不**在 1~10 之间（两种写法） |
| `OperatorDemo13.java` | 逻辑运算综合：判断四位数是否为回文数 |
| `OperatorDemo14.java` | 逻辑运算综合：判断两位整数是否为"有缘数"（含 7 或是 7 的倍数） |
| `OperatorDemo15.java` | 三元运算符：`条件 ? 表达式1 : 表达式2` 求两数较大值 |
| `OperatorDemo16.java` | 运算符优先级：从左到右、小括号优先 |

### 4. 条件判断 — `com.heima.ifdemo`（9 个）

| 文件 | 内容 |
| --- | --- |
| `IfDemo1.java` | if 基础：体温 ≥38 时输出"请自我隔离" |
| `IfDemo2.java` | if 应用：游戏人物扣血/回血，血量保底 1 点、上限 200 |
| `IfDemo3.java` | if 书写细节：大括号位置（K&R / Allman 风格）、单行省略大括号、分号陷阱 |
| `IfDemo4.java` | 判断布尔类型变量：直接将布尔变量写入小括号 |
| `ifDemo5.java` | else / else if：成绩判断（先校验合理性，再判是否及格） |
| `ifDemo6.java` | 综合练习：外卖平台比价（美单 9 折 vs 饱了么满 30 减 10） |
| `ifDemo7.java` | 综合练习：优惠券阶梯满减 vs 会员 8 折，选最优惠方案 |
| `ifDemo8.java` | 综合练习：充值金额分档送金额（多分支 else if） |
| `ifDemo9.java` | 综合练习：BMI 指数健康分级（消瘦/正常/过重/肥胖/严重肥胖） |

---

## 三、目录结构

```
heima/
├── src/
│   └── com/
│       └── heima/
│           ├── helloworld/   # Java 入门（1 个）
│           ├── varlable/     # 变量（8 个）
│           ├── operator/     # 运算符（16 个）
│           └── ifdemo/       # 条件判断 if（9 个）
├── 笔记/
│   ├── 基本数据类型.md
│   ├── 运算符.md
│   └── if.md
├── out/                      # 编译产物（.class）
├── README.md
└── 已完成Demo总结.md          # 本文件
```

> 注：`varlable` 为原项目包名（`variable` 的拼写变体），沿用未改动。

---

## 四、学习路径建议

1. `HelloWorld` → 程序结构入门
2. 变量（1→8）→ 数据类型、定义与使用、键盘输入
3. 运算符（1→16）→ 算术、类型转换、赋值、关系、逻辑、三元
4. if 判断（1→9）→ 单分支、双分支、多分支、综合实战
5. 配合 `笔记/` 目录下的三篇笔记复习巩固

**下一步可学习内容**：循环（for/while）、switch 分支、数组、方法等。
