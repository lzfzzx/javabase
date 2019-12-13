package FileDemo;

import java.io.File;
import java.io.IOException;

/**
 * Created by Lzf on 2018/10/8.
 */
/*判断d盘是否含有后缀名为.jpg的文件*/
public class FileDemoTest {
    public static void main(String[] args) throws IOException {
//        封装d判断目录
        File file = new File("D:\\");
        File file1 = new File("D:\\aa.jpg");
        file1.createNewFile();
//        获取该目录下所有文件或文件夹的File数组
        File[]files =file.listFiles();
        for (File f : files ){
//            判断是否为文件
            if (f.isFile()){
//                判断是否以.jpg结尾
                if (f.getName().endsWith(".jpg")){
//                    就输出该文件名称
                    System.out.println(f.getName());
                }
            }
        }

    }
}
