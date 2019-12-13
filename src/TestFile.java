import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Lzf on 2019/1/16.
 */
public class TestFile {

    List<String> getFileNames(String dir) {
//        判断文件夹是否存在
        List<String> fileNames = new ArrayList<String>();
        File file = new File(dir);
        if (file == null || !file.exists()) {
            return fileNames;
        }
//        遍历文件夹
        LinkedList<File> list = new LinkedList<File>();
        File[] files = file.listFiles();
        for (File it : files) {
            if (!it.isDirectory()) {
                fileNames.add(it.getName());
            }
        }
        return fileNames;

    }

}
