/**
 * Created by Lzf on 2018/9/11.
 */

/*面向对象思想
概述： 面向对象是基于面向过程的编程思想
特点：
更符合我们思想习惯的思想
可以将复杂的事情简单化
将我们从执行者变成了指挥者（角色发生了转换）
说了上面的概念，有的人肯定没有明白和理解
那么，我们就针对面向对象思想举几个例子吧。
1.买电脑：
面向过程：我要了解电脑–了解我自己的需求–找对应的参数信息–去中关村买电脑–讨价还价–买回电脑
面向对象：我知道我要买电脑 – 计算机老师去给我买 – 老师就买回来了
2.洗衣服：
面向过程：把衣服脱下–找一个盆–放点洗衣粉–加点水–把衣服扔进去–搓一搓–清洗衣服–拧干–晾起来
面向对象：把衣服脱下–打开全自动洗衣机–扔进去–一键即可–晾起来

列举了上面两个例子，我们可以看出，运用面向对象的思想可以很方便的解决我们的问题，同时我们也可以把面向对象思想的使用规则做以总结，让我们更符合面向对象思想
A:首先分析有那些类
B:接着分析每个类应该有什么
C:最后分析类与类的关系
我们知道了面向对象的使用规则，就来做一道练习吧！
练习：把大象装进冰箱。

分析：
面向过程：
动作有哪些呢?
A:打开冰箱门
B:装进大象
C:关闭冰箱门
代码体现：
* */
public class OO {
//   public static void main(String[] args) {
////       open();
////       in();
////       close();
//       Elephant.in();
//       Refrigerator.open();
//       Refrigerator.close();
//
//    }
//    public static void open(){
//        System.out.println("打开冰箱门");
//    }
//    public static void in(){
//        System.out.println("装进大象");
//    }
//    public static void close(){
//        System.out.println("关闭冰箱门");
//    }


}
/*我们从面向对象的思想来分析，并实现代码：
A:有哪些类呢?
大象、冰箱、Demo
B:每个类有哪些东西呢?
大象：
进去
冰箱：
开门、关门
Demo:
main方法
C:类与类直接的关系是什么呢?
Demo中使用大象和冰箱类的功能。
代码实现：
* */
        class Elephant{
        public static void in(){
            System.out.println("装进大象");
        }
        }
        class Refrigerator{
            public static void open(){
                System.out.println("打开冰箱门");
            }
            public static void close(){
                System.out.println("关闭冰箱门");
            }
        }
        /*面向对象开发
就是不断的创建对象，使用对象，指挥对象做事情。
面向对象设计
其实就是在管理和维护对象之间的关系。
面向对象特征
封装(encapsulation)
继承(inheritance)
多态(polymorphism)*/
        /*二、类与对象的关系
类：是一组相关的属性和行为的集合
属性——事物的基本描述，行为——事物的功能
Java语言中最基本的单位是类。所以，我们要用类来体现事物
对象：是该类事物的具体体现
举例：
类 ——学生就是类
对象 ——班长就是一个对象
三、成员变量和局部变量的区别
在类中的位置不同
成员变量——类中方法外
局部变量——方法内或者方法声明上
在内存中的位置不同
成员变量——堆内存
局部变量——栈内存
生命周期不同
成员变量——随着对象的存在而存在，随着对象的消失而消失
局部变量——随着方法的调用而存在，随着方法的调用完毕而消失
初始化值不同
成员变量——有默认的初始化值
局部变量——没有默认的初始化值，必须先定义，赋值，才能使用。
注意：成员变量和名称可以不可和局部变量一样呢?
答案当然是可以的，但是使用的时候要注意，先找小范围，再找大范围。*/

        /*四、匿名对象
匿名对象：就是没有名字的对象。
是对象的一种简化表示形式

匿名对象的两种使用情况
对象调用方法仅仅一次的时候
作为实际参数传递
我们来举例说明：
1、正常写法：
Student s = new Student();
s.age = 23;
2、匿名写法：
new Student().age = 23;
我们可以看到，用匿名写法时不用起名字就可以直接修改age的值了
3、输出学生的数量
System.out.println("一共有"+new Student().num + "个学生");
这种方法就是作为实际参数传递
*/