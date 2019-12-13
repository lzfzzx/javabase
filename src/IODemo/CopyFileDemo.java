package IODemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Lzf on 2018/10/8.
 */
/*我们上面学习了写数据和读取数据，前面也学习了File的操作，那么我们可不可以字节流复制数据也就是复制文本文件的一些操作呢，
那肯定是可以的了。我们就来见识一下它的厉害吧！
  数据源：从哪里来
  fos.txt    –  读取数据    –  FileInputStream
  目的地：到哪里去
  b.txt    –  写数据     –  FileOutputStream
*/
//public class CopyFileDemo {
//    public static void main(String[] args) throws IOException {
////        封装数据源
//        FileInputStream fis = new FileInputStream("fos.txt");
////        封装目的地
//        FileOutputStream fos = new FileOutputStream("b.txt");
//
//        int by = 0 ;
//        while ((by=fis.read())!=-1){
//            fos.write(by);
//        }
////        释放资源,没有先后
//        fos.close();
//        fis.close();
//    }
//}

/*这样我们就完成了把a.txt复制了一份并命名为b.txt的文件了
但是我们平时在开发中要负责一个文件的话，不这样写，要用一次读取一个字节数组的方法来写*/
public class  CopyFileDemo{
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("fos.txt");
        FileOutputStream fos = new FileOutputStream("a.txt");
//        复制数据
        byte[]bys = new byte[1024];
        int len = 0;
        while ((len=fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }
//        释放资源
        fos.close();
        fis.close();
    }
}