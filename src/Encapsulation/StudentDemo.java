package Encapsulation;

/**
 * Created by Lzf on 2018/9/12.
 */
/*封装的概述：是指隐藏对象的属性和实现细节，仅对外提供公共访问方式。
好处：
隐藏实现细节，提供公共的访问方式
提高了代码的复用性
提高安全性
原则：
将不需要对外提供的内容都隐藏起来
把属性隐藏，提供公共方法对其访问 */
//public class StudentDemo {
//    public static void main(String[] args) {
//        Student s = new Student();
//        s.name="张三";
//        s.age = 24;//成员变量赋值
//        s.study();//方法调用
//        System.out.println(s.name+s.age);
//    }
//
//}
//class Student{
//    String name;
//    int age;
//    public void study(){
//        System.out.println("学生爱学习");
//    }
//}
/*private 关键字（意思是私有的）
是一个权限修饰符。
可以修饰成员(成员变量和成员方法)
被private修饰的成员只在本类中才能访问。
private最常见的应用：
把成员变量用private修饰
提供对应的getXxx()/setXxx()方法
一个标准的案例的使用*/
//public class StudentDemo {
//    public static void main(String[] args) {
//        Student s =new Student();
//        s.study();
//    }
//
//}
//
//class Student{
//
//    private String name;
//    private int age;
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
///*this关键字:代表所在类的对象引用。简单的说，它就代表当前类的一个对象。
//
//注意：
//方法被哪个对象调用，在该方法内部的this就代表那个对象
//用法：
//解决局部变量隐藏成员变量 */
//
//    public void study(){
//        System.out.println("学生爱学习");
//    }
//}


/*构造方法
作用概述:
给对象的数据进行初始化
格式：
方法名与类名相同
没有返回值类型，连void都没有
没有具体的返回值*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * asdfgh
 */
public class StudentDemo {
    public int a;
    
    public static void main(String[] args) {
//        student s = new student();
//        student s1 = new student(2, 3, "4");
//        student s2 = new student(2, "3", 5);
    }

    @Override
    public String toString() {
        return null;
    }
}

class Student extends StudentDemo {
    
    private String name;//null
    private int age;//0

//    int a = super.a;
    public Student() {

        System.out.println("这是构造方法");
    }

    public Student(int b, int c, String d) {
        System.out.println("这是重载构造方法");
    }

    public Student(int b, String d, int c) {
        System.out.println("这是重载构造方法");

    }

}
class Test{
    Student s = new Student();
    int a = s.a;
        }
/*VIM 文本编译器*/
/*注意：
如果你不提供构造方法，系统会给出默认构造方法
如果你提供了构造方法，系统将不再提供
构造方法也是可以重载的
* */
/*api帮助文档：*/

