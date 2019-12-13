import org.omg.CORBA.Object;

/**
 * Created by Lzf on 2018/9/20.
 */
/*接口（interface）
接口用关键字interface表示
格式：interface 接口名 {}
类实现接口用implements表示
格式：class 类名 implements 接口名 {}
接口不能实例化
那么，接口如何实例化呢?
按照多态的方式，由具体的子类实例化。其实这也是多态的一种，接口多态（下一节讲）。
接口的子类
可以是抽象类。但是意义不大。
可以是具体类。要重写接口中的所有抽象方法。(推荐方案)*/
//public interface InterfaceDemo {
//    //   经测试，在接口中主方法可以带方法体，不过并没有什么用
//    public static void main(String[] args) {
//        AnimalTrain animalTrain = new Fishs();
//        animalTrain.jump();
//    }
//
//
//    interface AnimalTrain {
//        public abstract void jump();
//
//    }
//
//    //抽象类实现接口
//    abstract class Fish implements AnimalTrain {
//    }
//
//    //具体类实现接口
//    class Fishs implements AnimalTrain {
//        @Override
//        public void jump() {
//            System.out.println("重写接口中的抽象方法");
//        }
//
//    }
//}

/*接口成员特点
成员变量；只能是常量，并且是静态的。
默认修饰符：public static final
建议：自己手动给出。
构造方法：接口没有构造方法。因为接口主要是扩展功能的，而没有具体存在
成员方法：只能是抽象方法。
默认修饰符：public abstract
建议：自己手动给出。*/

//public class InterfaceDemo{
//    public static void main(String[] args) {
////        Inter inter  =new InterImpl();
////        InterImpl inter1 = new InterImpl();
////        Inter.num = 100;
//        System.out.println(Inter.num);
//        System.out.println(Inter.num2);
//        System.out.println(Inter.num3);
//
//    }
//
//}
//interface Inter{
////    经测试，默认补全public static final
//    public int num =10;
//    public final int num2 =20;
//    public static final int num3 = 30;
//
//    //错误: 需要<标识符>,接口没有构造方法
//    //public Inter() {}
//
//    //接口方法不能带有主体
//    //public void show() {}
//
//    //abstract void show(); //默认public
//    public void show(); //默认abstract
//}
//
//class InterImpl extends java.lang.Object implements Inter{
//    public InterImpl(){
//        super();
//    }
//    @Override
//    public void show(){
//
//    }
//
//}

/*类与类,类与接口以及接口与接口的关系
觉得他们的关系好复杂，快看晕了，没关系，我们逐个学习

类与类：
继承关系,只能单继承,可以多层继承。
类与接口：
实现关系,可以单实现,也可以多实现。
并且还可以在继承一个类的同时实现多个接口。
接口与接口：
继承关系,可以单继承,也可以多继承。
* */
interface Father1{
    public abstract void show();

}
interface Mother1{
    public abstract void show2();
}

interface Sister extends Father1,Mother1{

}

class Brother extends java.lang.Object implements Father1,Mother1{
    @Override
    public void show(){
        System.out.println("重写Father接口的抽象方法");
    }
    @Override
    public void show2(){
        System.out.println("重写Mother接口的抽象方法");
    }
}

public class InterfaceDemo{
    public static void main(String[] args) {
        Father1 father1 = new Brother();
        Mother1 mother1 = new Brother();
        Brother brother = new Brother();

        father1.show();
//        这个写法有点骚
       ((Brother) father1).show2();
        System.out.println("___________________");
        ((Brother) mother1).show();
        mother1.show2();
        System.out.println("___________________");
        brother.show();
        brother.show2();

    }
}
/*上面我们学习了抽象类，又学习了接口。那么他们之间有什么区别呢？我们继续开车…
抽象类和接口的区别

成员区别

抽象类：
成员变量：可以变量，也可以常量
构造方法：有
成员方法：可以抽象，也可以非抽象
接口：
成员变量：只可以常量
成员方法：只可以抽象
关系区别

类与类
继承，单继承
类与接口
实现，单实现，多实现
接口与接口
继承，单继承，多继承
设计理念区别
抽象类
被继承体现的是：”is a”的关系。
抽象类中定义的是该继承体系的共性功能。
接口
被实现体现的是：”like a”的关系。
接口中定义的是该继承体系的扩展功能。
* */

/*权限修饰符
修饰符：
权限修饰符：private，默认的，protected，public
状态修饰符：static，final
抽象修饰符：abstract
类：
权限修饰符：默认修饰符，public
状态修饰符：final
抽象修饰符：abstract
用的最多的就是：public
成员变量：
权限修饰符：private，默认的，protected，public
状态修饰符：static，final
用的最多的就是：private
构造方法：
权限修饰符：private，默认的，protected，public
用的最多的就是：public
成员方法：
权限修饰符：private，默认的，protected，public
状态修饰符：static，final
抽象修饰符：abstract
用的最多的就是：public
除此以外的组合规则：
成员变量：
public static final
成员方法：
public static
public abstract
public final*/

