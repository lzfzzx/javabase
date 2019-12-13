package ThreadDemo;

/**
 * Created by Lzf on 2018/10/9.
 */
/*多线程的概述
  学习多线程，我们先来了解一下进程的概念
进程
正在运行的程序，是系统进行资源分配和调用的独立单位。
每一个进程都有它自己的内存空间和系统资源。
  说起线程，它又分为单线程和多线程
线程
是进程中的单个顺序控制流，是一条执行路径
一个进程如果只有一条执行路径，则称为单线程程序
一个进程如果有多条执行路径，则称为多线程程序
多线程的实现（1）
  如何实现多线程的程序呢?
  由于线程是依赖进程而存在的，所以我们应该先创建一个进程出来。而进程是由系统创建的，所以我们应该去调用系统功能创建一个进程。
  Java是不能直接调用系统功能的，所以，我们没有办法直接实现多线程程序。但是呢?Java可以去调用C/C++写好的程序来实现多线程程序。
  由C/C++去调用系统功能创建进程，然后由Java去调用这样的东西，然后提供一些类供我们使用。我们就可以实现多线程程序了。
*/
/*通过查看API，我们知道了有2中方式实现多线程程序。
方式1：继承Thread类
步骤
A:自定义类MyThread继承Thread类。
B:MyThread类里面重写run()
C:创建对象
D:启动线程 */
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();
        my1.start();
        my2.start();
    }
}
class MyThread extends Thread{
    @Override
    public  void  run(){
//        一般来说，被线程执行的代码肯定是比较耗时的，所以我们用循环改进
        for (int i = 0; i <100 ; i++) {
            System.out.println(i);

        }
    }
}
/*这样我们就创建并启动了两个线程
  start()方法：首先启动了线程，然后再由jvm去调用该线程的run()方法。
  那么，我们在继承Thread类之后，为什么要重写run()方法呢?
  因为不是类中的所有代码都需要被线程执行的。而这个时候，为了区分哪些代码能够被线程执行，java提供了Thread类中的run()用来包含那些被线程执行的代码。
*/