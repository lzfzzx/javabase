import sun.font.TrueTypeFont;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 */
public class Main {
//@SuppressWarnings("unused")
 //   public static void main(String[] args){
//        System.out.println("Hello World!");
//        System.out.println(100);//十进制
//        System.out.println(0b100);//二进制转十进制
//        System.out.println(0100);//八进制转十进制
//        System.out.println(0x100);//十六进制转十进制s

////大转小强转，精度损失
//        double i = 1.234567891223;
//        float t =(float)i;
//        System.out.println("double:"+i);
//        System.out.println("float:"+t);

////整数相除只保留整数，可以用类型强转
//        System.out.println((float)9/4);


////    “&”和“&&”的区别：
////    单&时，左边无论真假，右边都进行运算；
////    双&时，如果左边为真，右边参与运算，如果左边为假，那么右边不参与运算。
////|”和“||”的区别同理，双或时，左边为真，右边不参与运算。
//        if (6<3&4>3){
//            System.out.println("True");
//        }else {
//            System.out.println("False");
//        }


////流程控制：
//    int x = 10;
//    if(x==10){
//        System.out.println("x等于10");
//    }else if(x==20){
//        System.out.println("x=20");
//    }


//    Scanner scanner = new Scanner(System.in);
//    boolean a = true;
//    try {
//    while (a) {
//        System.out.println("请输入月份：");
//
//            int i = scanner.nextInt();
//
//        if (i < 1 || i > 12) {
//            System.out.println("请重新输入");
//
//        } else if (i >= 3 && i <= 5) {
//            System.out.println("春季");
//            a = false;
//        } else if (i >= 6 && i <= 8) {
//            System.out.println("夏季");
//            a = false;
//        } else if (i >= 9 && i <= 11) {
//            System.out.println("秋季");
//            a = false;
//        } else {
//            System.out.println("冬季");
//            a = false;
//        }

//    }
//    }catch (InputMismatchException e){
//        System.out.println(e.toString());
//    }
//
//
/*
* 统计水仙花数(for循环应用)
* 分析：
A:首先必须知道什么是水仙花数
所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。
举例：153就是一个水仙花数。
153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
B:定义统计变量，初始化值是0
C:三位数告诉了我们范围，用for循环就可以搞定
D:获取每一个三位数的个，十，百的数据
E:按照要求进行判断
F:如果满足要求就计数
* */
//public static void main(String[] args) {
//    int  count = 0;
//    for (int i = 100; i <1000 ; i++) {
//        int a =i % 10 ;
//        int b = i / 10 % 10;
//        int c = i / 100 % 10;
//        if (i == a*a*a + b*b*b + c*c*c) {
//            count++;
//            System.out.println("水仙花数"+i);
//        }
//    }
//    System.out.println("水仙花个数"+count);
//}

    /*
    需求：我国最高山峰是珠穆朗玛峰：8848m，我现在有一张足够大的纸张，厚度为：0.01m。
请问，我折叠多少次，就可以保证厚度不低于珠穆朗玛峰的高度?
    * */

//    public static void main(String[] args) {
//        int count=0;
//        double thickness=0.01;
//        double thicknesstotal = 8848;
//        while (thickness<thicknesstotal){
//            count++;
//            thickness*=2;
//            System.out.println("第"+count+"次"+"厚度"+thickness+"M");
//        }
//        System.out.println("答案：叠"+count+"次");
//    }


    /*
    * do…while循环语句和上面的两种循环语句又有什么区别呢？我们来涨姿势
区别：do…while循环至少会执行一次循环体。
for循环和while循环只有在条件成立的时候才会去执行循环体
注意：
写程序优先考虑for循环，再考虑while循环，最后考虑do…while循环。
while(true){}和for(;;){}都是死循环
    * */

    /**
     * @param args
     */
    /*
    * 循环嵌套
    * 请输出一个4行5列的星星(*)图案
    * */
//    public static void main(String[] args) {
//
//        for (int i = 0; i <4 ; i++) {
//            for (int j = 0; j <5 ; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//
//        }
//
//    }
    /*
    * 需求：在控制台输出九九乘法表。

     */
//    public static void main(String[] args) {
//        for (int i = 1; i <10 ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(i+"x"+j+"="+i*j+"\t");
//            }
//            System.out.println();
//        }
//    }


  }







