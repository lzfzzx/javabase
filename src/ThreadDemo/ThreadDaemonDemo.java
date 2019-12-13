package ThreadDemo;

/**
 * Created by Lzf on 2018/10/9.
 */
/*public final void setDaemon(boolean on)：守护线程*/
public class ThreadDaemonDemo {
    public static void main(String[] args) {
        ThreadDaemon td1 = new ThreadDaemon();
        ThreadDaemon td2 = new ThreadDaemon();
        td1.setName("关羽");
        td2.setName("张飞");
//       设置守护线程
        td1.setDaemon(true);
        td2.setDaemon(true);
        td1.start();
        td2.start();

        Thread.currentThread().setName("刘备");
        for (int i = 0; i <5 ; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}

class ThreadDaemon extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
        }
    }
}
/*运行程序可以看到，当刘备执行完5次后，张飞和关于也会执行完，并不会执行100次。
将该线程标记为守护线程或用户线程。
当正在运行的线程都是守护线程时，Java 虚拟机退出。
该方法必须在启动线程前调用。*/