package IODemo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Lzf on 2018/10/9.
 */
public class BufferedInputStreamDemo {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("bos.txt"));

//        读取数据
        int by = 0;
        while ((by=bis.read())!=-1){
            System.out.println((char)by);
        }
//        释放资源
        bis.close();
    }
}
/*很明显我们有两种方式可以读取，上面的读取数据的方法也可以写成下面这样的
        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = bis.read(bys)) != -1) {
            System.out.print(new String(bys, 0, len));
        }12345

但是要注意，这两种方式针对同一个对象在一个代码中只能使用一个。
*/