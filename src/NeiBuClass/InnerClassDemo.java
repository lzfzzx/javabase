package NeiBuClass;

/**
 * Created by Lzf on 2018/9/20.
 */
/*内部类
概述：把类定义在其他类的内部，这个类就被称为内部类。
举例：在类A中定义了一个类B，类B就是内部类。

内部的访问特点：
内部类可以直接访问外部类的成员，包括私有。
外部类要访问内部类的成员，必须创建对象。
内部类位置
成员位置:在成员位置定义的类，被称为成员内部类。
局部位置:在局部位置定义的类，被称为局部内部类。
class Outer {
    private int num = 10;

    //成员位置,成员内部类
    class Inner {

    }
    public void method() {
        //局部位置,局部内部类
        class Inner {

        }
    }
}

我们了解了成员内部类，那么如何直接访问内部类的成员。
外部类名.内部类名 对象名 = 外部类对象.内部类对象;*/
//public class InnerClassDemo {
//    public static void main(String[] args) {
////需求：我要访问Inner类的show()方法
//        Outer.Inner inner = new Outer().new Inner();
//        inner.show();
//    }
//}
//
//class Outer{
//    private int num = 10;
//    class Inner{
//        public void show(){
//            System.out.println(num);
//        }
//    }
//}/*上面学习了成员内部类的使用，但是一般来说，在实际开发中是不会这样使用的。因为一般内部类就是不让外界直接访问的*/

/*成员内部的常见修饰符
private 为了保证数据的安全性
static 为了让数据访问更方便
被静态修饰的成员内部类只能访问外部类的静态成员
内部类被静态修饰后的方法
静态方法
非静态方法*/

//public class InnerClassDemo{
//    public static void main(String[] args) {
////        静态内部类里的非静态方法调用
//        Outer.Inner inner =new Outer.Inner();
//        inner.show();
////        静态内部类里的静态方法调用
//        Outer.Inner.show2();
//    }
//}
//class Outer{
//    private static int num =10;
//    public static class Inner{
//        public void show(){
//            System.out.println(num);
//        }
//        public static void show2(){
//            System.out.println(num);
//        }
//    }
//}

/*局部内部类

可以直接访问外部类的成员
在局部位置，可以创建内部类对象，通过对象调用内部类方法，来使用局部内部类功能*/

//public class InnerClassDemo{
//    public static void main(String[] args) {
//        Outer outer = new Outer();
//        outer.method();
//    }
//}
//class Outer{
//    private int num = 10;
//    public void method(){
//        final int num2 = 20;
//        class Inner{
//            public void show(){
//                System.out.println(num);
//                //从内部类中访问本地变量num2; 需要被声明为最终类型
//                System.out.println(num2);
//            }
//        }
//        System.out.println(num2);
//        Inner inner = new Inner();
//        inner.show();
//    }
//}
/*局部内部类访问局部变量的注意事项：

局部内部类访问局部变量必须用final修饰
原因：局部变量是随着方法的调用而调用，随着调用完毕而消失。而堆内存的内容并不会立即消失。
所以，我们加final修饰。加入final修饰后，这个变量就成了常量。既然是常量。你消失了。
在内存中存储的是数据20，所以，还是有数据在使用。*/

/*匿名内部类
* 匿名内部类就是内部类的简化写法。
前提：存在一个类或者接口
这里的类可以是具体类也可以是抽象类。
格式：
new 类名或者接口名() {重写方法;}
本质：
是一个继承了类或者实现了接口的子类匿名对象*/
public class InnerClassDemo{
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.method();
    }
}
interface Inner{
    public abstract void show1();
    public abstract void show2();
}
class Outer{
    public void method(){
//        new Inner(){
//
//                public void show1(){
//
//                }
//                public void show2(){
//
//                }
//        }.show1();
//        new Inner(){
//
//            public void show1(){
//
//            }
//            public void show2(){
//
//            }
//        }.show2();
        //一个方法的时候
        /*
        new Inter() {
            public void show() {
                System.out.println("show");
            }
        }.show();
        */

        //二个方法的时候
        /*
        new Inter() {
            public void show() {
                System.out.println("show");
            }

            public void show2() {
                System.out.println("show2");
            }
        }.show();

        new Inter() {
            public void show() {
                System.out.println("show");
            }

            public void show2() {
                System.out.println("show2");
            }
        }.show2();
        */

        //如果我是很多个方法，就很麻烦了
        //那么，我们有没有改进的方案呢?
        Inner inner = new Inner() {
            @Override
            public void show1() {
                System.out.println("show1");
            }

            @Override
            public void show2() {
                System.out.println("show2");

            }

        };
        inner.show1();
        inner.show2();
    }
}
