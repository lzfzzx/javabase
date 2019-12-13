package ThreadDemo;

/**
 * Created by Lzf on 2018/10/10.
 */
/*某电影院目前正在上映贺岁大片，共有100张票，而它有3个售票窗口售票，请设计一个程序模拟该电影院售票。*/
//    继承Thread类
//public class SellTicketDemo {
//    public static void main(String[] args) {
//        SellTicket st1 = new SellTicket();
//        SellTicket st2 = new SellTicket();
//        SellTicket st3 = new SellTicket();
////        给线程对象起名
//        st1.setName("窗口1");
//        st2.setName("窗口2");
//        st3.setName("窗口3");
////        启动线程
//        st1.start();
//        st2.start();
//        st3.start();
//    }
//
//}
//
//class SellTicket extends Thread{
////    定义100张票
//    private static  int tickets =100;
//    @Override
//    public void run(){
//        while (tickets>0){
//
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(getName()+"正在出售第"+tickets+"张票");
//                tickets--;
//
//        }
//    }
//}
/*相同的票出现多次
CPU的一次操作必须是原子性的
还出现了负数的票
随机性和延迟导致的*/

/*这里就牵扯到了线程的安全问题，线程安全问题在理想状态下，不容易出现，但一旦出现对软件的影响是非常大的。
多线程安全问题
  如何解决多线程安全问题呢?
  把多个语句操作共享数据的代码给锁起来，让任意时刻只能有一个线程执行即可。
解决线程安全问题实现(1)
同步代码块
格式：
synchronized(对象){ 需要同步的代码; }
同步可以解决安全问题的根本原因就在那个对象上。该对象如同锁的功能。
  我们多上面售票的代码进行改进
*/
public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicket st1 = new SellTicket();
        SellTicket st2 = new SellTicket();
        SellTicket st3 = new SellTicket();
//        给线程对象起名
        st1.setName("窗口1");
        st2.setName("窗口2");
        st3.setName("窗口3");
//        启动线程
        st1.start();
        st2.start();
        st3.start();
    }

}

class SellTicket extends Thread{
    //    定义100张票
    private static  int tickets =100;
//    创建锁对象
//    private Object obj = new Object();
    @Override
    public void run(){
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this){
            if (tickets>0){
            System.out.println(getName()+"正在出售第"+tickets+"张票");

            tickets--;

            }else break;
        }
        }
    }
}