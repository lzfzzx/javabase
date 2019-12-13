package ThreadDemo;

import java.util.Date;

/**
 * Created by Lzf on 2018/10/9.
 */
/*线程控制
public static void sleep(long millis)：线程休眠
public final void join()：线程加入
public static void yield()：线程礼让
public final void setDaemon(boolean on)：后台线程
public final void stop()：中断线程
public void interrupt()：中断线程
*/
//public static void sleep(long millis)：线程休眠
public class ThreadSleepDemo {
    public static void main(String[] args) {
        ThreadSleep ts1 = new ThreadSleep();
        ThreadSleep ts2 = new ThreadSleep();

        ts1.setName("葫芦娃");
        ts2.setName("救爷爷");

        ts1.start();
        ts2.start();
    }
}

class ThreadSleep extends Thread{
    @Override
    public void run(){
        for (int i = 0; i <100 ; i++) {
            System.out.println(getName()+":"+i+",日期："+new Date());
//            睡眠一秒钟
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}