package IODemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Created by Lzf on 2018/10/9.
 */
/*OutputStreamWriter的方法：
public void write(int c):写一个字符
public void write(char[] cbuf):写一个字符数组
public void write(char[] cbuf,int off,int len):写一个字符数组的一部分
public void write(String str):写一个字符串
public void write(String str,int off,int len):写一个字符串的一部分
*/
public class OutputStreamWriterDemo2 {
    public static void main(String[] args) throws IOException {
        // 创建对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"));

        // 写数据
        // public void write(int c):写一个字符
        osw.write('a');
        osw.write(97);

        // public void write(char[] cbuf):写一个字符数组
        char[] chs = {'a','b','c','d','e'};
        osw.write(chs);

        // public void write(char[] cbuf,int off,int len):写一个字符数组的一部分
        osw.write(chs,1,3);

        // public void write(String str):写一个字符串
        osw.write("杭州G20峰会");

        // public void write(String str,int off,int len):写一个字符串的一部分
        osw.write("习近平出席", 0, 3);//这是的0，3意思是从下标为0的字符开始向后写3个

        // 刷新缓冲区
        osw.flush();
        osw.write("平致开幕词", 1, 3);

        // 释放资源
        osw.close();

    }
}
/*我们在用转换流时，它用到了缓冲区，所以我们就需要刷新，调用flush()方法。
  但是你细心点就会发现，在刷新缓冲区后还可以写入数据。如果当我们释放资源后就不可以写入数据了，那么这就引出一个问题
  close()和flush()的区别?
  close()关闭流对象，但是先刷新一次缓冲区。关闭之后，流对象不可以继续再使用了。
  flush()仅仅刷新缓冲区,刷新之后，流对象还可以继续使用。*/