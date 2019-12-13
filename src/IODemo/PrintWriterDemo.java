package IODemo;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Lzf on 2018/10/9.
 */
/*打印流
打印流分为两类
字节流打印流    PrintStream
字符打印流 PrintWriter
  打印流的特点：
  只有写数据的，没有读取数据。只能操作目的地，不能操作数据源。
  可以操作任意类型的数据。
  如果启动了自动刷新，能够自动刷新。
  该流是可以直接操作文本文件的。
我们来回忆一下哪些流对象是可以直接操作文本文件的呢?
FileInputStream
FileOutputStream
FileReader
FileWriter
PrintStream
PrintWriter
看API,查流对象的构造方法，如果同时有File类型和String类型的参数，一般来说就是可以直接操作文件的。

 可以操作任意类型的数据。有两种方法，他们就什么区别呢？
print() 不会换行，不会自动刷新数据。
println() 不仅仅自动刷新了数据，还实现了数据的换行。*/
public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
//        PrintWriter pw = new PrintWriter("pw2.txt");
        PrintWriter pw = new PrintWriter(new FileWriter("pw2.txt",true));
        pw.println(true);
        pw.println(100);
        pw.println("hello");
        pw.println(200);
        pw.close();


    }
}
/*println()方法，其实等价于： bw.write(); bw.newLine(); bw.flush();三个方法*/