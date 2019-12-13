package FileDemo;

import java.io.File;

/**
 * Created by Lzf on 2018/10/8.
 */
/*删除功能
public boolean delete()*/
public class FileDemo3 {
    public static void main(String[] args) {
        File file = new File("D:\\filetest\\a.txt");
        System.out.println("delete:" + file.delete());

        File file1 = new File("D:\\filetest\\aa\\bb");
        File file2 = new File("D:\\filetest\\aa");
        System.out.println("delete:"+file1.delete());
        System.out.println("delete:"+file2.delete());
    }
}

/*成功删除文件或文件夹后，会返回true。

  我们来总结一下删除方法要注意的事项
  A:如果你创建文件或者文件夹忘了写盘符路径，那么，默认在项目路径下。
  B:Java中的删除不走回收站。也就是永久删除。
  C:要删除一个文件夹，请注意该文件夹内不能包含文件或者文件夹
*/