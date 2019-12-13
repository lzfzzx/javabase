package IODemo;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Lzf on 2018/10/8.
 */
/*字节流写数据
  OutputStream它的子类FileOutputStream
下面我们就来练习一下吧，往一个文本文件中输入一句话：”helloworld”
我们先来分析一下
  这个操作最好是采用字符流来做，但是呢，字符流是在字节流之后才出现的，所以，先讲解字节流如何操作。
  由于是要往文件中写一句话，所以我们要采用字节输出流(OutputStream)。
  由于我们是往文件中写东西，所以就要用OutputStream它的子类FileOutputStream

  那我们就来了解一下它的构造方法
FileOutputStream的构造方法
FileOutputStream(File file)
FileOutputStream(String name)
*/
public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
//        创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("fos.txt");
//        写数据
        fos.write("helloworld".getBytes());
        fos.write("java".getBytes());
        fos.close();
    }

}
/*我们最后为什么一定要close()呢?
  让流对象变成垃圾，这样就可以被垃圾回收器回收了
  通知系统去释放跟该文件相关的资源
  字节输出流操作步骤：
  A：创建字节输出流对象
  B：写数据
  C：释放资源
  */
/*字节流写数据的方式
public void write(int b) ：写一个字节
public void write(byte[] b)：写一个字节数组
public void write(byte[] b,int off,int len)：写一个字节数组的一部分
*/