package Extends;

/**
 * Created by Lzf on 2018/9/13.
 */
//public class Extends {
//    public static void main(String[] args) {
//        Student s = new Student();
//        s.eat();
//        s.seleep();
//        Teacher t = new Teacher();
//        t.eat();
//        t.seleep();
//    }
//
//}
//class Person{
//    public void eat(){
//        System.out.println("吃饭");
//    }
//    public void seleep(){
//        System.out.println("睡觉");
//    }
//}
//class Student extends Person{}
//
//class Teacher extends Person{}
/*优点：
提高了代码的复用性
多个类相同的成员可以放到同一个类中
提高了代码的维护性
如果功能的代码需要修改，修改一处即可
让类与类之间产生了关系，是多态的前提
当然运用了继承后，他也是存在弊端的
缺点：
类的耦合性很强
设计原则：高内聚低耦合。
简单的理解：
内聚就是自己完成某件事情的能力。
耦合就是类与类之间的关系。
我们在设计的时候原则是：自己能完成的就不麻烦别人，这样将来别人产生了修改，就对我的影响较小。
由此可见：在开发中使用继承其实是在使用一把双刃剑。今天我们还是以继承的好处来使用，因为继承还有很多其他的特性。*/

/*Java只支持单继承，不支持多继承。
一个类只能有一个父类，不可以有多个父类。
class SubDemo extends Demo{} //ok
class SubDemo extends Demo1,Demo2…//error
Java支持多层继承(继承体系)
class A{}
class B extends A{}
class C extends B{}*/

/*子类只能继承父类所有非私有的成员(成员方法和成员变量)
其实这也体现了继承的另一个弊端：打破了封装性
子类不能继承父类的构造方法，但是可以通过super关键字去访问父类构造方法。
不要为了部分功能而去继承
我们到底在什么时候使用继承呢?
继承中类之间体现的是：”is a”的关系。
举例：水果和苹果，苹果是一种水果。
学生和人，学生是人的一种。
所以我们总结采用假设法。如果有两个类A,B。只有他们符合A是B的一种，或者B是A的一种，就可以考虑使用继承。*/

/*继承中成员变量的关系
A:子类中的成员变量和父类中的成员变量名称不一样，这个太简单。
B:子类中的成员变量和父类中的成员变量名称一样，这个怎么玩呢?
结论在子类方法中访问一个变量的查找顺序：
a:在子类方法的局部范围找，有就使用
b:在子类的成员范围找，有就使用
c:在父类的成员范围找，有就使用
d:如果还找不到，就报错。
*/

/*super关键字
super的用法和this很像
this代表本类对应的引用。
super代表父类存储空间的标识(可以理解为父类引用,可以操作父类的成员)
用法(this和super均可如下使用)
访问成员变量
this.成员变量 调用本类的成员变量
super.成员变量 调用父类的成员变量
访问构造方法
this(…) 调用本类的构造方法
super(…) 调用父类的构造方法
访问成员方法
this.成员方法() 调用本类的成员方法
super.成员方法() 调用父类的成员方法*/

//public class Extends{
//    public static void main(String[] args) {
//        Son son = new Son();
//        System.out.println(son.num);
//        System.out.println(son.num2);
//        System.out.println(son.num3);
//
//    }
//}
//
//class Father{
//        int num = 20;
//        int num2 = 50;
//        }
//        class Son extends Father{
//            int num =20;
//            int num2 =super.num2=40;
//            int num3 =this.num=30;
//        }

/*继承中构造方法的关系
子类中所有的构造方法默认都会访问父类中空参数的构造方法
因为子类会继承父类中的数据，可能还会使用父类的数据。所以，子类初始化之前，一定要先完成父类数据的初始化。
注意：子类每一个构造方法的第一条语句默认都是：super();*/

public class Extends{
    public static void main(String[] args) {
        Son son =new Son();
        System.out.println("————————————");
        Son son1 =new Son("BB");

    }
}
class Father{
    int age;
    public Father(){
        System.out.println("这是父类无参构造方法");
    }
    public Father(String name){
        System.out.println("这是父类带参构造方法");
    }
}

class Son extends Father{
    public Son(){
//        super();
        System.out.println("这是子类无参构造方法");
    }
    public Son(String name){
//        super();
        System.out.println("这是子类带参构造方法");
    }
}

/*如果父类没有无参构造方法，那么子类的构造方法会出现什么现象呢?我注释了上面例子中父类的无参构造，然后项目报错了，那么我们怎么解决呢？

1、在父类中加一个无参构造方法
2、通过使用super关键字去显示的调用父类的带参构造方法
3、子类通过this去调用本类的其他构造方法
4、（子类中一定要有一个去访问了父类的构造方法，否则父类数据就没有初始化。）
5、注意事项：
6、this(…)或者super(…)必须出现在第一条语句上。
7、如果不是放在第一条语句上，就可能对父类的数据进行了多次初始化，所以必须放在第一条语句上。*/
//public class Extends{
//    public static void main(String[] args) {
//        Son son = new Son();
//        System.out.println("________________");
//        Son son2 =new Son("宝宝");
//    }
//
//}
//class Father{
//    int age;
//    public Father(String name){
//        System.out.println("父类带参构造方法");
//    }
//}
//class Son extends Father{
//
//    public Son(){
//        super("1");
//        System.out.println("子类无参构造方法");
//    }
//    public Son (String name){
//        this();
//        System.out.println("子类带参构造方法");
//    }
//}
/*A:子类中的方法和父类中的方法声明不一样，这个太简单。
B:子类中的方法和父类中的方法声明一样，这个该怎么玩呢?
通过子类对象调用方法：
a:先找子类中，看有没有这个方法，有就使用，没有就在父类中找
b:再看父类中，有没有这个方法，有就使用
c:如果没有就报错。*/