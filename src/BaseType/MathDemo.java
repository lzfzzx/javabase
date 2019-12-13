package BaseType;

import java.util.Random;

/**
 * Created by Lzf on 2018/9/26.
 */
/*Math类


Math类概述
Math 类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数。
成员变量
public static final double PI
public static final double E
成员方法
public static int abs(int a)：绝对值
public static double ceil(double a):向上取整
public static double floor(double a):向下取整
public static int max(int a,int b):最大值
public static double pow(double a,double b):a的b次幂
public static double random():随机数 [0.0,1.0)
public static int round(float a) 四舍五入
public static double sqrt(double a):正平方根
*/
public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.PI);//圆周率
        System.out.println(Math.E);//自然数e
        System.out.println(Math.abs(-10));//绝对值
        System.out.println(Math.ceil(12.53));//向上取整
        System.out.println(Math.floor(12.53));//向下取整
        System.out.println(Math.max(3, 5));//最大值
//        方法嵌套调用
        System.out.println(Math.max(Math.max(1, 2), 3));
        System.out.println(Math.pow(2, 3));//2的3次幂
        System.out.println(Math.pow(3, 2));
        System.out.println(Math.random());//0到1的随机数
        System.out.println(Math.round(12.3));//四舍五入
        System.out.println(Math.round(12.5));
        System.out.println(Math.sqrt(4));

        /*
        * Random类
Random类概述
此类用于产生随机数
如果用相同的种子创建两个 Random 实例，则对每个实例进行相同的方法调用序列，它们将生成并返回相同的数字序列。
构造方法
public Random()
public Random(long seed)
成员方法
public int nextInt()：返回的是int范围内的随机数
public int nextInt(int n):返回的是[0,n)范围的内随机数
*/
        // 创建对象
        Random r = new Random();
        for (int x = 0; x < 10; x++) {
            // int num = r.nextInt();//返回的是int范围内的随机数
            int num = r.nextInt(100) + 1;//本来返回的是[0,100)范围的内随机数，+1后返回[1,100)
            System.out.println(num);
        }

        //创建对象,给出指定的种子
        Random rs = new Random(123);
        for (int x = 0; x < 10; x++) {
            int num = rs.nextInt(100) + 1;
            System.out.println(num);//给定种子后，每次得到的随机数是相同的。
        }
    }
}
