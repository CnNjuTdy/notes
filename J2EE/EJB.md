# EJB

## Enterprise Bean

### what

- Enterprise Bean是一个服务器端的组件，它包含了一个应用的业务逻辑
- 业务逻辑是执行了整个业务的目标

### why

- 首先，因为EJB容器给enterprise bean提供了系统层的服务，使得enterprise bean可以专心于业务逻辑
- 其次，相比较客户端，beans为业务逻辑提供了更好的载体，可以**瘦客户端**
- 再次，enterprise bean是一个可以移植的组件，开发者可以利用已有的enterprise bean开发新的引用


### when

- 整个应用必须是可扩展的
- 合约必须保证数据安全
- 应用应该有许多客户端

### types

- Session Bean：用于实现业务逻辑，它可以是有状态的，也可以是无状态的。每当客户端请求时，容器就会选择一个Session Bean来为客户端服务。Session Bean可以直接访问数据库，但更多时候，它会通过Entity Bean实现数据访问。
- Message-driven：是EJB2.0中引入的新的企业Bean，它基于JMS消息，只能接收客户端发送的JMS消息然后处理。MDB实际上是一个异步的无状态Session Bean，客户端调用MDB后无需等待，立刻返回，MDB将异步处理客户请求。这适合于需要异步处理请求的场合，比如订单处理，这样就能避免客户端长时间的等待一个方法调用直到返回结果。
- Entity Bean：域模型对象，用于实现O/R映射，负责将数据库中的表记录映射为内存中的Entity对象，事实上，创建一个Entity Bean对象相当于新建一条记录，删除一个Entity Bean会同时从数据库中删除对应记录，修改一个Entity Bean时，容器会自动将Entity Bean的状态和数据库同步。


### 补充

ppt上我看不懂的东西太多了

只能看这几篇了

[Java 帝国之Java bean (上）](http://mp.weixin.qq.com/s?__biz=MzAxOTc0NzExNg==&mid=2665513115&idx=1&sn=da30cf3d3f163d478748fcdf721b6414#rd)

[Java 帝国之Java bean (下)](http://mp.weixin.qq.com/s?__biz=MzAxOTc0NzExNg==&mid=2665513118&idx=1&sn=487fefb8fa7efd59de6f37043eb21799#rd)

很好懂，很好玩
