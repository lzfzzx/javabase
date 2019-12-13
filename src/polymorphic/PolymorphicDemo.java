package polymorphic;

/**
 * Created by Lzf on 2018/9/20.
 */

/*多态
概述：某一个事物，在不同时刻表现出来的不同状态。
我们来举例说明：

猫是猫，狗是狗，猫和狗都是动物。
水在不同环境下的状态不同（液体，固体，气态）
那么使用多态的前提是什么呢？

要有继承关系。
要有方法重写。

 //其实没有也是可以的，但是如果没有这个就没有意义。
     Animal c = new Cat();
            c.show();
     Animal d = new Dog();
            d.show();
要有父类引用指向子类对象。

    父 f =  new 子();*/
public class PolymorphicDemo {
    public static void main(String[] args) {
//        向上转型
//        父类引用指向子类对象,即子类对象赋值给父类
        Fu fu = new Zi();
//        向下转型
//        将父类引用赋值给子类引用
        Zi zi =(Zi)fu;
        System.out.println(fu.num);
//        找不到符号
//        System.out.println(fu.num2);
        fu.show();
        Fu.show2();
//        找不到符号
//        fu.show3();
//        向下转型
        ((Zi) fu).show3();

    }


}

class Fu{
    public int num = 10;
    public void show(){
        System.out.println("FuMethod");
    }
    public static void show2(){
        System.out.println("FuStaticMethod");
    }

}
class Zi extends Fu{

    public int num = 100;
    public int num2 =200;
    @Override
    public void show(){
        System.out.println("override Fu");
    }
    public static void show2(){
        System.out.println("static Zi");
    }
    public void show3(){
        System.out.println("ZiShow3");
    }
}
/*我们可以看到多态中的成员访问特点

成员变量
编译看左边，运行看左边
构造方法
子类的构造都会默认访问父类构造
成员方法
编译看左边，运行看右边
静态方法
编译看左边，运行看左边
所以静态方法不能算方法的重写*/

/*学了这么多我们应该了解下多态的好处：

提高了代码的维护性(继承保证)
提高了代码的扩展性(由多态保证)
多态有好处，当然也有弊端了
不能使用子类的特有功能。
那么我们如何才能访问子类的特有功能呢?
多态中的转型
怎么用呢？

创建子类对象调用方法即可。(可以，但是很多时候不合理。而且，太占内存了)
把父类的引用强制转换为子类的引用。(向下转型)*/

/*关于对象间的转型问题：

向上转型
从子到父
父类引用指向子类对象
Fu f = new Zi();
向下转型
从父到子
父类引用转为子类对象
Zi z = (Zi)f; //要求该f必须是能够转换为Zi的。*/
