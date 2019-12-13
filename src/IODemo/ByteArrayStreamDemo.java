package IODemo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by Lzf on 2018/10/9.
 */
/*内存操作流
操作字节数组
ByteArrayInputStream
ByteArrayOutputStream
操作字符数组
CharArrayReader
CharArrayWrite
操作字符串
StringReader
StringWriter
  内存操作流一般用于处理临时信息，因为临时信息不需要保存，使用后就可以删除。
*/
public class ByteArrayStreamDemo {
    public static void main(String[] args) throws IOException {
        // 写数据 --字节数组输出流
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // 写数据
        for (int x = 0; x < 10; x++) {
            baos.write(("hello" + x).getBytes());
        }

        // 释放资源
        // 通过查看源码我们知道这里什么都没做，所以根本需要close()
        // baos.close();

        // public byte[] toByteArray()
        byte[] bys = baos.toByteArray();

        // 读数据
        // ByteArrayInputStream(byte[] buf)
        ByteArrayInputStream bais = new ByteArrayInputStream(bys);

        int by = 0;
        while ((by = bais.read()) != -1) {
            System.out.print((char) by);
        }

        // bais.close();
    }
}
/*上面我们写英文字符数据可以运用字节数组的输出流ByteArrayOutputStream，如果我们写入中文数据的话就要用操作字符数组的流CharArrayWrite了。
那么，剩下的操作字符数组和操作字符串的例子就不做演示了，大家可以自己练练。*/