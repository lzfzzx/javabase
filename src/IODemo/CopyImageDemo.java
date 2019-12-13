package IODemo;

import java.io.*;

/**
 * Created by Lzf on 2018/10/9.
 */
/*继续总结一下字节流复制数据的4种方式
我们知道用记事本打开并能够读懂，就用字符流，否则用字节流。
所以我们就来复制图片我们有4种方式。推荐掌握第4种。*/
public class CopyImageDemo {
    public static void main(String[] args) throws IOException {
        // 使用File对象做为参数
        File srcFile = new File("c:\\a.jpg");
        File destFile = new File("d:\\b.jpg");

        method1(srcFile, destFile);//第一种--基本字节流一次读写一个字节数组
        method2(srcFile, destFile);//第二种--基本字节流一次读写一个字节数组
        method3(srcFile, destFile);//第三种--字节缓冲流一次读写一个字节
        method4(srcFile, destFile);// 第四种--字节缓冲流一次读写一个字节数组
    }

    // 第四种字节缓冲流一次读写一个字节数组
    private static void method4(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
                srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream(destFile));

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }

        bos.close();
        bis.close();
    }

    // 第三种字节缓冲流一次读写一个字节
    private static void method3(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
                srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream(destFile));

        int by = 0;
        while ((by = bis.read()) != -1) {
            bos.write(by);
        }

        bos.close();
        bis.close();
    }

    // 第二种基本字节流一次读写一个字节数组
    private static void method2(File srcFile, File destFile) throws IOException {
        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }

        fos.close();
        fis.close();
    }

    // 第一种基本字节流一次读写一个字节
    private static void method1(File srcFile, File destFile) throws IOException {
        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);

        int by = 0;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }

        fos.close();
        fis.close();
    }
}

