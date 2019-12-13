package IODemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Lzf on 2018/10/9.
 */
public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        // 为了提高写入流的效率加入了缓冲技术
        BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
//    写入数据
        bw.write("hello");
//        换行
        bw.newLine();
        bw.write("world");
        bw.newLine();
        bw.write("java");
//        只要用到缓冲区，就需要刷新
        bw.flush();;
//        释放资源
        bw.close();
    }


}
