package IODemo;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by Lzf on 2018/10/9.
 */
/*随机访问流
  RandomAccessFile
  概述：RandomAccessFile类不属于流，是Object类的子类。但它融合了InputStream和OutputStream的功能。支持对随机访问文件的读取和写入。
这个类我以前写视频断点上传的时候就用到了，很强大的一个类，我们下面来学习下。
  public RandomAccessFile(String name,String mode)：
  第一个参数是文件路径，第二个参数是操作文件的模式。
  模式有四种，我们最常用的一种叫”rw”,这种方式表示我既可以写数据，也可以读取数据
  下面我们就用这个类来写一个简单的读写操作的例子*/
//public class RandomAccessFileDemo {
//    public static void main(String[] args) throws IOException {
//
//        // 创建随机访问流对象
//        RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");
//
//        // 写入数据
//        raf.writeInt(100);
//        raf.writeChar('a');
//        raf.writeUTF("中国");
//
//        raf.close();
//    }
//
//}
public class RandomAccessFileDemo {
    public static void main(String[] args) throws IOException {

        // 创建随机访问流对象
        RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");

        int i = raf.readInt();
        System.out.println(i);
        // 该文件指针可以通过 getFilePointer方法读取，并通过 seek 方法设置。
        System.out.println("当前文件的指针位置是：" + raf.getFilePointer());

        char ch = raf.readChar();
        System.out.println(ch);
        System.out.println("当前文件的指针位置是：" + raf.getFilePointer());

        String s = raf.readUTF();
        System.out.println(s);
        System.out.println("当前文件的指针位置是：" + raf.getFilePointer());

        // 我就要读取a，怎么办呢?
        raf.seek(4);
        ch = raf.readChar();
        System.out.println(ch);
    }

}

