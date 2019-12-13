package CollectionFramework.SetPackage;

import java.util.HashSet;
import java.util.Random;

/**
 * Created by Lzf on 2018/10/8.
 */
/*获取10个1至20的随机数，要求随机数不能重复。

我们先来分析一下：

A:创建随机数对象
B:创建一个HashSet集合
C:判断集合的长度是不是小于10
是：就创建一个随机数添加
否：不理它
D:遍历HashSet集合*/
public class HashSetTest {
    public static void main(String[] args) {
        Random r =new Random();
        HashSet<Integer> hs = new HashSet<Integer>();
        while (hs.size()<10){
            hs.add(r.nextInt(20));
        }
        for (Integer i : hs){
            System.out.println(i);
        }
    }
}
