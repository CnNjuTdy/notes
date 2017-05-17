# 4.变量，作用域和内存问题

## 4.1 基本类型和引用类型的值

> 相当于C里面的基本变量和指针变量，与C不同的是，JavaScript不允许直接访问内存，JavaScript中的基本类型 包括Undefined，Null，Boolean，Number和String

### 4.1.1动态的属性

只有引用类型才可以赋予属性和方法，如果对象不被销毁或者属性不被删除，那么这个属性值可以一直保留

```javascript
    var person = new Object();
    person.name = "Tom";
    console.log(person.name);//Tom
    var num = 1;
    num.name = "Jerry";
    console.log(num.name);//undefined
```

### 4.1.2变量复制

基本类型的复制直接分配内存空间，引用类型的复制会分配新的指针空间，但指向同一个对象

```javascript
    var person1 = new Object();
    person1.name="Tom";
    var person2 = person1;
    console.log(person2.name);// Tom
    person2.name = "Jerry";
    console.log(person1.name);// Jerry
```

