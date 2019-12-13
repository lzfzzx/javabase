package IODemo;

import java.io.*;

/**
 * Created by Lzf on 2018/10/9.
 */
/*合并流
  SequenceInputStream
  概述:SequenceInputStream类可以将多个输入流串流在一起，合并为一个输入流，因此，该流也被称为合并流。
SequenceInputStream的构造方法
SequenceInputStream(InputStream s1, InputStream s2)
SequenceInputStream(Enumeration < ? extends InputStream> e)
把多个文件的内容写入到一个文本文件
  以前我们只是将一个文件的内容复制到另外一个文件中，现在这个合并流可以实现将两个及多个文件的内容复制到一个文件中了，我们来实现以下吧*/
// 需求：把ByteArrayStreamDemo.java和DataStreamDemo.java的内容复制到Copy.java中

public class SequenceInputStreamDemo {
    public static void main(String[] args) throws IOException {
        InputStream s1 = new FileInputStream("fos.txt");
        InputStream s2 = new FileInputStream("bw.txt");
        SequenceInputStream sis = new SequenceInputStream(s1, s2);
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Copy.txt"));

        // 读写操作
        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = sis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }

        bos.close();
        sis.close();
    }
}
/*运行程序，我们会在Copy.java文件中看到那三个文件的内容，我们要是想合并四个或者以上的文件，
只需要继续将文件创建输入流对象然后添加在Vector集合中就可以实现了。*/
