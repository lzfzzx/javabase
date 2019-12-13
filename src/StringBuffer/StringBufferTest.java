package StringBuffer;

/**
 * Created by Lzf on 2018/9/25.
 */

/*String和StringBuffer相互转换*/
public class StringBufferTest {
    public static void main(String[] args) {
//        String转换为StringBuffer
        String s = "hello";
//        不能将它直接赋值
//        StringBuffer stringBuffer = s;
//        方法1：通过构造方法
        StringBuffer stringBuffer = new StringBuffer(s);
        System.out.println(stringBuffer);
//        方法2：通过append成员方法
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1.append(s);
        System.out.println(stringBuffer1);

//        StringBuffer转换为String
        StringBuffer stringBuffer2 = new StringBuffer("DayDayUp");
//        方法1：构造方法
        String s1 = new String(stringBuffer2);
        System.out.println(s1);
//        方法2：toString方法
        String s2 = new String();
        s2 = stringBuffer2.toString();
        System.out.println(s2);
    }
}

/*String,StringBuffer,StringBuilder的区别?

String是内容不可变的，而StringBuffer,StringBuilder都是内容可变的。
StringBuffer是同步的，数据安全,效率低;StringBuilder是不同步的,数据不安全,效率高<这里是线程安全(多线程讲解)>

---------------------
*/
/*StringBuffer和数组的区别?

二者都可以看出是一个容器，装其他的数据。
但是呢,StringBuffer的数据最终是一个字符串数据。
而数组可以放置多种数据，但必须是同一种数据类型的。

---------------------

*/

/*StringBuilder
在Java中，首先出现的是StringBuffer，而StringBuilder类来源于jdk1.5及以后的版本
我们查看API了解一下StringBuilder类
他的用途和StringBuffer类相同，用来进行字符串的连接、修改。
这里我们对他了解一下就可以了。

---------------------
*/