package IODemo;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;



/**
 * Created by Lzf on 2018/10/9.
 */
/*字节缓冲流
  字节流一次读写一个数组的速度明显比一次读写一个字节的速度快很多，这是加入了数组这样的缓冲区效果，
java本身在设计的时候，也考虑到了这样的设计思想(装饰设计模式)，所以提供了字节缓冲区流
  这种类被称为：缓冲区类(高效类)
字节缓冲输出流
BufferedOutputStream
字节缓冲输入流
BufferedInputStream
*/
public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("bos.txt"));
//        写数据
        bos.write("hello".getBytes());
//        释放资源
        bos.close();
    }
}
