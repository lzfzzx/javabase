package IODemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Lzf on 2018/10/9.
 */
/*转换流的简化写法
  转换流的名字比较长，而我们常见的操作都是按照本地默认编码实现的，所以，为了简化我们的书写，转换流提供了对应的子类。
  FileWriter
  FileReader

所以呢，我们就可以得出一下总结
OutputStreamWriter = FileOutputStream + 编码表(GBK)
FileWriter = FileOutputStream + 编码表(GBK)
InputStreamReader = FileInputStream + 编码表(GBK)
FileReader = FileInputStream + 编码表(GBK)
那我们就用FileWriter和FileReader来复制一个文件的操作吧
*/
public class CopyFileDemo2 {
    public static void main(String[] args) throws IOException {
        // 封装数据源
        FileReader fr = new FileReader("a.txt");
        // 封装目的地
        FileWriter fw = new FileWriter("b.txt");

        // 一次一个字符
        int ch = 0;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }

        // 释放资源
        fw.close();
        fr.close();
    }
}
/*// 一次一个字符数组
        char[] chs = new char[1024];
        int len = 0;
        while ((len = fr.read(chs)) != -1) {
            fw.write(chs, 0, len);
            fw.flush();
        }*/