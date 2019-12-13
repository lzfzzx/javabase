package BaseType;

import java.util.Arrays;

/**
 * Created by Lzf on 2018/9/27.
 */
/*最后一个成员方法public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
  我们先来说方法中的参数分别是什么意思
  src——源数组
  srcPos——原数组中的起始位置
  dest——目标数组
  destPos——目标数组中的起始位置
  length——要复制的数组元素的数量
  了解了参数，我们来一起联系一下
*/
public class SystemDemo3 {
    public static void main(String[] args) {
        int[]arr = {11,22,33,44,55};
        int[]arr2 = {6,7,8,9,10};
        int[]arr3 = new int[4];
        System.arraycopy(arr,1,arr2,2,2);
        System.arraycopy(arr,0,arr3,0,4);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}
