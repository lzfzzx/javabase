package FileDemo;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Lzf on 2018/10/8.
 */
/*获取功能（基本获取功能）
public String getAbsolutePath()：获取绝对路径
public String getPath():获取相对路径
public String getName():获取名称
public long length():获取长度。字节数
public long lastModified():获取最后一次的修改时间，毫秒值
获取功能（高级获取功能）
public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组
*/
public class FileDemo6 {
    public static void main(String[] args) {
        File file = new File("d:\\filetest\\bb.jpg");
        System.out.println("getAbsolutePath:"+file.getAbsolutePath());
        System.out.println("getPath:"+file.getPath());
        System.out.println("getName:"+file.getName());
        System.out.println("length:"+file.length());
        System.out.println("lastModified:"+file.lastModified());
        Date d = new Date(file.lastModified());
        SimpleDateFormat s = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String st = s.format(d);
        System.out.println(st);
        System.out.println("______________________");

//        指定一个目录
        File file1 = new File("d:\\");
        String[] strArrays = file1.list();
        for (String s1 : strArrays){
            System.out.println(s1);
        }
        System.out.println("______________________");

        File[]files = file1.listFiles();
        for (File f : files){
            System.out.println(f.getName());
        }
    }
}
/*我们运行程序后可以发现两种方法的输出结果是相同的。那么有什么区别呢。
如果我们仅仅只是获取文件名称的话，用第一种方法就可以了，
第二种方法他返回的是File对象，我们除了可以拿文件的名称之外，
还可以获取文件的绝对、相对路径、文件的大小，最后一次的修改时间*/