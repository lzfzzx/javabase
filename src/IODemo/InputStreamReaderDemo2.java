package IODemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Lzf on 2018/10/9.
 */
/*OutputStreamWriter读数据方法
public int read()：一次读取一个字符
public int read(char[] cbuf)：一次读取一个字符数组*/
public class InputStreamReaderDemo2 {
    public static void main(String[] args) throws IOException {
        // 创建对象
        InputStreamReader isr = new InputStreamReader(new FileInputStream(
                "osw.txt"));

        // 一次读取一个字符
        int ch = 0;
        while ((ch = isr.read()) != -1) {
            System.out.print((char) ch);
        }

        // 释放资源
        isr.close();
    }
}
/*上面是一次读取一个字符，当然我们也可以一次读取一个字符数组
// 一次读取一个字符数组
        char[] chs = new char[1024];
        int len = 0;
        while ((len = isr.read(chs)) != -1) {
            System.out.print(new String(chs, 0, len));
        }*/