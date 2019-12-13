/**
 * Created by Lzf on 2018/9/19.
 */
/*
抽象类和普通类、接口的区别：https://blog.csdn.net/u012092924/article/details/78342193
* 抽象类特点
抽象类和抽象方法必须用abstract关键字修饰
格式
abstract class 类名 {}
public abstract void eat();
抽象类不一定有抽象方法，有抽象方法的类一定是抽象类
抽象类不能实例化
因为它不是具体的。
那么，抽象类如何实例化呢?
按照多态的方式，由具体的子类实例化。其实这也是多态的一种，抽象类多态。
抽象类的子类
如果不想重写抽象方法，该子类是一个抽象类。
重写所有的抽象方法，这个时候子类是一个具体的类。*/
//public class Abstract {
//    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.eat();
//        Animal animal =new Animal();
//        Dog dog =new Dog() {
//            @Override
//            public void eat() {
//                System.out.println("重写抽象方法");
//            }
//        };
//    }
//}
//abstract class Animal {
//    //抽象方法
//    //public abstract void eat(){} //空方法体,这个会报错。抽象方法不能有主体
//    public abstract void eat();
//
//    public Animal(){}
//}
////子类是抽象类
//abstract class Dog extends Animal {}
////子类是具体类，重写抽象方法
//class Cat extends Animal {
//    @Override
//    public void eat() {
//        System.out.println("猫吃鱼");
//    }
//}
/*抽象类的成员特点：
成员变量：既可以是变量，也可以是常量。
构造方法：构造方法不能被实例化。所以构造方法的特点是：用于子类访问父类数据的初始化。
抽象类的成员方法特性：
可以有抽象方法，强制要求子类做的事情。
也可以有非抽象方法，子类继承的事情，提高代码复用性。*/

public class Abstract {
    public static void main(String[] args) {
        Animal a =new Dog();
        a.num =100;
        System.out.println(a.num);
//        a.num2 =200;
        System.out.println(a.num2);
        System.out.println("_______________");
        a.show();
        a.method();
    }

}

abstract class Animal {
    public int num = 10;
    public final int num2 = 20;
    public Animal(){

    }
    public Animal(String name,int age){

    }
    public abstract void show();
    public void method(){
        System.out.println("普通方法");
    }
}
class Dog extends Animal{
    @Override
    public void show(){
        System.out.println("show Dogs");
    }
}

/*一个类如果没有抽象方法，可不可以定义为抽象类?如果可以，有什么意义?

答案肯定是可以的，意义就是为了不让创建对象。

abstract不能和哪些关键字共存?

private冲突、final冲突、static无意义
* */
//public class Abstract{
//    public static void main(String[] args) {
//        Sons sons = new Sons();
//        sons.show();
//      抽象类中的静态方法可以通过类名直接调用
//        Fathers.method();
//
//    }
//}
//abstract class Fathers{
//    public abstract void show();
////    非法的修饰符组合 private + abstract
////    private abstract void shows();
////    非法的修饰符组合 final + abstract
////    final abstract void shows();
////    非法的修饰符组合 static + abstract
////    static abstract void shows();
//    public static void method(){
//        System.out.println("普通方法");
//    }
//}
//class Sons extends Fathers{
//@Override
//    public void show(){
//    System.out.println("重写父类抽象方法");
//}
//}