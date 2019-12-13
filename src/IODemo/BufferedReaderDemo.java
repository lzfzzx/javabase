package IODemo;

/**
 * Created by Lzf on 2018/10/9.
 */
/*下面我们来学习BufferedReader:字符缓冲输入流

从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取。
可以指定缓冲区的大小，或者可使用默认的大小。大多数情况下，默认值就足够大了。*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class BufferedReaderDemo {
    public static void main(String[] args) {
        try {
            // 创建字符缓冲输入流对象
            BufferedReader br = new BufferedReader(new FileReader("bw.txt"));
            // 一次读取一个字符
            int ch = 0;
            while ((ch = br.read()) != -1) {
                System.out.print((char) ch);
            }

            // 释放资源
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
/*// 一次读取一个字符数组
            char[] chs = new char[1024];
            int len = 0;
            while ((len = br.read(chs)) != -1) {
                System.out.print(new String(chs, 0, len));
            }*/