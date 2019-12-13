package FileDemo;
import java.io.*;
/**
 * Created by Lzf on 2018/10/8.
 */
/*我们要想实现IO的操作，就必须知道硬盘上文件的表现形式。而Java就提供了一个类File供我们使用。所以这篇我们来学习File类
File类
File类的概述
文件和目录(文件夹)路径名的抽象表示形式
构造方法
File(String pathname)：根据一个路径得到File对象
File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象
*/
public class FileDemo {
    public static void main(String[] args) {
        File file = new File("D:\\FileTest\\a.txt");

        File file2 = new File("D:\\FileTest","a.txt");

        File file3 = new File("D:\\FileTest");
        File file4= new File(file3,"a.txt");
//        三种效果一样
    }
}
