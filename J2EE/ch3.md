# Servlet技术

## Web应用

web应用程序是一个动态的扩展web服务器，有两种组织形式

- 面向表示的：面向表示的web应用生成交互式的web页面，包括各种标记语言
- 面向服务的：面向服务的web应用是一个web服务的端点

## Web组件

- 在J2EE平台上，web组件给web服务器提供了动态扩展的能力
- web组件包括：**servlets,web pages,JSP pages**

## Web请求处理过程

1. 客户端向服务器发送一个**http request**
2. 一个继承了JavaSevelet的服务接受了这个请求，并把这个请求转换成一个**HTTPServletRequest Object**
3. 这个object将会被交付给某个**web组件**，这个组件可以和**javaBeans组件**或者**数据库**进行交流
4. 这些web组件将会返回一个**HttpServletResponse**或者把请求发送给另个web组件
5. 某个web组件最终会返回一个HttpServletResponse
6. web服务器把HttpServletResponse转换成**http response**并把它返回给客户端

下图显示了大部分的请求处理过程:

![](img/3_1.png)

## Web容器

- web组件需要web容器的支持
- web容器为web组件提供了一系列服务，包括请求，安全性，实时性，生命线管理
- web容器同时为web组件提供接口
- web应用由web组件，资源文件和helper类以及类库组成。web容器扩展了web组件的能力

## 开发Web应用

