package ArraySort;

import java.util.Arrays;

/**
 * Created by Lzf on 2018/9/25.
 */
/*rrays类概述
针对数组进行操作的工具类。
提供了排序，查找等功能。
成员方法
public static String toString(int[] a)：把数组转成字符串
public static void sort(int[] a)：对数组进行排序
public static int binarySearch(int[] a,int key)：二分查找
*/
public class ArrayClass {
    public static void main(String[] args) {
        int[]arrs ={44,33,11,22,55};
        System.out.println(Arrays.toString(arrs));
//        快速查询
        Arrays.sort(arrs);
        System.out.println(Arrays.toString(arrs));
//        二分查找，查找数组下标
        System.out.println(Arrays.binarySearch(arrs,44));
    }
}
