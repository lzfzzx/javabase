package IODemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Created by Lzf on 2018/10/9.
 */
/*转换流概述
OutputStreamWriter 字符输出流
public OutputStreamWriter(OutputStream out)：根据默认编码把字节流的数据转换为字符流
public OutputStreamWriter(OutputStream out,String charsetName)：根据指定编码把字节流数据转换为字符流
InputStreamReader 字符输入流
public InputStreamReader(InputStream in)：用默认的编码读取数据
public InputStreamReader(InputStream in,String charsetName)：用指定的编码读取数据
这两个其实很好理解，只要我们保持读取数据和写入数据的编码格式一致就可以了。*/
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
//        创建对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"),"utf-8");
//        写数据
        osw.write("中国");
//        释放资源
        osw.close();
    }
}
