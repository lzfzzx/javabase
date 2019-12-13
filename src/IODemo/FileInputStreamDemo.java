package IODemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Lzf on 2018/10/8.
 */
/*字节流读取数据
  InputStream的子类FileInputStream
  学习了写数据，那么来学习读取数据就好理解多了

FileInputStream的构造方法
FileInputStream(File file)
FileInputStream(String name)

FileInputStream的成员方法
public int read()：一次读取一个字节
public int read(byte[] b)：一次读取一个字节数组


我们先来看下字节输入流操作步骤：
A：创建字节输入流对象
B：调用read()方法读取数据，并把数据显示在控制台
C：释放资源*/
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
//        创建字节输入流对象
        FileInputStream fis = new FileInputStream("fos.txt");
        int by =0;
//        读取、赋值、判断
        while ((by = fis.read())!=-1){
            System.out.println((char)by);
        }
        /*假如我们要读取字节数比较大的文件的时候，我们就不能一次读取一个字节了，就要一次读取一个字节数组。
        那么就是FileInputStream成员方法中的第二种了*/
//        用了一种另一种不生效
        byte[]bys = new byte[1024];
        int len = 0;
        while ((len = fis.read(bys))!=-1){
            System.out.println(new String(bys,0,len));
        }
            fis.close();
    }
}
