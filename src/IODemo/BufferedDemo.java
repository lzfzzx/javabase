package IODemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Lzf on 2018/10/9.
 */
/*字符缓冲流的特殊用法
  我们在上面讲字符缓冲流输出数据的时候，代码中用到了**换行**newLine()
  那么我们下面就来讲一下字符缓冲流的特殊用法
  BufferedWriter:
  public void newLine():根据系统来决定换行符
  BufferedReader:
  public String readLine()：一次读取一行数据
根据系统来决定换行符，这个用法很简单，就不做演示了，我们来看下 BufferedReader的readLine()方法
  readLine( )：包含该行内容的字符串，不包含任何行终止符，如果已到达流末尾，则返回 null*/
public class BufferedDemo {
    public static void main(String[] args)  {

        try {
            // 创建字符缓冲输入流对象
            BufferedReader br = new BufferedReader(new FileReader("bw.txt"));

            // 一次读取一行数据
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            //释放资源
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
