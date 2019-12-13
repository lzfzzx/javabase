import java.util.Scanner;

/**
 * Created by Lzf on 2018/9/9.
 */
public class ArrayTest {
    /*
    * 数组概念
数组是存储同一种数据类型多个元素的集合。也可以看成是一个容器。
数组既可以存储基本数据类型，也可以存储引用数据类型。
数组格式

格式1：数据类型[] 数组名;
格式2：数据类型 数组名[];
注意：这两种格式中，数组中是没有元素值的。我们要对数组的元素进行初始化。
数组初始化的概述：

Java中的数组必须先初始化,然后才能使用。
为数组中的数组元素分配内存空间，并为每个数组元素赋值。
数组初始化的方式：
1、动态初始化：初始化时只指定数组长度，由系统为数组分配初始值。
2、静态初始化：初始化时指定每个数组元素的初始值，由系统决定数组长度。*/

    /*1、动态初始化
    * 格式：数据类型[] 数组名 = new 数据类型[数组长度];
    数组长度其实就是数组中元素的个数。
    */
    int[] arrs = new int[3];

/*
* 2、静态初始化
格式：数据类型[] 数组名 = new 数据类型[]{元素1,元素2,…};*/

    int[] arrs2 = new int[]{1,2,3};
    //简化
    int[] arrs3 ={1,2,3};

    /*
    * Java中数组的内存分配
Java 程序在运行时，需要在内存中的分配空间。为了提高运算效率，就对空间进行了不同区域的划分，因为每一片区域都有特定的处理数据方式和内存管理方式。

栈内存——存储局部变量
堆内存——存储new出来的东西
方法区
本地方法区 (和系统相关)
寄存器 (给CPU使用)
上面提到了局部变量，我们来解释一下
局部变量：方法定义中或者方法声明上的所有变量，使用完毕，立即消失。*/

    /*
    数组遍历：
    数组的遍历就是依次输出数组中的每一个元素。
数组提供了一个属性length，用于获取数组的长度。
格式：数组名.length
    * */
//    public static void main(String[] args) {
//        int[]a={1,2,3,4};
//        System.out.println(a.length);
//        for (int i = 0; i <a.length ; i++) {
//            System.out.println(a[i]);
//
//        }
//    }
//    public static void main(String[] args) {
//        int a[]={11,22,33,44,55,66};
//        printArrays(a);
//    }
//    public static void printArrays(int[]args){
//        System.out.print("[");
//        for (int i = 0; i <args.length ; i++) {
//            if (i==args.length-1) {
//                System.out.print(args[i] + "]");
//            }
//            else {
//                System.out.print(args[i]+",");
//            }
//        }
//
//
//    }
/*获取数组中最大值和最小值
* */

//public static int maxArrays(int[]args){
//    //取任意一个数组元素为参照物
//    int max=args[0];
//    for (int i = 0; i <args.length ; i++) {
//
//        if (max<args[i]){
//            max=args[i];
//        }
//    }
//    return max;
//}
//public static int minArrays(int[]args){
//    int min = args[0];
//    for (int i = 0; i <args.length ; i++) {
//        if (min>args[i]){
//            min = args[i];
//        }
//    }
//    return min;
//}
//
//    public static void main(String[] args) {
//        int a[]={21,93,11,44,38,123};
//        System.out.println("数组最大值"+maxArrays(a));
//        System.out.println("数组最小值"+minArrays(a));
//
//    }

    /*
    二维数组：
    概述：一个元素为一维数组的数组。

格式

数据类型[][] 变量名 = new 数据类型[m][n]；
m表示这个二维数组有多少个一维数组
n表示每一个一维数组的元素个数
举例：
int[][] arr = new int[3][2];
定义了一个二维数组arr
这个二维数组有3个一维数组，名称是arr[0],arr[1],arr[2]
每个一维数组有2个元素，可以通过arr[m][n]来获取
表示获取第m+1个一维数组的第n+1个元素

二维数组还有两种格式：
格式2：数据类型[][] 变量名 = new 数据类型[m][];
格式3：数据类型[][] 变量名 = {{元素…},{元素…},{元素…}};
    * */

    /*
//需求：打印杨辉三角形
    1
    1 1
    1 2 1
    1 3 3 1
    1 4 6 4 1
    1 5 10 10 5 1
分析：看这种图像的规律
    A:任何一行的第一列和最后一列都是1
    B:从第三行开始，每一个数据是它上一行的前一列和它上一行的本列之和。
步骤：
        A:首先定义一个二维数组。行数如果是n，我们把列数也先定义为n。这个n的数据来自于键盘录入。
        B:给这个二维数组任何一行的第一列和最后一列赋值为1
        C:按照规律给其他元素赋值从第三行开始，每一个数据是它上一行的前一列和它上一行的本列之和。
        D:遍历这个二维数组。
*/
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("请输入杨辉三角的行数：");
        int a = scan.nextInt();
        int b[][] =new int[a][a];
        for (int i = 0; i <b.length ; i++) {
            b[i][0]=1;
            b[i][i]=1;

        }
        for (int i = 2; i <b.length ; i++) {
            //这里如果y<=x是有个小问题的，就是最后一列的问题
            //所以这里要减去1
            //并且y也应该从1开始，因为第一列也是有值了
            for (int j =1;j<=i-1 ; j++){
               b[i][j]=b[i-1][j-1]+b[i-1][j];
            }
        }
        for (int i = 0; i <b.length ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(b[i][j]+"\t");
                
            }
            System.out.println();
            
        }
    }


}
