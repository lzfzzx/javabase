package FileDemo;

import java.io.File;
import java.io.IOException;

/**
 * Created by Lzf on 2018/10/8.
 */
/*File类的成员方法
创建功能：
public boolean createNewFile():创建文件 如果存在这样的文件，就不创建了
public boolean mkdir():创建文件夹 如果存在这样的文件夹，就不创建了
public boolean mkdirs():创建文件夹,如果父文件夹不存在，会帮你创建出来
*/
public class FileDemo2 {
    public static void main(String[] args) throws IOException {
//        创建文件夹
        File file =new File("D:\\FileTest");
        System.out.println("mkdir:"+file.mkdir());
//        创建文件
        File file1 = new File("D:\\FileTest\\a.txt");
        System.out.println("createNewFile:"+file1.createNewFile());
//        创建多级目录
        File file2 = new File("D:\\FileTest\\aa\\bb");
        System.out.println(file2.mkdirs());

    }

}
/*如果你的盘符中没有改目录或改文件，输出结果会给你返回true，如果有就会返回false。

这这里要注意几点
要想在某个目录下创建内容，该目录首先必须存在。
要创建文件还是文件夹，要弄清楚，方法不要调错了。*/