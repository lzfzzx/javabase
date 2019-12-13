package StringBuffer;

/**
 * Created by Lzf on 2018/9/25.
 */
/*StringBuffer类概述
我们如果对字符串进行拼接操作，每次拼接，都会构建一个新的String对象，既耗时，又浪费空间。而StringBuffer就可以解决这个问题。
下面我们来学习
StringBuffer的构造方法：

public StringBuffer():无参构造方法
public StringBuffer(int capacity):指定容量的字符串缓冲区对象
public StringBuffer(String str):指定字符串内容的字符串缓冲区对象
StringBuffer的方法：

public int capacity()：返回当前容量。 理论值(初始化默认容量是16)
public int length():返回长度（字符数）。 实际值

*/
public class StringBufferDemo {
    public static void main(String[] args) {
//        public StringBuffer():无参构造方法
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer.length());
//    public StringBuffer(int capacity):指定容量的字符串缓冲区对象
        StringBuffer stringBuffer1 = new StringBuffer(50);
        System.out.println(stringBuffer1);
        System.out.println(stringBuffer1.capacity());
        System.out.println(stringBuffer1.length());
//    public StringBuffer(String str):指定字符串内容的字符串缓冲区对象
        StringBuffer stringBuffer2 = new StringBuffer("GoodStudy");
        System.out.println(stringBuffer2);
        System.out.println(stringBuffer2.capacity());
        System.out.println(stringBuffer2.length());
    }
}
