##设计模式

#### 可复用面向对象软件的基础

---

### 本书引语

这本书并不是一本面向对象技术或设计的介绍用书，很多其他的书在这方面都做的很好。这本书假设你已经熟练地掌握了至少一门面向对象语言，并且你已经参与设计或实现一些面向对象的项目。在我们提及类似*“类，多态，接口，实现，继承”*之类的比较专业的词汇时，你应该对它们比较熟悉而不是还需要去翻阅词典。

当然，这本书也不是一本专业的技术著作。这是一本关于**设计模式**的书，它描述了一些简单且优雅的规则，这些规则被用于解决面向对象设计中的特定问题，并且被发展演化了很长时间，因此它们已经不是最初被设计出来的 样子了。软件设计者在努力提升他们产品的可复用性和灵活性时重新设计编码了原有的设计模式。现在，设计模式是一种简洁，易于使用的形式。

设计模式中可以不需要任何特定语言的支持，也不需要那些可以向你的朋友或领导吹嘘的编码窍门。任何一门标准的设计语言都可以用来表达设计模式，尽管应用设计模式可能比那些量身定做的解决方案要多费很多事，但是相信我，这些额外的工作将大大提升你项目的复用性和灵活性。

当你理解了这些设计模式，并且成功地（而不是云里雾里地）应用它们完成了一个项目时，你对面向对象设计将会有一个新的认识。你将会对灵活性，模块化，复用性，可理解性有一层更深的见解—这也是你选择面向对象设计的原因，不是吗？

这本书已经酝酿了很久。它的作者来自四个国家，它见证了三个作者的甜蜜婚姻和两个孩子的出生。许多人都曾经参与其中，我们将由其感谢*Bruce Anderson, Kent Beck*和*André Weinand*的建议和构想。我们也很感谢那些审阅了本书草稿的人，包括*Roger Bielefeld, Grady Booch, Tom Cargill, Marshall Cline, Ralph Hyre,Brian Kernighan,Thomas Laliberty, Mark Lorenz, Arthur Riel, Doug Schmidt, Clovis Tondo, Steve Vinoski*和*Rebecca Wirfs-Brock*。我们也很感谢*Addison-Wesley*队伍成员的帮助和他们的耐心，他们是*Kate Habib, Tiffany Moore, Lisa Raffaele, Pradeepa Siva*以及*John Wait*。尤其感谢IBM调查组的*Carl Kessler, Danny Sabbah* 和*Mark Wegman*的帮助。

最后，我们很感谢来自因特网的各位专家，他们帮助完成了本书的uml用图，鼓励我们创作并告诉我们我们所做的一切都是值得的。这些人包括且不限于以下：*Jon Avotins, SteveBerczuk, Julian Berdych, Matthias Bohlen, John Brant, Allan Clarke, Paul Chisholm, JensColdewey, Dave Collins, Jim Coplien, Don Dwiggins, Gabriele Elia, Doug Felt, Brian Foote,Denis Fortin, Ward Harold, Hermann Hueni, Nayeem Islam, Bikramjit Kalra, Paul Keefer,Thomas Kofler, Doug Lea, Dan LaLiberte, James Long, Ann Louise Luu, Pundi Madhavan,Brian Marick, Robert Martin, Dave McComb, CarlMcConnell, Christine Mingins, Hanspeter Mössenböck, Eric Newton, Marianne Ozkan, Roxsan Payette, Larry Podmolik, George Radin, Sita Ramakrishnan, Russ Ramirez, Alexander Ran, Dirk Riehle, Bryan Rosenburg,Aamod Sane, Duri Schmidt, Robert Seidl, Xin Shu, and Bill Walker*。

我们并不认为这是一本已经严谨且完整的书，它更像是我们几个目前思想或设计理念的结晶。我们欢迎任何对本书的评论和指点，无论是批评还是指正，或是指出我们的遗漏之处。你可以发送电子邮件至designpatterns@cs.uiuc.edu。你也可以通过发送邮件*send design pattern source*到design-patternssource@cs.uiuc.edu来获取本书例子中用到的源代码。现在，本书也有了配套的网站http://stwww.cs.uiuc.edu/users/patterns/DPBook/DPBook.html用来获取最新的消息和更新。

*Mountain View, California, E.G.*
*Montreal, Quebec, R.H.*
*Urbana, Illinois, R.J.*
*Hawthorne, New York, J.V.*

1994年8月

---

### 关于作者

本书的作者是软件开发领域权威的专家。*Dr.Erich Gamma*是苏黎世大学软件研究中心的技术指导；*Dr. Richard Helm*是IBM悉尼面向对象研究小组的一名成员；*Dr. Ralph Johnson*是伊利诺伊大学计算机技术中心的一名全能教员；*Dr. John Vlissides*在纽约的IBM研究中心工作

---

### 读者指南

这本书有两个主要的部分。第一部分（第一章和第二章）描述了什么是设计模式以及设计模式是如何帮助我们设计面向对象软件。它包含了一个设计案例的学习，这个案例向我们演示了，在现实中，设计模式怎样被使用。第二部分（三四五章）是设计模式清单的详细描述。

这份清单构成了本书的主要成分。这份清单将所有的设计模式分成三种，分别是**构建时，结构化，行为化**。你可以通过不同的方式来使用清单：你可以从头至尾通读，也可以仅仅快速浏览某个模式。另外一种方式是阅读整个章节，这样你将会明白模式与模式之间的联系。

你可以利用两个模式之间的提示作为通读整个清单的思维脉络。这种阅读方式将会告诉你，模式之间是怎样联系的，两个模式是怎样融合的，某个模式是怎样和另外的模式共同使用的。1.1节将用图形化的方式来描述整个提示。

另外一种阅读方式将会更加的时效性，你可以完全按照问题驱动的方式来阅读。跳跃到1.6节，它会告诉你在面向对象设计过程中的常见问题，和你的问题比照之后，你可以选择性地阅读某个模式。有些人第一次阅读时通篇阅读了整本书，第二次开始使用问题驱动的方式，我们觉得这样也很不错。

如果你并不是一个经验丰富的面向对象设计师，你可以仅仅阅读以下几个最重要，最常见，也是最简单的模式。

- **抽象工厂模式**
- **适配器模式**
- **组合模式**
- **装饰者模式**
- **工厂模式**
- **观察者模式**
- **策略模式**
- **模板方法模式**

几乎所有的面向对象系统中都或多或少地使用了这些模式中的某几种，有些复杂的系统甚至使用了以上的所有模式。这些模式将会帮助你从大体上理解设计模式和面向对象设计原则。

