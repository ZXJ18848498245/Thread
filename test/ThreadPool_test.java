import thread_demo.MyRunnable;
import thread_demo.MyRunnable2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool_test {
    public static void main(String[] args) {
        //创建线程池对象
        ExecutorService service = Executors.newFixedThreadPool(2);
        //创建Runnable实例对象
        MyRunnable2 r = new MyRunnable2();
        //从线程池中获取线程对象，然后调用MyRunnable中的run（）
        service.submit(r);
        service.submit(r);
        service.submit(r);

        // 注意：submit方法调用结束后，程序并不终止，是因为线程池控制了线程的关闭。
         // 将使用完的线程又归还到了线程池中
        //service.shutdown();

    }
}
