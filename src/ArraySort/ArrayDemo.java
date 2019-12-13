package ArraySort;

/**
 * Created by Lzf on 2018/9/25.
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arrs ={13,24,36,13,14,77,57};
        printArray(arrs);
        selectSort(arrs);
//        bubbleSort(arrs);
        printArray(arrs);


    }
//    遍历数组
    public static void printArray(int arr[]){
        System.out.print("[");
        for (int i = 0; i <arr.length ; i++) {
                if (i==arr.length-1){
                    System.out.print(arr[i]);
                }
                else {
                    System.out.print(arr[i]+",");
                }
        }
        System.out.println("]");


    }
    //        冒泡排序
    /*其实他的原理很简单：
在第一趟：首先比较第1个和第2个数，将小数放前，大数放后。然后比较第2个数和第3个数，
将小数放前，大数放后，如此继续，直至比较最后两个数，将小数放前，大数放后。至此第一趟结束，将最大的数放到了最后。
在第二趟：仍从第一对数开始比较（因为可能由于第2个数和第3个数的交换，使得第1个数不再小于第2个数）将小数放前，
大数放后，一直比较到倒数第二个数（倒数第一的位置上已经是最大的），第二趟结束，在倒数第二的位置上得到一个新的最大数
（其实在整个数列中是第二大的数）。如此下去，重复以上过程，直至最终完成排序。
*/
    public static void bubbleSort(int[]arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    //数组排序之选择排序
    //我们在上面的Demo中，只需用把上面冒泡排序的方法换成下面我们选择排序的方法
    public static void selectSort(int[] arr){
        for(int x=0; x<arr.length-1; x++){
            for(int y=x+1; y<arr.length; y++){
                if(arr[y] <arr[x]){
                    int temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
                }
            }
        }
    }


}
/* 把字符串中的字符进行排序。举例：”dacgebf”。结果：”abcdefg”

//首先我们将一个字符串"dacgebf"经过排序后成为"abcdefg"下面先来分析一下
//1.定义一个字符串  2.把字符串转换为字符数组  3.把字符数组进行排序  4.把排序后字符数组转成字符串  5.输出最后的字符
  // 定义一个字符串
        String s = "dacgebf";
        // 把字符串转换为字符数组
        char[] chs = s.toCharArray();
        // 把字符数组进行排序
        bubbleSort(chs);
        //把排序后的字符数组转成字符串
        String result = String.valueOf(chs);
        //输出最后的字符串
        System.out.println("result:"+result);*/
