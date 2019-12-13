package BaseType;

import java.math.BigInteger;

/**
 * Created by Lzf on 2018/9/27.
 */
/*BigInteger类概述
可以让超过Integer范围内的数据进行运算
构造方法
public BigInteger(String val) */
//public class BigIntegerDemo {
//    public static void main(String[] args) {
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//        //超过这个范围使用BigInteger
//        BigInteger bigInteger = new BigInteger("2147483648");
//        System.out.println(bigInteger);
//    }
//}

/*BigInteger类成员方法
public BigInteger add(BigInteger val)：加
public BigInteger subtract(BigInteger val)：减
public BigInteger multiply(BigInteger val)：乘
public BigInteger divide(BigInteger val)：除
public BigInteger[] divideAndRemainder(BigInteger val)：返回商和余数的数组
*/
public class BigIntegerDemo{
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("100");
        BigInteger bigInteger1 = new BigInteger("50");
        System.out.println(bigInteger.add(bigInteger1));
        System.out.println(bigInteger.subtract(bigInteger1));
        System.out.println(bigInteger.multiply(bigInteger1));
        System.out.println(bigInteger.divide(bigInteger1));

        BigInteger[]bis = bigInteger.divideAndRemainder(bigInteger1);
        System.out.println("商"+bis[0]);
        System.out.println("余数"+bis[1]);
    }
}
