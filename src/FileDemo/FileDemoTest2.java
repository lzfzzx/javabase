package FileDemo;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by Lzf on 2018/10/8.
 */
/*文件夹名称过滤器*/
public class FileDemoTest2 {
    public static void main(String[] args) {
        File file = new File("d:\\");
//        获取该目录下所有文件或文件夹的string数组
        String[] strArray = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
//                如果是文件，输出以.jpg结尾的文件
                return new File(dir,name).isFile()&&name.endsWith(".jpg");
            }
        });
//        遍历
        for (String s : strArray){
            System.out.println(s);
        }
    }
}
