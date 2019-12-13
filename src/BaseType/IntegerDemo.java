package BaseType;

/**
 * Created by Lzf on 2018/9/25.
 */
/*基本类型包装类概述

将基本数据类型封装成对象的好处在于可以在对象中定义更多的功能方法操作该数据。
常用的操作之一：用于基本数据类型与字符串之间的转换。
基本类型和包装类的对应
byte —-Byte
short —- Short
int —- Integer
long —- Long
float —- Float
double —- Double
char —- Character
boolean —- Boolean
有了基本类型包装类我们就可以调方法、调成员变量了，方便了很多。
*/

/*Integer类概述及其构造方法
Integer类概述
Integer 类在对象中包装了一个基本类型 int 的值
该类提供了多个方法，能在 int 类型和 String 类型之间互相转换，还提供了处理 int 类型时非常有用的其他一些常量和方法
构造方法
public Integer(int value)
public Integer(String s)
注意：这个字符串必须是由数字字符组成
*/
//public class IntegerDemo {
//    public static void main(String[] args) {
//        int a = 100;
//        Integer integer = new Integer(a);
//        String s = "101";
//        Integer integer1 = new Integer(s);
//        System.out.println(integer);
//        System.out.println(integer1);
//    }
//}

/*int 转 String
String.valueOf(number)
String 转 int
Integer.parseInt(s)
*/
public class IntegerDemo {
    public static void main(String[] args) {
        // int -- String
        int number = 100;
        // 方式1
        String s1 = "" + number;
        System.out.println("s1:" + s1);
        // 方式2
        String s2 = String.valueOf(number);
        System.out.println("s2:" + s2);
        // 方式3
        // int -- Integer -- String
        Integer i = new Integer(number);
        String s3 = i.toString();
        System.out.println("s3:" + s3);
        // 方式4
        // public static String toString(int i)
        String s4 = Integer.toString(number);
        System.out.println("s4:" + s4);
        System.out.println("-----------------");

        // String -- int
        String s = "100";
        // 方式1
        // String -- Integer -- int
        Integer ii = new Integer(s);
        // public int intValue()
        int x = ii.intValue();
        System.out.println("x:" + x);
        //方式2
        //public static int parseInt(String s)
        int y = Integer.parseInt(s);
        System.out.println("y:"+y);
        //方式3
        int z = Integer.valueOf(s);
        System.out.println("z:"+z);
    }
}

