package FileDemo;

import java.io.File;
import java.io.IOException;

/**
 * Created by Lzf on 2018/10/8.
 */
/*重命名功能
public boolean renameTo(File dest)*/
public class FileDemo4 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\filetest\\aa.jpg");
        file.createNewFile();

        File file1 = new File("D:\\filetest\\bb.jpg");
        System.out.println("renameTo:"+file.renameTo(file1));
    }
}

/*这个方法不是很难，但是我们也要注意几个知识点

如果路径名相同，就是改名。
如果路径名不同，就是改名并剪切。
路径以盘符开始：绝对路径 c:\a.txt
路径不以盘符开始：相对路径 a.txt*/