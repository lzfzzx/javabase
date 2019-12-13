package StringDemo;

/**
 * Created by Lzf on 2018/9/25.
 */

/*String类概述及其构造方法
String类概述

字符串是由多个字符组成的一串数据(字符序列)
字符串可以看成是字符数组
通过查看API，我们可以知道

字符串字面值”abc”也可以看成是一个字符串对象。
字符串是常量，一旦被赋值，就不能被改变。
构造方法

public String()
空构造
public String(byte[] bytes)
把字节数组转成字符串
public String(byte[] bytes,int offset,int length)
把字节数组的一部分转成字符串
public String(char[] value)
把字符数组转成字符串
public String(char[] value,int offset,int count)
把字符数组的一部分转成字符串
public String(String original)
把字符串常量值转成字符串
字符串的方法：

public int length()：返回此字符串的长度。
*/
public class StringDemo {
    public static void main(String[] args) {
        //public String()空构造
        String s1 = new String();
        System.out.println("s1:"+s1);
        System.out.println("s1.length"+s1.length());
        System.out.println("___________________");

        // public String(byte[] bytes):把字节数组转成字符串
        byte[]bytes = {97,98,99,100};
        String s2 = new String(bytes);
        System.out.println("s2:"+s2);
        System.out.println("s2.length"+s2.length());
        System.out.println("___________________");

//        public String(byte[] bytes, int index,int length)
        String s3 = new String(bytes,1,3);
        System.out.println("s3:"+s3);
        System.out.println("s3.length"+s3.length());
        System.out.println("___________________");

//        public String(Char[]value)
        char[]chars = {'a','b','c','d','e','一','二','三','四','五'};
        String s4 = new String(chars);
        System.out.println("s4:"+s4);
        System.out.println("s4.length"+s4.length());
        System.out.println("___________________");

//      public String(Char[] value,int index,int count);
        String s5 = new String(chars,2,4);
        System.out.println("s5:"+s5);
        System.out.println("s5.length"+s5.length());
        System.out.println("___________________");

//        public String(String original)把字符串常量转换为字符串
        String s6 = new String("abcde");
        System.out.println("s6:"+s6);
        System.out.println("s6.length"+s6.length());
        System.out.println("___________________");

        String s7 = "abcde";
        System.out.println("s7:"+s7);
        System.out.println("s7.length"+s7.length());
        System.out.println("___________________");

        String s8 = "hello";
        s8+="World";
        s8+="!";
        System.out.println(s8);

    }

}
