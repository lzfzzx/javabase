/**
 * Created by Lzf on 2018/9/9.
 */
public class MethodTest {

    /*
    * 方法格式：

修饰符 返回值类型 方法名(参数类型 参数名1,参数类型 参数名2...) {
            方法体语句;
            return 返回值;
        }
    * */
//    public static void main(String[] args) {
//        int x = 10;
//        int y = 20;
//        System.out.println(sum(x,y));
//
//
//    }
//    public static int sum(int a , int b){
//        /*
//         * 明确：返回值类型：int
//         * 参数列表：2个，都是int类型
//         */
//
//        return a+b;
//    }

    /*
    方法重载：
    方法重载概述
在同一个类中，允许存在一个以上的同名方法，只要它们的参数个数或者参数类型不同即可。
方法重载特点
与返回值类型无关，只看方法名和参数列表
在调用时，虚拟机通过参数列表的不同来区分同名方法
    * */
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }

    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        int d=40;
        System.out.println(sum(a,b));
        System.out.println(sum(a,b,c));
        System.out.println(sum(a,b,c,d));
    }
}
