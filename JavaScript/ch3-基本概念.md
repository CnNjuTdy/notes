# 3.基本概念

## 3.1 语法

> ECMAScript借鉴了大量C及其类似语言的语法

### 3.1.1 区分大小写

变量和函数名区分大小写

### 3.1.2 标识符

习惯上使用驼峰命名

### 3.1.3 注释

和Java一样

### 3.1.4 严格模式

在函数的开头标注`"use strict";`可以把JavaScript引擎切换到严格模式，**在严格模式下，很多语句的执行会有些不同**。

### 3.1.5 语句

- 分号结尾
- `if`, `while`等语句之后即使只有一行也使用代码块

## 3.2 关键字和保留字

严格模式下更多一些

## 3.3 变量

> 这里之前有一些疑点，带上一些例子详细点看

- 松散类型的变量，变量可以被赋予任何值，定义变量时需要使用`var`关键字
- 使用未定义的变量时，浏览器会报错并跳过执行这句话；使用定义但没有赋予值的变量时，浏览器认定该变量为`undefined`

```javascript
var log;
alert(dsd); //报错，这行代码不执行
alert(log); //输出undefined
```

- 尽管可以被重新定义类型，例如`var log = "username";log = 12 `不会报错但是这样是不推荐的。
- 使用变量符号`var`定义的变量会在函数退出之后被销毁

```javascript
    function getLog() {
        var log = "dsds";
        alert(log);
    }
    getLog()
    alert(log);//报错，这行代码不执行
```

- **声明变量时可以不使用`var`关键字，这样申明的变量就是全局变量，不推荐**

## 3.4 数据类型

> 5种基本数据类型：`Undefined Null Boolean Number String`,1种复杂数据类型`Object`

### 3.4.1 typeof操作符

可以返回某个变量的类型(字符串形式返回)，注意typeof是个操作符不是个函数，尽管可以使用`typeof(var)`,这里的括号并不是必要的

### 3.4.2 Undefined类型

这个类型仅有一个特殊的值，就是`undefined`,如果使用`var`关键字定义变量但没有给其初始化时，这个变量就是Undifined类型，其值是undefined。如果一个变量被初始化为undefined，那么它也是Undefined类型的，使用`typeof`时，返回字符串"undefined"。

```javascript
var log;
alert(log == undefined);//true

var und = undefined;
alert(und == undefined);//true
```

然而令人困惑的是，**尽管对未经申明的变量直接使用会报错，但是使用`typeof`关键字时，返回的结果是`"undefined**"`

```javascript
alert (age)//错误，不执行
alert (typeof age == "undefined");//true
```

### 3.4.3 Null类型 

这个类型仅有一个特殊的值，就是null，表示一个空对象指针，使用`typeof`时，返回字符串"object"

```javascript
var car = null;
alert(typeof car);//"object"
```

如果定义的 变量将来用来保存对象，最好将其初始化为null；

**规定`null == undefined`返回true**，然而无论何时没有必要把变量申明为`undefined`,但是`null`很有意义

### 3.4.4 Boolean类型

这个类型有2个值`true`和`false`。尽管如此，JavaScript中所有变量都可以使用Boolean()函数进行布尔映射。

|           | 映射为真      | 映射为假      |
| --------- | --------- | --------- |
| boolean   | true      | false     |
| String    | 非空字符串     | ""        |
| Number    | 非零数值包括无穷大 | 0和NaN     |
| Object    | 任何对象      | null      |
| Undefined | 不使用       | undefined |

### 3.4.5 Number类型

和Java基本一致，注意严格模式不支持八进制数

- 不要企图使用浮点数来进行比较，由于内部机制的原因（ ECMAScript使用的IEEE754标准），有些时候会出错

```javascript
console.log(0.1+0.2 == 0.3);//false
console.log(0.15+0.15 == 0.3);//true
```

- 最小正数：`Number.MIN_VALUE`最大正数:`Number.MAX_VALUE`，超出最大正数时，会变成`Infinity`(正无穷)，小于负最大正数时，会变成`-Infinity`(负无穷)，使用`isFinite()`可以返回该数字是否是无穷
- NaN，非数值。**0除以0之后都会变成NaN（正数除以0得到正无穷，负数除以0得到负无穷，和书上有点不一样）**
  - 特点1：任何涉及NaN的操作都返回NaN
  - 特点2：任何数值和NaN都不等，包括NaN本身
  - isNaN可以返回一个变量是不是数值，具体的来讲，布尔变量，非NaN的数字，可以转化成数字的字符串（例如"1","3.14"等），使用valueOf方法可以转化为数字的对象，使用toString方法可以转化成可以转化为数字的字符串的对象，以上几种使用isNaN时返回false，表示是数字。其他返回true，表示不是数字。
- `Number()`函数用于把任何变量转化为数字，具体和上面`isNaN`方法类似
- `parseInt()parseFloat()`函数用于把字符串转化为数字

### 3.4.5 String类型

和Java类似

- 字符串类型一旦创建不可改变，如果需要操作字符串，必须销毁原有的字符串
- 转化字符串:`String()`函数

### 3.4.6 Object类型

后面会详细叙述

## 3.5 操作符

支持的不常见的操作符有

```javascript
~ //按位取非
& //按位与
| //按位或
^ //按位异或
<<//左移
>>//右移
```

## 3.6 语句

> 没有什么很大不同

## 3.7 函数 

> 多看看

函数封装了一系列语句，并可以在任何时候被调用。

- 使用`function`关键字可以申明函数
- 任何函数都可以有返回值，也都可以没有返回值，`return`语句之后的语句不会执行

### 3.7.1 理解参数

可以使用arguments数组来访问函数的参数

```javascript
function satHi(){
  alert("Hello,"+arguments[0]+","+arguments[1]);
  alert(arguments.length);
}
sayHi("Tom","good morning!");
//显示Hello,Tom,good morning!和2
//参数个数多余时，从前往后取参数
//参数个数不足时，后面的是未定义Undefined
```

比较有意思的是，尽管argument数组和参数访问的是不同的内存空间，它们的值是同步的

```javascript
    function getLog(var1,var2) {
        arguments[1] = 100;
        console.log(var1+var2);//值是110并不是20
    }
	getLog(10,10);
```

### 3.7.2没有重载

ECMAScript没有函数重载，因为它的函数没有签名，如果定义了两个名字相同的函数，后者会覆盖前者。通过下面的方法可以一定程度上解决重载问题

```javascript
	function  add(num1,num2) {
        if(arguments.length==1){
            return num1+100;
        }else if(arguments.length>=2){
            return num1+num2;
        }else {
            return "no arguments"
        }
    }
```

