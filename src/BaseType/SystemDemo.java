package BaseType;

/**
 * Created by Lzf on 2018/9/26.
 */
/*System类


System类概述
System 类包含一些有用的类字段和方法。它不能被实例化。
成员方法
public static void gc()：运行垃圾回收器。
public static void exit(int status)：终止当前正在运行的 Java 虚拟机。参数用作状态码；根据惯例，非 0 的状态码表示异常终止。
public static long currentTimeMillis()：返回以毫秒为单位的当前时间
public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)：
从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。



  System.gc()可用于垃圾回收。
  当使用System.gc()回收某个对象所占用的内存之前，通过要求程序调用适当的方法来清理资源。
  在没有明确指定资源清理的情况下，Java提高了默认机制来清理该对象的资源，就是调用Object类的finalize()方法。
  finalize()方法的作用是释放一个对象占用的内存空间时，会被JVM调用。
  而子类重写该方法，就可以清理对象占用的资源，该方法有没有链式调用，所以必须手动实现。
  执行System.gc()前，系统会自动调用finalize()方法清除对象占有的资源，
  通过super.finalize()方式可以实现从下到上的finalize()方法的调用，即先释放自己的资源，再去释放父类的资源。
  但是，不要在程序中频繁的调用垃圾回收，因为每一次执行垃圾回收，
  jvm都会强制启动垃圾回收器运行，这会耗费更多的系统资源，会与正常的Java程序运行争抢资源，
  只有在执行大量的对象的释放，才调用垃圾回收最好
*/
public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("123");
        System.exit(0);
        System.out.println("456");
//         System.exit(0);正常终止当前正在运行的虚拟机
        }
    }

