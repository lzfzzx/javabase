package IODemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Lzf on 2018/10/9.
 */
//上面我们写入数据的时候指定了UTF-8的编码格式，那么我们在读取数据的时候也要指定是UTF-8的编码格式，
// 如果我们不指定采用默认的编码格式写入数据，那么在读取数据的时候我们也不用去指定了，代码也会采用默认的编码去读取。
//那么我们就来完成上面文件的读取代码
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        // 创建对象
        InputStreamReader isr = new InputStreamReader(new FileInputStream("osw.txt"), "UTF-8");

        // 读取数据
        // 一次读取一个字符
        int ch = 0;
        while ((ch = isr.read()) != -1) {
            System.out.print((char) ch);
        }

        // 释放资源
        isr.close();
    }
}
