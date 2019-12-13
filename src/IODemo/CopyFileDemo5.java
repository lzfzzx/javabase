package IODemo;

import java.io.*;

/**
 * Created by Lzf on 2018/10/9.
 */
/*我们用打印流来复制一个文件,我们先来分析
需求：1.txt复制到Copy.txt中(首先你要确认有1.txt，并有内容)
数据源：1.txt – 读取数据 –> FileReader –高效，所以用–> BufferedReader
目的地：Copy.txt – 写出数据 –> FileWriter –> BufferedWriter –> PrintWriter
*/
public class CopyFileDemo5 {
    public static void main(String[] args) throws IOException {
//        封装数据源
        BufferedReader br = new BufferedReader(new FileReader("pw2.txt"));
//        封装目的地
        PrintWriter pw = new PrintWriter(new FileWriter("Copy.txt"),true);
        String line = null;
        while ((line=br.readLine())!=null){
            pw.println(line);
        }
        pw.close();
        br.close();
    }
}
