/**
 * Created by Lzf on 2018/9/13.
 */
/*
* static关键字
可以修饰成员变量和成员方法
static关键字特点
随着类的加载而加载
优先于对象存在
被类的所有对象共享
    这也是我们判断是否使用静态关键字的条件
可以通过类名调用*/
import java.util.*;
public class Statics {

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student .num);
        System.out.println(student .num2);
        System.out.println(Student.num2);
        //System.out.println(Student.num);
//        String input = "1 fish 2 fish red fish blue fish";
//      Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
//      System.out.println(s.nextInt());
//      System.out.println(s.nextInt());
//      System.out.println(s.next());
//      System.out.println(s.next());
//      s.close();
        System.out.println(Math.random());
        System.out.println((int)(Math.random()*100));
    }

}
class Student{
    int num = 10;
    static int num2 =20;
}
/*static关键字注意事项
在静态方法中是没有this关键字的
静态方法只能访问静态的成员变量和静态的成员方法
我们怎么理解呢？
1.静态是随着类的加载而加载，this是随着对象的创建而存在。
2.静态比对象先存在。
3.在静态方法：
成员变量：只能访问静态变量
成员方法：只能访问静态成员方法
4.非静态方法：
成员变量：可以是静态的，也可以是非静态的
成员方法：可是是静态的成员方法，也可以是非静态的成员方法。
简单的理解就是静态只能访问静态。*/

/*我们学习了static关键字，那么来继续学习一下静态变量和成员变量的区别吧。
A:所属不同
静态变量：属于类，类变量
成员变量：属于对象，对象变量，实例变量
B:内存位置不同
静态变量：方法区的静态区
成员变量：堆内存
C:生命周期不同
静态变量：静态变量是随着类的加载而加载，随着类的消失而消失
成员变量：成员变量是随着对象的创建而存在，随着对象的消失而消失
D:调用不同
静态变量：可以通过对象名调用，也可以通过类名调用
成员变量：只能通过对象名调用*/

/*main方法
说起main方法，首先main方法是静态的

public static void main(String[] args) {}
public 被jvm调用，访问权限足够大。
static 被jvm调用，不用创建对象，直接类名访问
void被jvm调用，不需要给jvm返回值
main 一个通用的名称，虽然不是关键字，但是被jvm识别
函数的参数：参数类型是一个数组，该数组中的元素是字符串，字符串类型的数组*/

