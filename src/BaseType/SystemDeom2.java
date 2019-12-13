package BaseType;

/**
 * Created by Lzf on 2018/9/27.
 */
/*System.currentTimeMillis() 返回以毫秒为单位的当前时间*/
public class SystemDeom2 {
    public static void main(String[] args) {
        long strat = System.currentTimeMillis();
        for (int i = 0; i <100000 ; i++) {
            System.out.println(i+" ");

        }
        long end = System.currentTimeMillis();
        System.out.println(strat);
        System.out.println(end);
        System.out.println("共耗时间"+(end - strat)+"毫秒");
    }
}
