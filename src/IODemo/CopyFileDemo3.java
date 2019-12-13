package IODemo;

import java.io.*;

/**
 * Created by Lzf on 2018/10/9.
 */
/*字符缓冲流特殊功能复制文本文件*/
public class CopyFileDemo3 {
    public static void main(String[] args) throws IOException {
        // 封装数据源
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        // 封装目的地
        BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));

        // 读写数据
        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        // 释放资源
        bw.close();
        br.close();
    }
}
/*我们要切记readLine()和newLine()是BufferedReader和BufferedWriter 的特殊功能。*/