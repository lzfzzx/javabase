package IODemo;

import java.io.*;

/**
 * Created by Lzf on 2018/10/9.
 */
/*字节流复制数据4种方式和字符流复制数据5种方式学习
字节流复制数据
4种方式
字符流复制数据
5种方式
  注意：我们除了用windows记事本能读懂的数据用字符流以外，其余的全部使用字节流。
  下面我们就来给大家写一个例子总结一下
  先总结字符流复制数据的 5种方式推荐掌握第5种。*/
//我们将c盘根目录下的a.txt文件复制到d盘根目录下并命名为b.txt
public class CopyFileDemo4 {
    public static void main(String[] args) throws IOException {
        String srcString = "c:\\a.txt";
        String destString = "d:\\b.txt";
        method1(srcString, destString);//第一种--基本字符流一次读写一个字符
        method2(srcString, destString);//第二种--基本字符流一次读写一个字符数组
        method3(srcString, destString);//第三种--字符缓冲流一次读写一个字符
        method4(srcString, destString);//第四种--字符缓冲流一次读写一个字符数组
        method5(srcString, destString);//第五种-- 字符缓冲流一次读写一个字符串
    }

    // 第五种字符缓冲流一次读写一个字符串
    private static void method5(String srcString, String destString)
            throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(srcString));
        BufferedWriter bw = new BufferedWriter(new FileWriter(destString));

        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        bw.close();
        br.close();
    }

    // 第四种字符缓冲流一次读写一个字符数组
    private static void method4(String srcString, String destString)
            throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(srcString));
        BufferedWriter bw = new BufferedWriter(new FileWriter(destString));

        char[] chs = new char[1024];
        int len = 0;
        while ((len = br.read(chs)) != -1) {
            bw.write(chs, 0, len);
        }

        bw.close();
        br.close();
    }

    // 第三种字符缓冲流一次读写一个字符
    private static void method3(String srcString, String destString)
            throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(srcString));
        BufferedWriter bw = new BufferedWriter(new FileWriter(destString));

        int ch = 0;
        while ((ch = br.read()) != -1) {
            bw.write(ch);
        }

        bw.close();
        br.close();
    }

    // 第二种基本字符流一次读写一个字符数组
    private static void method2(String srcString, String destString)
            throws IOException {
        FileReader fr = new FileReader(srcString);
        FileWriter fw = new FileWriter(destString);

        char[] chs = new char[1024];
        int len = 0;
        while ((len = fr.read(chs)) != -1) {
            fw.write(chs, 0, len);
        }

        fw.close();
        fr.close();
    }

    // 第一种基本字符流一次读写一个字符
    private static void method1(String srcString, String destString)
            throws IOException {
        FileReader fr = new FileReader(srcString);
        FileWriter fw = new FileWriter(destString);

        int ch = 0;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }

        fw.close();
        fr.close();
    }
}
